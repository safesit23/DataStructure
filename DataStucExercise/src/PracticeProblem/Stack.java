/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProblem;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author PROG
 */
public class Stack <E>{
    private LinkedList<E> data;
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
        if(min.isEmpty()){
            min.push(e);
        }else{
            if(isLessThan(e)){
                min.push(e);
            }else{
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
