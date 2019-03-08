/*
 * Created By Safe_IT23
 */
package Algorithm.FindMode;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author jatawatsafe
 */
public class Number implements Comparable<Number>{
    private int num;
    private LinkedList<Integer> indexPosition;
    //To Compare Frequency
    public static ComparatorFrequency compareFrequency = new ComparatorFrequency();
    
    private static class ComparatorFrequency implements Comparator<Number>{
        @Override
        public int compare(Number o1, Number o2) {
            return o1.getFrequency() - o2.getFrequency();
        }
    }

    public Number(int num, int index) {
        this.num = num;
        indexPosition = new LinkedList();
        indexPosition.add(index);
    }
    
    public void addIndexPosition(int index){
        indexPosition.add(index);
    }
    
    
    public int getFrequency(){
        return indexPosition.size();
    }
    
    
    //To compare with another number
    @Override
    public int compareTo(Number o) {
        return this.num - o.num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public LinkedList<Integer> getIndexPosition() {
        return indexPosition;
    }

    public void setIndexPosition(LinkedList<Integer> indexPosition) {
        this.indexPosition = indexPosition;
    }
    
    

    @Override
    public String toString() {
        //return number (Freq) : [index,index,index]
        return String.format("%d (%d) : %s", num, getFrequency(), getIndexPosition().toString());
    }
    
    
}
