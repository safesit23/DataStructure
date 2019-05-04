/*
 * Created By Safe_IT23
 */
package PracticeProblem;

import java.util.PriorityQueue;

/**
 * @author jatawatsafe 
 * Practice04 : Patient in Hospital
 * Level: Intermediate
 */
public class TestPatient {
    public static void main(String[] args) {
        //Create Priority Queue with Comparartor
        PriorityQueue pq = new PriorityQueue(20, Patient.freqDescending);
        Patient p1 = new Patient("A", 66, 'M', 9);
        Patient p2 = new Patient("B", 45, 'M', 3);
        Patient p3 = new Patient("C", 30, 'F', 6);
        Patient p4 = new Patient("D", 15, 'F', 8);
        Patient p5 = new Patient("E", 24, 'M', 8);
        Patient p6 = new Patient("F", 15, 'F', 10);
        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);
        pq.add(p5);
        pq.add(p6);
        
        System.out.println("Display First Queue: ");
        System.out.printf("First Queue: %s\n\n",pq.peek());
        
        System.out.println("Call Queue: ");
        for (int i=1; pq.size()>0; i++) {
            System.out.printf("%d: %s\n",i,pq.poll());
        }
    }
}
