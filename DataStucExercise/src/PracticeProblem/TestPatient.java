/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProblem;

import java.util.PriorityQueue;

/**
 *
 * @author PROG
 */
public class TestPatient {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(20, Patient.freqDescending);
        Patient p1 = new Patient("A", 66, 'M', 9);
        Patient p2 = new Patient("B", 45, 'M', 3);
        Patient p3 = new Patient("C", 30, 'F', 6);
        Patient p4 = new Patient("D", 15, 'F', 8);
        Patient p5 = new Patient("F", 15, 'F', 10);
        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);
        pq.add(p5);
        //display
        for (Object object : pq) {
            System.out.println(object);
        }
        System.out.printf("First Queue: %s\n",pq.peek());
        System.out.printf("Queue: %s\n",pq.poll());
        System.out.printf("Queue: %s\n",pq.poll());
        System.out.printf("Queue: %s\n",pq.poll());
        System.out.printf("Queue: %s\n",pq.poll());
    }
}
