/*
 * Created By Safe_IT23
 */
package StackAndQueue;

import java.util.LinkedList;

/**
 *
 * @author jatawatsafe
 */
public class TestStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Size: "+stack.size());
    }
}
