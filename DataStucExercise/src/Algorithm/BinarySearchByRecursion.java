/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

/**
 *
 * @author jatawatsafe
 */
public class BinarySearchByRecursion {

    public static void main(String[] args) {
        Integer[] data = {2, 7, 8, 12, 14, 15, 26, 39, 47, 53, 55};
        int pos = binarySearch(data, 25);
        System.out.printf("key 25, position = %d\n", pos);
        pos = binarySearch(data, 39);
        System.out.printf("key 39, position = %d\n", pos);
        pos = binarySearch(data, 7);
        System.out.printf("key 7, position = %d\n", pos);
        String[] str = {"A", "E", "I", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X"};
        pos = binarySearch(str, "X");
        System.out.printf("key 'X',position = %d\n", pos);
    }

    private static int binarySearch(Object[] data, Object key) {
        int left = 0;
        int right = data.length - 1;
        return binarySearch(data, key, left, right);
    }

    private static int binarySearch(Object[] data, Object key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        Comparable k = (Comparable) key;
        Comparable x = (Comparable) data[mid];
        
        if (k.compareTo(x) < 0) {
            right = mid - 1;
            return binarySearch(data, key, left, right); //result is return to call next
        } else if (k.compareTo(x) > 0) {
            left = mid + 1;
            return binarySearch(data, key, left, right);
        }else{
            return mid;
        }
    }
    
    
    
}
