package accessmode;

import output_generator.BuffIterator;

import java.util.*;

/**
 * Created by Yi on 4/18/2016.
 *
 */
public class PhysicalBlockBuff extends BlockBuff {
    public static int SUBLIST_SIZE = 10240;
    public static int BLOCK_NESTED_JOIN = 1;
    public static int MERGE_JOIN = 2;
    public static int HASH_JOIN = 3;

    private LinkedHashMap<String, ArrayList<ArrayList<String>>> buff;
    private LinkedHashMap<String, LinkedHashMap<String, LinkedList<BuffIndex>>> buffIndex;

    public PhysicalBlockBuff(){
        buff = new LinkedHashMap<>();
        buffIndex = new LinkedHashMap<>();
    }

    public LinkedHashMap<String, ArrayList<ArrayList<String>>> getBuff(){
        return this.buff;
    }

    public LinkedList<int[]> getValueIndex(String columnName, String value){
        LinkedList<int[]> list = new LinkedList<>();
        if (buffIndex.containsKey(columnName)){
            LinkedHashMap<String, LinkedList<BuffIndex>> columnIndex = buffIndex.get(columnName);
            if (columnIndex.containsKey(value)){
                for (BuffIndex bi: columnIndex.get(value)){
                    for (int[] addr: bi.index){
                        int[] newAddr = new int[2];
                        newAddr[0] = addr[0] + bi.shift;
                        newAddr[1] = addr[1];
                        list.add(newAddr);
                    }
                }
            }

        }
        return list;
    }

    public void addValue(String columnName, String value, boolean needIndex){
        int[] res = addValueToBuff(columnName, value);
        if (needIndex){
            addValueIndex(columnName, value, res);
        }
    }

    private int[] addValueToBuff(String columnName, String value){
        int[] address = new int[2];
        if (!buff.containsKey(columnName)){
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            ArrayList<String> sublist = new ArrayList<>(SUBLIST_SIZE);
            sublist.add(value);
            list.add(sublist);
            buff.put(columnName, list);

            address[0] = 0;
            address[1] = 0;
        }else{
            ArrayList<ArrayList<String >> list = buff.get(columnName);
            ArrayList<String> sublist = list.get(list.size() - 1);
            if (sublist.size() == SUBLIST_SIZE){
                ArrayList<String> newSubList = new ArrayList<>(SUBLIST_SIZE);
                newSubList.add(value);
                list.add(newSubList);

                address[0] = list.size() - 1;
                address[1] = 0;
            }else{
                sublist.add(value);

                address[0] = list.size() - 1;
                address[1] = sublist.size() - 1;
            }
        }
        return address;
    }

    private void addValueIndex(String columnName, String value, int[] address){
        if (buffIndex.containsKey(columnName)){
            LinkedHashMap<String, LinkedList<BuffIndex>> columnIndex = buffIndex.get(columnName);
            if (columnIndex.containsKey(value)){
                LinkedList<BuffIndex> list = columnIndex.get(value);
                list.get(list.size()-1).add(address);
            }else{
                BuffIndex bi = new BuffIndex(0);
                bi.add(address);
                LinkedList<BuffIndex> list = new LinkedList<>();
                list.add(bi);
                columnIndex.put(value, list);
            }
        }else{
            LinkedHashMap<String, LinkedList<BuffIndex>> columnIndex = new LinkedHashMap<>();
            LinkedList<BuffIndex> valueIndex = new LinkedList<>();
            BuffIndex bi = new BuffIndex(0);
            bi.add(address);
            valueIndex.add(bi);
            columnIndex.put(value, valueIndex);
            buffIndex.put(columnName, columnIndex);
        }
    }

    private void addBuffIndex(String columnName, BuffIndex bi, String key){
        if (this.buffIndex.containsKey(columnName)){
            LinkedHashMap<String, LinkedList<BuffIndex>> columnIndex = this.buffIndex.get(columnName);
            if (columnIndex.containsKey(key)){
                columnIndex.get(key).add(bi);
            }else{
                LinkedList<BuffIndex> list = new LinkedList<>();
                list.add(bi);
                columnIndex.put(key, list);
            }
        }else{
            LinkedHashMap<String, LinkedList<BuffIndex>> columnIndex = new LinkedHashMap<>();
            LinkedList<BuffIndex> list = new LinkedList<>();
            list.add(bi);
            columnIndex.put(key, list);
            this.buffIndex.put(columnName, columnIndex);
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

    public boolean isEmpty(){
        if (buff.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    private void addValueList(String columnName, ArrayList<String> subList){
        ArrayList<ArrayList<String>> list;
        if (buff.containsKey(columnName)){
            list = buff.get(columnName);
            list.add(subList);
        }else{
            list = new ArrayList<>();
            list.add(subList);
            buff.put(columnName, list);
        }
    }

    private void mergeBuffIndex(String columnName, LinkedHashMap<String, LinkedHashMap<String, LinkedList<BuffIndex>>> otherIndex, int offset){
        LinkedHashMap<String, LinkedList<BuffIndex>> columnIndex = otherIndex.get(columnName);
        for (Map.Entry<String, LinkedList<BuffIndex>> entry: columnIndex.entrySet()){
            for (BuffIndex bi: entry.getValue()){
                bi.shift = offset;
                addBuffIndex(columnName, bi, entry.getKey());
            }
        }
    }

    public void merge(PhysicalBlockBuff other){
        if ((null == other) || (other.buff.size() == 0)){
            return;
        }
        if (this.buff.size() == 0){
            this.buff = other.buff;
            this.buffIndex = other.buffIndex;
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
            int offset = entry.getValue().size();
            for (ArrayList<String> sublist: other.buff.get(key)){
                this.addValueList(key, sublist);
            }
            mergeBuffIndex(key, other.buffIndex, offset);
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
                                physicalBlockBuff.addValue(selfKey, this.buff.get(selfKey).get(selfSubListIndex).get(selfValueIndex), true);
                            }
                            for (String otherKey: other.buff.keySet()){
                                physicalBlockBuff.addValue(otherKey, other.buff.get(otherKey).get(otherSubListIndex).get(otherValueIndex), true);
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

    public PhysicalBlockBuff mergeJoin(String selfAttr, String otherAttr, PhysicalBlockBuff other){
        PhysicalBlockBuff physicalBlockBuff = new PhysicalBlockBuff();
        ArrayList<ArrayList<String>> selfValueList = this.buff.get(selfAttr);
        ArrayList<ArrayList<String>> otherValueList = other.buff.get(otherAttr);

        BuffIterator selfItr = new BuffIterator(selfValueList);
        BuffIterator otherItr = new BuffIterator(otherValueList);

        while(true){
            if (!selfItr.hasNext() || !otherItr.hasNext()){
                break;
            }
            //currently only support join by int value
            int selfValue = Integer.parseInt(selfItr.next());
            int otherValue = Integer.parseInt(otherItr.next());
//            if (selfAttr > otherValue){
//
//            }
        }
        return physicalBlockBuff;
    }

    public PhysicalBlockBuff hashJoin(String selfAttr, String otherAttr, PhysicalBlockBuff other){
        PhysicalBlockBuff physicalBlockBuff = new PhysicalBlockBuff();
        ArrayList<ArrayList<String>> selfSubList = this.buff.get(selfAttr);

        int selfSubListIndex = 0;
        for (ArrayList<String> list: selfSubList){
            int selfValueIndex = 0;
            for (String s: list){
                LinkedList<int[]> indexes = other.getValueIndex(otherAttr, s);
                if (indexes.size() != 0){
                    for (String selfKey: this.buff.keySet()){
                        physicalBlockBuff.addValue(selfKey, this.buff.get(selfKey).get(selfSubListIndex).get(selfValueIndex), true);
                    }
                    for (int[] addr: indexes){
                        for (String otherKey: other.buff.keySet()){
                            physicalBlockBuff.addValue(otherKey, other.buff.get(otherKey).get(addr[0]).get(addr[1]), true);
                        }
                    }
                }
                selfValueIndex++;
            }
            selfSubListIndex++;
        }

        return physicalBlockBuff;
    }
}
