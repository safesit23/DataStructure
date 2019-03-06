/*
 * Created By Safe_IT23
 */
package Review;

/**
 *
 * @author jatawatsafe
 */
public class Review {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        
        //ARRAY 1
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        //Arr2
        int sum =0;
        for (int i : arr) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.printf("%s %d","Sum =",sum);
        
        
    }
    
    public int arrResult(int[] arr){
        int sum =0;
        for (int i : arr) {
            System.out.println(i);
            sum = sum+i;
        }
        int aftermod = mod(sum);
        return aftermod;
    }
    
    public int mod(int a){
        int mod = a%10;
        return mod;
    }
}
