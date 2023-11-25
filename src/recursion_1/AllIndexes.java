/*
All Indices of Number

Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array.
Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4

*/
package recursion_1;

import java.util.Arrays;

public class AllIndexes {
    public static void main(String[] args) {
        int[] arr = allIndexes(new int[]{9, 8, 10, 8, 8}, 8, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] allIndexes(int[] arr, int x, int i) {
        if (i == arr.length) {
            int[] output = new int[0];
            return output;
        }

        int[] smallOutput = allIndexes(arr, x, i + 1);
        if (arr[i] == x) {
            int[] newOutput = new int[smallOutput.length + 1];
            newOutput[0] = i;
            for (int k = 0; k < smallOutput.length; k++) {
                newOutput[k + 1] = smallOutput[k];
            }
            return newOutput;
        }
        return smallOutput;
    }

}