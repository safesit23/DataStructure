/*
 * Created By Safe_IT23
 */
package StackAndQueue;

/**
 *
 * @author jatawatsafe
 */
public class MyArray<E> implements QueueInterface<E>,StackInterface<E>{
    //attribute to save data
    //attribute to save size
    
    public MyArray(int arraySize){
        //สร้าง Array
    }
    
    @Override
    public void enqueue(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        //Return Size of Data in Array
    }

    @Override
    public boolean isEmpty() {
        // Check that has data in array or not
    }

    @Override
    public void push(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
