/*
 * Created By Safe_IT23
 */
package Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jatawatsafe
 */
public class TestBSTbySet {
    public static void main(String[] args) {
        Set<Student> x = new TreeSet();
        x.add(new Student(1, "A"));
        x.add(new Student(2, "B"));
        x.add(new Student(3, "C"));
        x.add(new Student(4, "D"));
        x.add(new Student(5, "E"));
        x.add(new Student(5, "F"));
        //Display
        System.out.println(x);
        Student std1 = new Student(3, "xxxx");
        System.out.printf("Has 3 : %b\n",x.contains(std1));
    }
}

class Student implements Comparable<Student>, Comparator<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Student student) {
        //Use - because if use = it will replace the id
        return this.id - student.getId();
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
    
    
}
