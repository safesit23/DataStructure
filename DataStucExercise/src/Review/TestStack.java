/*
 * Created By Safe_IT23
 */
package Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jatawatsafe
 */
public class TestStack {
    public static void main(String[] args) {
        testHash();
    }
    
    public static void testList(){
        //1 ArrayList
        List list = new ArrayList();
        list.set(0, "aa");
        list.add("atLast");
        list.get(0);
        int index = list.indexOf("aa");
        
        //2 LinkedList
        List list2 = new LinkedList();
    }
    
    public static void testHash(){
        Map<Integer,String> warehouse = new HashMap();
        warehouse.put(1, "AAAA");
        warehouse.put(2, "BBB");
        warehouse.put(3, "CCCC");
        List<String> all = new LinkedList(warehouse.values());
        for (String element : all) {
            System.out.println(element);
        }
    }
}
