/*
 * Created By Safe_IT23
 */
package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jatawatsafe
 */
class PositionList implements Comparable<PositionList>{
    int key;
    List<Integer> positions = new ArrayList();
    
    public PositionList(int key, int position){
        this.key = key;
        this.positions.add(position);
    }
    
    public void addPosition(int position){
        this.positions.add(position);
    }

    @Override
    public int compareTo(PositionList o) {
        //Decreasing
        int first = o.positions.size() - this.positions.size();
        if(first !=0){
            return first;
        }
        //Display Value higher
        return o.key - this.key;
        //Display Value lower
        //return this.key - o.key;
    }
    
    @Override
    public String toString(){
        return String.format("%d (%d) : %s",this.key,this.positions.size(),this.positions);
    }
}

public class TopMostNumber {
    public static String getTopMostNumber(int[] numbers) {
        Map<Integer,PositionList> frequency = new HashMap();
        int key;
        for (int i = 0; i < numbers.length; i++) {
            key = numbers[i];
            if (frequency.get(key)==null) {
                frequency.put(key, new PositionList(key, i));
            }else{
                frequency.get(key).addPosition(i);
            }
        }
        List<PositionList> list = new ArrayList(frequency.values());
        Collections.sort(list);
        
        //Display Data
        /**/
        for (PositionList positionList : list) {
            System.out.println(positionList.toString());
        }
        System.out.println("\n\n");
        /**/

        return list.get(0).toString();
    }
}
