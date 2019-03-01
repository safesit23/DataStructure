/*
 * Created By Safe_IT23
 */
package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jatawatsafe
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Cat");
        s.add("Dog");
        s.add("Bird");
        s.add("Duck");
        //Display hashcode1
        System.out.println("Code: "+"Cat".hashCode());
        //Display hashcode2
        String x = new String("Cat");
        System.out.println("Code2: "+x.hashCode());
        //The same object must be same hashcode because it use to find
        
        System.out.println("Is set contain cat ? : "+s.contains("Cat"));
    }
}
