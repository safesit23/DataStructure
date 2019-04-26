/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author jatawatsafe
 */
public class Tester {
    public static void main(String[] args) {
        test1();
    }
    
    public static void printArray(Object[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d%s",x[i],(i+1)%10==0?"\n":"\t");
        }
        System.out.println("");
    }
    
    public static void test1(){
        Integer[]x= new Integer [10];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(100);
        }
        System.out.println("Original order: ");
        printArray(x);
        //------------CHOOSE SORT---------------
        //Insertion Type1
        Sorter.insertion(x);
        
        //Insertion Type2
        /*
        Sorter.insertion(x,new Comparator<Integer>(){   //Decreasing
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });
        */
        
        //Selection Sort
        //Sorter.selectionSort(x);
        
        
        System.out.println("After Sorted: ");
        printArray(x);
        
        
    }
    
    public static void test2(){
        Integer[] x = new Integer[200_000];
        Integer[] y = new Integer[200_000];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(1000000);
        }
        System.arraycopy(x, 0, y, 0, x.length);
        long before = System.currentTimeMillis();
        Arrays.parallelSort(x);
        long duration1 = System.currentTimeMillis()-before;
        
        before = System.currentTimeMillis();
        Sorter.insertion(y);
        long duration2 = System.currentTimeMillis() - before;
        System.out.println("Parallel sort : "+duration1+"milliseconds");
        System.out.println("Onsection sort : "+duration2+"milliseconds");
        System.out.println("After order");
        printArray(x);
    }
}

