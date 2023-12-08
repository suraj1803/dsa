import patterns.PatternQ;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
//        Arrays.sort(arr);
        int[] arr1 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arr1));
    }

    public static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}
