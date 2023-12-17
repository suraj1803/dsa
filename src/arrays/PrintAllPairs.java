/*
    Our task is to print all pairs like (x, y) where x_index < y_index
*/
package arrays;

public class PrintAllPairs {
    public static void main(String[] args) {
       print(new int[]{1, 2, 3, 4, 5});
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
}
