/*
 * Created by SAFE_IT23
 */
package Algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int data[] = {9, 15, 32, 71, 78, 92, 101, 115, 117, 129, 270, 350, 470, 500};
        int pos = binarySearch(data, 92);
        System.out.println(pos);
    }

    private static int binarySearch(int[] data, int i) {
        int left = 0;
        int right = data.length - 1;
        int middle;
        System.out.println("<<<<<START>>>>>");
        while (left <= right) {
            middle = (left + right) / 2;
            System.out.printf("L-%d is %d | M-%d is %d | R-%d is %d \n", left, data[left], middle, data[middle], right, data[right]);
            if (i > data[middle]) {
                System.out.printf("%d > %d \n", i, data[middle]);
                left = middle + 1;
                System.out.printf("New Left is m+1 = %d\n", left);
            } else if (i < data[middle]) {
                System.out.printf("%d < %d \n", i, data[middle]);
                right = middle - 1;
                System.out.printf("New Right is m-1 = %d\n", right);
            } else {
                System.out.printf("Can find %d in index %d\n", i, middle);
                return middle;
            }
        }
        System.out.println("<<<<<END>>>>>>");
        System.out.println("Cannot Find key in data");
        return -1;
    }
}
