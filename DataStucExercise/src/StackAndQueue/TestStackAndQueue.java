/*
 * Created By Safe_IT23
 */
package StackAndQueue;

/**
 *
 * @author jatawatsafe
 */
public class TestStackAndQueue {
    public static void main(String[] args) {
        //Creation by Array
        MyArray<String> array1 = new MyArray(5);
        MyArray<Integer> array2 = new MyArray(5);
        //Creation by LinkList
        MyLinkedList<Integer> linkedlist1 = new MyLinkedList();
        
        //Generic use String
        testString(array1);
        //Generic use Integer
        testInteger(array2);
        //Use Linked List
        testLinkList(linkedlist1);
       
    }
    
    public static void testString(MyArray<String> array1){
        System.out.println("<<<<<< MY ARRAY1 >>>>>");
        System.out.println("Size is "+array1.size());
        System.out.println("Is Empty : "+array1.isEmpty());
        System.out.println("Data is "+array1.allData()+"\n");
        
        //Push Data
        System.out.println(">>1.Push H");
        array1.push("H");
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Push Data
        System.out.println(">>2.Push E");
        array1.push("E");
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Enqueue Data
        System.out.println(">>3.Enqueue L");
        array1.enqueue("L");
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Enqueue Data
        System.out.println(">>4.Enqueue L");
        array1.enqueue("L");
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Push Data
        System.out.println(">>5.Push O");
        array1.push("O");
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //SHOW
        System.out.println(">>PEEK is "+array1.peek()+" | Front is "+array1.getFront()+"\n");
        
        
        //Pop Data
        System.out.println(">>6.Pop");
        System.out.println("Pop--> "+array1.pop());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Dequeue Data
        System.out.println(">>7.Dequeue");
        System.out.println("Dequeue--> "+array1.dequeue());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Push Data
        System.out.println(">>8.Push W");
        array1.push("W");
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );

        //Pop Data
        System.out.println(">>9.Pop");
        System.out.println("Pop--> "+array1.pop());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //Dequeue Data
        System.out.println(">>10.Dequeue");
        System.out.println("Dequeue--> "+array1.dequeue());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array1.allData(),array1.size() );
        
        //CONCLUSION
        System.out.println("------CONCLUSION-----");
        System.out.println("Size is "+array1.size());
        System.out.println("Is Empty : "+array1.isEmpty());
        System.out.println("Data is "+array1.allData());
        System.out.println("PEEK is "+array1.peek()+"\nFront is "+array1.getFront()+"\n");
    }
    
    public static void testInteger(MyArray<Integer> array2){
        System.out.println("<<<<<< MY ARRAY2 >>>>>");
        System.out.println("Size is "+array2.size());
        System.out.println("Is Empty : "+array2.isEmpty());
        System.out.println("Data is "+array2.allData()+"\n");
        
        //Push Data
        System.out.println(">>1.Push 1");
        array2.push(1);
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array2.allData(),array2.size() );
        //Push Data
        System.out.println(">>2.Push 9");
        array2.push(9);
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array2.allData(),array2.size() );
        //Pop Data
        System.out.println(">>3.Pop");
        System.out.println("Pop--> "+array2.pop());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array2.allData(),array2.size() );
        //Enqueue Data
        System.out.println(">>4.Enqueue 3");
        array2.enqueue(3);
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array2.allData(),array2.size() );
        //Dequeue Data
        System.out.println(">>5.Dequeue");
        System.out.println("Dequeue--> "+array2.dequeue());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",array2.allData(),array2.size() );
        //CONCLUSION
        System.out.println("------CONCLUSION-----");
        System.out.println("Size is "+array2.size());
        System.out.println("Is Empty : "+array2.isEmpty());
        System.out.println("Data is "+array2.allData());
        System.out.println("PEEK is "+array2.peek()+"\nFront is "+array2.getFront()+"\n");
    }
    
    public static void testLinkList(MyLinkedList<Integer> linkedList){
        System.out.println("<<<<<< LINK LIST >>>>>");
        System.out.println("Size is "+linkedList.size());
        System.out.println("Is Empty : "+linkedList.isEmpty());
        System.out.println("Data is "+linkedList.allData()+"\n");
        
        //Push Data
        System.out.println(">>1.Push 1");
        linkedList.push(1);
        System.out.printf("Data is %s \t\t | Size is %d \n\n",linkedList.allData(),linkedList.size() );
        //Push Data
        System.out.println(">>2.Push 9");
        linkedList.push(9);
        System.out.printf("Data is %s \t\t | Size is %d \n\n",linkedList.allData(),linkedList.size() );
        //Pop Data
        System.out.println(">>3.Pop");
        System.out.println("Pop--> "+linkedList.pop());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",linkedList.allData(),linkedList.size() );
        //Enqueue Data
        System.out.println(">>4.Enqueue 3");
        linkedList.enqueue(3);
        System.out.printf("Data is %s \t\t | Size is %d \n\n",linkedList.allData(),linkedList.size() );
        //Dequeue Data
        System.out.println(">>5.Dequeue");
        System.out.println("Dequeue--> "+linkedList.dequeue());
        System.out.printf("Data is %s \t\t | Size is %d \n\n",linkedList.allData(),linkedList.size() );
        //CONCLUSION
        System.out.println("------CONCLUSION-----");
        System.out.println("Size is "+linkedList.size());
        System.out.println("Is Empty : "+linkedList.isEmpty());
        System.out.println("Data is "+linkedList.allData());
        System.out.println("PEEK is "+linkedList.peek()+"\nFront is "+linkedList.getFront()+"\n");
    }
}
