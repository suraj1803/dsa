package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        System.out.println(Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] arr) {
        // idea is to keep track of distinct elements
        // and ignoring same elements
        int res = 0;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res]) {
                arr[++res] = arr[i];
            }
        }
        return res;
    }
}
