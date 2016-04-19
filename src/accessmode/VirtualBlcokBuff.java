package accessmode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Yi on 4/18/2016.
 *
 */
public class VirtualBlcokBuff extends BlockBuff{
    LinkedHashMap<String, HashMap<PhysicalBlockBuff, ArrayList>> buff;

    public VirtualBlcokBuff(){
        buff = new LinkedHashMap<>();
    }
}
