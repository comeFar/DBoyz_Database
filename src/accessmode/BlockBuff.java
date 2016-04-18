package accessmode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yi on 4/18/2016.
 *
 */
public class BlockBuff {
    private LinkedHashMap<String, ArrayList<ArrayList<String>>> buff;

    public BlockBuff(){
        buff = new LinkedHashMap<>();
    }

    public void addValue(String columnName, String value){
        if (buff.containsKey(columnName)){
            buff.get(columnName).get(0).add(value);
        }else{
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            ArrayList<ArrayList<String>> parList = new ArrayList<>();
            parList.add(list);
            buff.put(columnName, parList);
        }
    }

    public void addValueList(String columnName, ArrayList<String> list){
        if (buff.containsKey(columnName)){
            buff.get(columnName).add(list);
        }else{
            ArrayList<ArrayList<String>> parList = new ArrayList<>();
            parList.add(list);
            buff.put(columnName, parList);
        }
    }

    public void merge(BlockBuff other){
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
            for (ArrayList<String> list: other.buff.get(key)){
                this.addValueList(key, list);
            }
        }
    }

    public BlockBuff blockNestedLoopJoin(String selfAttr, String otherAttr, BlockBuff other){
        BlockBuff blockBuff = new BlockBuff();
        ArrayList<ArrayList<String>> selfValueList = this.buff.get(selfAttr);
        ArrayList<ArrayList<String>> otherValueList = other.buff.get(otherAttr);

        for (ArrayList<String> list: selfValueList){
            for (String s: list){
                int listIndex = 0;
                for (ArrayList<String> otherList: otherValueList){
                    int valueIndex = 0;
                    for (String l: otherList){
                        if (s.equals(l)){
                            for (Map.Entry<String, ArrayList<ArrayList<String>>> entry: other.buff.entrySet()){
                                String key = entry.getKey();
                                String v = entry.getValue().get(listIndex).get(valueIndex);
                                this.addValue(key, v);
                            }
                        }
                        valueIndex++;
                    }
                    listIndex++;
                }
            }
        }

        return blockBuff;
    }
}
