package accessmode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yi on 4/18/2016.
 *
 */
public class PhysicalBlockBuff extends BlockBuff {
    public static int SUBLIST_SIZE = 10240;
    private LinkedHashMap<String, ArrayList<ArrayList<String>>> buff;

    public PhysicalBlockBuff(){
        buff = new LinkedHashMap<>();
    }

    public void addValue(String columnName, String value){
        if (!buff.containsKey(columnName)){
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            ArrayList<String> sublist = new ArrayList<>(SUBLIST_SIZE);
            sublist.add(value);
            list.add(sublist);
            buff.put(columnName, list);
        }else{
            ArrayList<ArrayList<String >> list = buff.get(columnName);
            ArrayList<String> sublist = list.get(list.size() - 1);
            if (sublist.size() == SUBLIST_SIZE){
                ArrayList<String> newSubList = new ArrayList<>(SUBLIST_SIZE);
                newSubList.add(value);
                list.add(newSubList);
            }else{
                sublist.add(value);
            }
        }
    }

    public void print(){
        for (ArrayList<ArrayList<String>> list: buff.values()){
            for (ArrayList<String> subList: list){
                for (String s: subList){
                    System.out.println(s);
                }
            }
        }
    }

    public void addValueList(String columnName, ArrayList<String> subList){
        if (buff.containsKey(columnName)){
            buff.get(columnName).add(subList);
        }else{
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            list.add(subList);
            buff.put(columnName, list);
        }
    }

    public void merge(PhysicalBlockBuff other){
        if ((null == other) || (other.buff.size() == 0)){
            return;
        }
        if (this.buff.size() == 0){
            this.buff = other.buff;
            return;
        }
        if ((this.buff.size() != other.buff.size())){
            System.out.println("Can not merge to block with different number of columns\n");
            return;
        }

        for (Map.Entry<String, ArrayList<ArrayList<String>>> entry: this.buff.entrySet()){
            String key = entry.getKey();
            if (!other.buff.containsKey(key)){
                System.out.println("Can not merge to block with different values of columns\n");
                return;
            }
            for (ArrayList<String> sublist: other.buff.get(key)){
                this.addValueList(key, sublist);
            }
        }
    }

    public PhysicalBlockBuff blockNestedLoopJoin(String selfAttr, String otherAttr, PhysicalBlockBuff other){
        PhysicalBlockBuff physicalBlockBuff = new PhysicalBlockBuff();
        ArrayList<ArrayList<String>> selfValueList = this.buff.get(selfAttr);
        ArrayList<ArrayList<String>> otherValueList = other.buff.get(otherAttr);

        int selfSubListIndex = 0;
        for (ArrayList<String> selfSubList: selfValueList){
            int selfValueIndex = 0;
            for (String s: selfSubList){


                int otherSubListIndex = 0;
                for (ArrayList<String> otherSubList: otherValueList){
                    int otherValueIndex = 0;
                    for (String l: otherSubList){

                        if (s.equals(l)){
                            for (String selfKey: this.buff.keySet()){
                                physicalBlockBuff.addValue(selfKey, this.buff.get(selfKey).get(selfSubListIndex).get(selfValueIndex));
                            }
                            for (String otherKey: other.buff.keySet()){
                                physicalBlockBuff.addValue(otherKey, other.buff.get(otherKey).get(otherSubListIndex).get(otherValueIndex));
                            }
                        }

                        otherValueIndex++;
                    }
                    otherSubListIndex++;
                }


                selfValueIndex++;
            }
            selfSubListIndex++;
        }

        return physicalBlockBuff;
    }
}
