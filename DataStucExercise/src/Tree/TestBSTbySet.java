/*
 * Created By Safe_IT23
 */
package Tree;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jatawatsafe
 */
public class TestBSTbySet {
    public static void main(String[] args) {
        Set<String> x = new TreeSet();
        x.add("A");
        x.add("B");
        x.add("C");
        x.add("D");
        x.add("E");
        x.add("F");
        x.add("G");
        x.add("H");
        //Display
        System.out.println(x);
        System.out.printf("Has G : %b\n",x.contains("G"));
    }
}
