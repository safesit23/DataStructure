/*
 * Created By Safe_IT23
 */
package sitspace;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author jatawatsafe
 */
public class TestSitSpace {
    public static void main(String[] args) {
        List<Astronomer> data = new LinkedList();
        data.add(new Astronomer(1, "UrboyTJ", 28));
        data.add(new Astronomer(3, "Boy", 21));
        data.add(new Astronomer(2, "Hat", 45));
        data.add(new Astronomer(4, "Van", 67));
        //Type1
        System.out.println("No sort");
        System.out.println(data);
        //Type2
        System.out.println("Sort");
        Collections.sort(data);
        System.out.println(data);
        //Type3
        System.out.println("Sort by Name");
        Collections.sort(data,Astronomer.orderName);
        System.out.println(data);
        //Type4
        System.out.println("Sort by Age");
        Collections.sort(data,Astronomer.orderAge);
        System.out.println(data);
    }
}
