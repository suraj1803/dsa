/*
Count Zeros

Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
Constraints :
0 <= N <= 10^9
Sample Input 1 :
10204
Sample Output 1 :
2
Sample Input 2 :
708000
Sample Output 2 :
4
*/

package Assignment_Recursion_1;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(10230002));
    }

    public static int countZeroes(int n) {
        if (n == 0)
            return 1;
        if (n >= 1 && n <= 9)
            return 0;
        return countZeroes(n / 10)  + (n % 10 == 0 ? 1 : 0);
    }
}
