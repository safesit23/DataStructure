/*
 * Created By Safe_IT23
 */
package Algorithm.FindMode;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author jatawatsafe
 */
public class FindMode {
    public static String findMode(int[] numbers){
        Map<Integer,Number> collectData = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            //If in Map has this Number ==> add index
            if(collectData.containsKey(numbers[i])){
                collectData.get(numbers[i]).addIndexPosition(i);
            }else{  //Not have put into map
                collectData.put(numbers[i], new Number(numbers[i], i));
            }
        }
        //get list from map.values
        LinkedList<Number> list = new LinkedList(collectData.values());
        //Sort by Number fisrt
        Collections.sort(list);
        //Sort by Frequency
        Collections.sort(list, Number.compareFrequency);
        //System.out.println(list);
        //Last of list is most frequency
        Number topMostNumber = list.getLast();
        return topMostNumber.toString();
    }
}
