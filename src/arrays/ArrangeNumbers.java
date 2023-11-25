/*
Arrange Numbers in Array

You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and
you need not worry about the array. Your task is to populate the array using the integer values in the
range 1 to N(both inclusive) in the order - 1,3,.......4,2.
Note:
You need not print the array. You only need to populate it.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

The first and the only line of each test case or query contains an integer 'N'.
Output Format :
For each test case, print the elements of the array separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2
*/
package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrangeNumbers {
    public static void main(String[] args) {
        int[] arr = arrange(5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrange(int n) {
        int[] arr = new int[n];
        int i;
        for (i = 0; 2 * i + 1 <= n; i++) {
            arr[i] = 2 * i + 1;
        }

        if (n % 2 == 0)
            arr[i++] = n;

        int k = (n % 2 == 0) ? n - 2 : n - 1;

        for (int j = i; j < n; j++) {
            arr[j] = k;
            k -= 2;
        }

        return arr;
    }
}

