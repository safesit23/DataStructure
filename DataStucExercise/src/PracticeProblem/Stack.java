/*
 * Created By Safe_IT23
 */
package PracticeProblem;

import java.util.LinkedList;

/**
 * @author jatawatsafe 
 * Practice03 : Stack has method findMin() with O(1) **using two stack inside
 * Level: Intermediate
 */
public class Stack <E>{
    private LinkedList<E> data;
    //keep min at the same time data
    private LinkedList<E> min;
    
    public Stack(){
        data = new LinkedList();
        min = new LinkedList();
    }
    
    public int size(){
        return data.size();
    }
    
    public void push(E e){
        data.push(e);
        //push same data in min
        if(min.isEmpty()){
            min.push(e);
        }else{
            //check if new one is min push this e
            if(isLessThan(e)){
                min.push(e);
            }else{
                //if new one is more than, must push the min again because 2 stack choose same number of elements 
                min.push(min.peek());
            }
        }
    }
    
    public E pop(){
        min.pop();
        return data.pop();
    }
    
    public E peek(){
        return data.peek();
    }
    
    
    public E findMin(){
        return min.peek();
    }

    public boolean isLessThan(E e){
        Comparable element = (Comparable) e;
        if(element.compareTo(min.peek()) < 0){
            return true;
        }else{
            return false;
        }
    }


}
