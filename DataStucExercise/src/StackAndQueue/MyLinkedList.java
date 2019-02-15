/*
 * Created By Safe_IT23
 */
package StackAndQueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author jatawatsafe
 */
public class MyLinkedList <E> implements QueueInterface<E>,StackInterface<E>{
    private LinkedList<E> data;
    private int size;
    
    public MyLinkedList(){
        data = new LinkedList();
    }

    @Override
    public void enqueue(E e) {
        data.add(e);
        size++;
    }

    @Override
    public E dequeue() {
        if(data!=null){
            E front = data.getFirst();
            data.removeFirst();
            size--;
            return front;
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void push(E e) {
        data.add(e);
        size++;
    }

    @Override
    public E pop() {
        if(size!=0){
            E peek = peek();
            data.remove(size-1);
            size--;
            return peek;    
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
    }
    
    public E peek(){
        if(size!=0){
            return data.getLast();
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
    }
    
    public E getFront(){
        if(size!=0){
            return data.getFirst();       
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
        
    }

    public String allData(){
        String allData = "";
        if(size!=0){
            for(int i=0;i<size;i++){
                allData = allData + data.get(i)+" ";
            }
        }else{
            allData = null;
        }
        return allData;
    }
    
}
