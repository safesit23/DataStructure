/*
 * Created By Safe_IT23
 */
package Example2LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jatawatsafe
 */
public class TestList {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList();
        studentList.add(new Student(1001, "A"));
        studentList.add(new Student(1002, "B"));
        studentList.add(new Student(1003, "C"));
        studentList.add(new Student(1004, "D"));
        
        Student x = new Student(1003, "C");
        
        int pos = studentList.indexOf(x);
        System.out.println("pos = "+pos);
    }
}
