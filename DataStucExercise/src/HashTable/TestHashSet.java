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
        //testHashCode1();
        testHashCode2();
    }
    
    static void testHashCode2(){
        Set<NewStudent> st = new HashSet<>();
        st.add(new NewStudent(1001, "Somchai"));
        st.add(new NewStudent(1002, "Somsri"));
        st.add(new NewStudent(1003, "Somkiet"));
        NewStudent ns = new NewStudent(1002, "Somsri");
        NewStudent ns2 = new NewStudent(1002, "Somsri");
        System.out.println("ns: "+ns.hashCode());
        System.out.println("ns2: "+ns2.hashCode());
        System.out.println("Is st contains ns? :"+st.contains(ns));
    }
    
    static void testHashCode1(){
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

class NewStudent{
    private int id;
    private String name;

    public NewStudent(int id, String name) {
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
    
    
}
