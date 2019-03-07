/*
 * Created By Safe_IT23
 */
package sitspace;

import java.util.Comparator;

/**
 *
 * @author jatawatsafe
 */
public class Astronomer implements Comparable<Astronomer>{
    private int id;
    private String name;
    private int age;
    public static OrderName orderName = new OrderName();
    public static OrderAge orderAge = new OrderAge();
    
    private static class OrderName implements Comparator<Astronomer>{
        @Override
        public int compare(Astronomer o1, Astronomer o2) {
            return o1.name.compareTo(o2.name);
        }
        
    }
    
    private static class OrderAge implements Comparator<Astronomer>{
        @Override
        public int compare(Astronomer o1, Astronomer o2) {
            return o1.getAge() - o2.getAge();
        }
        
    }
    
    @Override
    public int compareTo(Astronomer o) {
        return this.id - o.id;
    }
    
    public Astronomer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Astronomer{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
    
    
}
