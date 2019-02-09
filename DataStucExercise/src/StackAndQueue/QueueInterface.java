/*
 * Created By Safe_IT23
 */
package StackAndQueue;

/**
 *
 * @author jatawatsafe
 */
public interface QueueInterface <E> {
    public void enqueue(E e);
    public E dequeue();
    public int size();
    public boolean isEmpty();
    
    
}
