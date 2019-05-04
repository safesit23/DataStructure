/*
 * Created By Safe_IT23
 */
package PracticeProblem;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author jatawatsafe 
 * Practice02 : Find The maximum Grade : 3rd Order
 * Level: Easy
 */
public class E_FindThirdGrade {

    public static void main(String[] args) {
        testSet1();
        testSet2();
        testSet3();

    }

    static class GradeComparator implements Comparator<Double> {
        @Override
        public int compare(Double o1, Double o2) {
            return o2.compareTo(o1);
        }
    }
    
    public static String maxGrade(Set grade){
        if(grade.size()>=3){
            Object[] list = grade.toArray();
            return String.format("%-2s", list[2]);
        }else{
            return "no 3rd";
        }
    }

    public static void testSet1() {
        Set grade = new TreeSet(new GradeComparator());
        grade.add(3.25);
        grade.add(3.5);
        grade.add(2.8);
        grade.add(1.9);
        grade.add(2.25);
        grade.add(2.0);
        grade.add(3.65);
        System.out.println(grade.toString());
        System.out.printf("Output: %s\n", maxGrade(grade));
    }
    public static void testSet2() {
        Set grade = new TreeSet(new GradeComparator());
        grade.add(3.5);
        grade.add(3.5);
        grade.add(2.8);
        grade.add(1.9);
        grade.add(2.25);
        grade.add(2.0);
        grade.add(3.5);
        System.out.println(grade.toString());
        System.out.printf("Output: %s\n", maxGrade(grade));
    }
    
    public static void testSet3() {
        Set grade = new TreeSet(new GradeComparator());
        grade.add(3.5);
        grade.add(3.5);
        grade.add(3.5);
        grade.add(3.5);
        grade.add(3.5);
        grade.add(3.5);
        grade.add(3.5);

        System.out.println(grade.toString());
        System.out.printf("Output: %s\n", maxGrade(grade));
    }
    
}
