/*
 * Created By Safe_IT23
 */
package Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jatawatsafe
 */
public class ArrayOperation {
    public static void main(String[] args) {
        
    }
    
    public static Object[] arrayIntersection(Object[] obj1, Object[] obj2) {
        return arrayIntersection(obj1, obj2, null);
    }

    public static Object[] arrayIntersection(Object[] obj1, Object[] obj2, Comparator c) {
        Set setA, setB;
        //Check that have comparator or not ?
        if(c == null){
            setA = new TreeSet();
            setB = new TreeSet();
        }else{
            //Have Comparator: We use comparator
            setA = new TreeSet(c);
            setB = new TreeSet(c);
        }
        //Add Array to set
        //How to convert array to Collection 
        setA.addAll(Arrays.asList(obj1));
        setB.addAll(Arrays.asList(obj2));
        //Intersect and keep in setA
        setA.retainAll(setB);
        //Return as Array use method toArray
        return setA.toArray();
    }
    
    public static Object[] arrayUnion(Object[] obj1, Object[] obj2) {
        return arrayUnion(obj1, obj2, null);
    }

    public static Object[] arrayUnion(Object[] obj1, Object[] obj2, Comparator c) {
        Set setA, setB;
        //Check that have comparator or not ?
        if(c == null){
            setA = new TreeSet();
            setB = new TreeSet();
        }else{
            //Have Comparator: We use comparator
            setA = new TreeSet(c);
            setB = new TreeSet(c);
        }
        setA.addAll(Arrays.asList(obj1));
        setA.addAll(Arrays.asList(obj2));
        
        return setA.toArray();
    }
}
