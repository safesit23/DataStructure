/*
 * Created By Safe_IT23
 */
package Algorithm.WordFrequency;

import java.io.FileNotFoundException;


/**
 *
 * @author jatawatsafe
 */
public class TestWordFrequency {
    public static void main(String[] args) {
        FrequencyCounter fc = new FrequencyCounter();
        try {
            fc.process("/Users/jatawatsafe/NetBeansProjects1/DataStructure/DataStucExercise/src/Algorithm/WordFrequency/data.txt");
            System.out.println(fc);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
            
    }
}
