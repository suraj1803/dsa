package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        int distinctIndex = 1;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[distinctIndex - 1]) {
                arr[distinctIndex] = arr[i];
                distinctIndex++;
            }
        }
        return distinctIndex;
    }
}
