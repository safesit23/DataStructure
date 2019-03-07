/*
 * Created By Safe_IT23
 */
package Practice1;

import java.io.FileNotFoundException;

/**
 *
 * @author jatawatsafe
 */
public class TestWord {
    public static void main(String[] args) {
        try {
            Frequency frequency = new Frequency();
            frequency.countProcess("/Users/jatawatsafe/NetBeansProjects1/DataStructure/DataStucExercise/src/Algorithm/WordFrequency/data.txt");
            
            System.out.println(frequency);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
