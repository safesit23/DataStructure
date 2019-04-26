/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Comparator;

/**
 *
 * @author jatawatsafe
 */
public class Sorter {

    public static void insertion(Object[] data) {
        System.out.println("------SORT BY INSERTION-----");
        insertionUsingComparable(data);
    }

    public static void insertion(Object[] data, Comparator c) {
        System.out.println("------SORT BY INSERTION-----");
        if (c == null) {
            insertionUsingComparable(data);
        } else {
            insertionUsingComparator(data, c);
        }
    }

    public static void insertionUsingComparable(Object[] data) {
        for (int i = 1; i < data.length; i++) {
            Comparable tmp = (Comparable) data[i];
            int j = i;
            System.out.println(i + ".)" + display(data,i));
            message(tmp, data[j-1]); //display process
            for (; j > 0 && tmp.compareTo((Comparable) data[j - 1]) < 0; j--) { //when temp is more than will break loop
                System.out.println("      MOVE");
                data[j] = data[j - 1];
                System.out.println("      Data: " + display(data,j));
                message(tmp, data[j - 2]); //display process
            }
            System.out.println("      STOP");
            data[j] = tmp;
            System.out.println("      Replace "+tmp+"  : " + display(data,j) + "\n");
        }
    }

    public static void insertionUsingComparator(Object[] data, Comparator c) {
        for (int i = 1; i < data.length; i++) {
            Object tmp = (Comparable) data[i];
            int j;
            for (j = i; j > 0 && c.compare(tmp, data[j - 1]) < 0; j--) {
                data[j] = data[j - 1];
            }
            data[j] = tmp;
        }
    }

    public static void selectionSort(Comparable x[]) {
        System.out.println("------SORT BY SELECTION-----");
        for (int i = x.length - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (x[j].compareTo(x[max]) > 0) {
                    max = j;
                }
            }
            if (max != i) {
                swap(x,max, i);
            }
        }
    }
    
    public static void swap(Object x[], int i, int j){
        Object tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }
    

    public static String display(Object[] data,int pos) {
        String display = "";
        for (int i = 0; i < data.length; i++) {
            if(i==pos){
                display = display +"("+ data[i] + ") ";
            }else{
                display = display + data[i] + " ";
            }
        }
        return display;
    }

    public static void message(Object i, Object j) {
        Comparable tmp = (Comparable) i;
        Comparable dataJ = (Comparable) j;
        int compare = tmp.compareTo(dataJ);
        System.out.printf("----->COMPARE : %s compareTo %s = %d",tmp,dataJ,compare);
        //System.out.println("----->COMPARE tmp: " + i + " with j: " + j  + "  get  " + compare);
    }
}
