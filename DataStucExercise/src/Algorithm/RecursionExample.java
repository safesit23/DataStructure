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
public class RecursionExample {
    public static void main(String[] args) {
        int x=5;
        System.out.printf("S(%d) = %d\n",x,sum(x));
        System.out.printf("%d! = %d \n",x,fact(x));
        System.out.printf("binary of 16 = %s \n",getBinary(16));
    }
    
    private static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    
    private static int fact(int x){
        if (x<=1) {
            return 1;
        }
        return x*fact(x-1);
    }
    
    private static String getBinary(int n){
        if (n<0) {
            throw new IllegalArgumentException();
        }
        if (n<=1) {
            return ""+n;
        }
        return getBinary(n/2) + (n%2);
    }
}
