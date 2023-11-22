package recursion;

import java.util.ArrayList;

public class RecursionOnArray {
    public void print(int[] arr, int index) {
       if (index == arr.length)
          return;
        System.out.println(arr[index]);
        print(arr, index + 1);
    }

    public int max(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return Math.max(arr[index], max(arr, index + 1));
    }

    public int sum(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return arr[index] + sum(arr, index + 1);
    }

    public boolean isPresent(int[] arr, int x, int i) {
        if (i == arr.length)
            return false;
        if (arr[i] == x)
            return true;
        return isPresent(arr, x, i + 1);
    }

    public int frog(int[] arr, int i) {
        if (i == arr.length - 1)
            return 0;
        if (i == arr.length - 2)
            return Math.abs(arr[i] - arr[i + 1]);
        return Math.min( (Math.abs(arr[i] - arr[i + 1])) + frog(arr, i +1) , (Math.abs(arr[i] - arr[i + 1])) + frog(arr, i + 2));
    }

    public void printSubArrays(int[] arr, int[] curr, int i) {
        if (i == arr.length) {
            for (int k = 0; k < curr.length; k++)
                System.out.print(curr[k] + " ");
            System.out.println();
            return;
        }

        printSubArrays(arr, curr, i + 1);

        int[] newOutput = new int[curr.length + 1];
        for (int k = 0; k < curr.length; k++)
            newOutput[k] = curr[k];
        newOutput[curr.length] = arr[i];
        printSubArrays(arr, newOutput, i + 1);
    }
}
