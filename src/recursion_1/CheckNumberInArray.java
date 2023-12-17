/*
Check Number in Array

Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/

package recursion_1;

public class CheckNumberInArray {
    public static void main(String[] args) {

        System.out.println(isPresent(new int[]{1, 2,3 , 4}, 5, 0));
    }

    public static boolean isPresent(int[] arr, int x, int i) {
        if (i == arr.length)
            return false;

        if (arr[i] == x)
            return true;
        return isPresent(arr, x, i + 1);
    }
}
