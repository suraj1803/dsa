package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 10, 0, 20, 0, 10};
        moveZeroesEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesEnd(int[] arr) {
        int nonZeroesIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = 0;
                arr[nonZeroesIndex++] = temp;
            }
        }
    }
}
