/*
Last Index of Number

Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
3

*/
package recursion_1;

public class LastIndex {
    public static void main(String[] args) {
        System.out.println(lastIndex(new int[]{1, 5, 3, 2, 3, 5}, 5, 0));
    }

    public static int lastIndex(int[] arr, int x, int i) {
        if (i == arr.length)
            return -1;

        int res = lastIndex(arr, x, i + 1);
        if (arr[i] == x && res == -1)
            return i;
        return res;
    }
}
