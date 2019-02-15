/*
 * Created By Safe_IT23
 */
package StackAndQueue;

import java.util.NoSuchElementException;

/**
 *
 * @author jatawatsafe
 */
public class MyArray<E> implements QueueInterface<E>,StackInterface<E>{
    private E [] data;
    private int size;
    
    public MyArray(){
        data = (E[]) new Object[10];
    }
    
    public MyArray(int arraySize){
        data = (E[]) new Object[arraySize];
    }
    
    @Override
    public void enqueue(E e) {
        if(size==data.length){
            E[] newData = (E[]) new Object[size*4/3];
            for(int i=0;i<size;i++){
                newData[i] = data[i];
            }
            
            data = newData;
        }
        data[size] = e;
        size++;
    }

    @Override
    public E dequeue() {
        if(size!=0){
            E firstQueue = data[0];
            for(int i=0;i<size-1;i++){
                data[i] = data[i+1];
            }
            data[size-1]=null;
            size--;
            return firstQueue;
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
        if(size==data.length){
            E[] newData = (E[]) new Object[size*4/3];
            for(int i=0;i<size;i++){
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = e;
        size++;
    }

    @Override
    public E pop() {
        if(size!=0){
            E lastData = data[size-1];
            data[size-1] = null;
            size--;
            return lastData;
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
    }

    public E peek() {
        if(size!=0){
            return data[size-1];        
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
    }

    public E getFront() {
        if(size!=0){
            return data[0];      
        }else{
            throw new NoSuchElementException("NoSuchElement");
        }
    }
    
    //check Data
    public String allData(){
        String allData = "";
        if(size!=0){
            for(int i=0;i<size;i++){
                allData = allData + data[i]+" ";
            }
        }else{
            allData = null;
        }
        return allData;
    }
    
    
}
