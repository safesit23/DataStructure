/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProblem;

/**
 *
 * @author PROG
 */
public class TestStack {
    public static void main(String[] args) {
        test2();
    }
    public static void test1(){
        Stack<Integer> stack1 = new Stack();
        stack1.push(2);
        stack1.push(3);
        stack1.push(5);
        stack1.push(1);
        stack1.push(8);
        stack1.push(9);
        
        System.out.printf("size = %s\n",stack1.size());
        System.out.printf("pop = %s\n",stack1.pop());
        System.out.printf("peek = %s\n",stack1.peek());
        System.out.printf("pop = %s\n",stack1.pop());
        
        System.out.printf("findMin = %s\n",stack1.findMin());
        
        stack1.push(0);
        stack1.push(14);
        stack1.push(11);
        
        System.out.printf("findMin = %s\n",stack1.findMin());
        
        System.out.printf("pop = %s\n",stack1.pop());
        System.out.printf("pop = %s\n",stack1.pop());
        System.out.printf("pop = %s\n",stack1.pop());
        
        System.out.printf("findMin = %s\n",stack1.findMin());
    }
    
    public static void test2(){
        Stack<String> stack1 = new Stack();
        stack1.push("B");
        stack1.push("B");
        stack1.push("C");
        stack1.push("D");
        stack1.push("A");
        stack1.push("A");
        
        System.out.printf("size = %s\n",stack1.size());
        System.out.printf("pop = %s\n",stack1.pop());
        System.out.printf("pop = %s\n",stack1.pop());
        System.out.printf("peek = %s\n",stack1.peek());
        
        System.out.printf("findMin = %s\n",stack1.findMin());
        
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        
        System.out.printf("findMin = %s\n",stack1.findMin());
        
        System.out.printf("pop = %s\n",stack1.pop());
        
        System.out.printf("findMin = %s\n",stack1.findMin());
        System.out.printf("pop = %s\n",stack1.pop());
        System.out.printf("pop = %s\n",stack1.pop());
        
        System.out.printf("findMin = %s\n",stack1.findMin());
    }
}
