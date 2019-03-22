/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author jatawatsafe
 */
public class TestPriorityQueue {
    public static void main(String[] args) {
        //intMinHeap();
        //intMaxHeap();
        testStudent();
    }
    
    public static void intMinHeap(){
        PriorityQueue<Integer> pq = new PriorityQueue(20); //capacity init = 11
        Random r = new Random();
        System.out.printf("Insert Process: ");
        for (int i = 0; i < 20; i++) {
            int x = r.nextInt(99);
            System.out.printf("%d ",x);
            pq.add(x);
        }
        System.out.printf("\nSize: %d\n",pq.size());
        System.out.printf("First item in queue: %d\n",pq.peek());
        System.out.printf("Data: %s\n",pq);
    }
    
    public static void intMaxHeap(){
        PriorityQueue<Integer> pq = new PriorityQueue(20, new MaxHeapComparator()); //capacity init = 11
        Random r = new Random();
        System.out.printf("Insert Process: ");
        for (int i = 0; i < 20; i++) {
            int x = r.nextInt(99);
            System.out.printf("%d ",x);
            pq.add(x);
        }
        System.out.printf("\nSize: %d\n",pq.size());
        System.out.printf("First item in queue: %d\n",pq.peek());
        System.out.printf("Data: %s\n",pq);
    }
    
    public static void useAnonymousComparator(){    //appropriate for use 1 time
        PriorityQueue<Integer> pq = new PriorityQueue(20, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }
    
    private static void testStudent(){
        PriorityQueue<Student> pq = new PriorityQueue();
        pq.add(new Student(1001, "A", 1.75));
        pq.add(new Student(1007, "C", 2.25));
        pq.add(new Student(1008, "D", 3.25));
        pq.add(new Student(1011, "E", 3.59));
        pq.add(new Student(1021, "F", 3.65));
        pq.add(new Student(1031, "G", 4.00));
        pq.add(new Student(1051, "H", 3.25));
        for (Student student : pq) {
            System.out.printf("%d : %.2f\n",student.id,student.gpax);
        }
        while(!pq.isEmpty()){
            System.out.printf("%.2f, ",pq.poll().gpax);
        }
        System.out.println("\b\b\n");
    }
}

class MaxHeapComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;
    double gpax;

    public Student(int id, String name, double gpax) {
        this.id = id;
        this.name = name;
        this.gpax = gpax;
    }

    @Override
    public int compareTo(Student o) {   //MaxHeap
        if(this.gpax < o.gpax){
            return 1;
        }else if(this.gpax > o.gpax){
            return -1;
        }else{
            return 0;
        }
    }
    
    
}

