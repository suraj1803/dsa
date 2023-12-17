package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class OperationsOnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        delete(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }

        return -1;
    }

    public static int insert(int[] arr, int size, int capacity, int x, int index) {
        if (size == capacity)
            return size;
        for (int i = size - 1; i >= index; i--)
            arr[i + 1] = arr[i];
        arr[index] = x;
        return size + 1;
    }

    public static int delete(int[] arr, int x) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index == arr.length)
            return arr.length;

        for (int i = index; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        return arr.length - 1;
    }
}
