/*

Calculate Power

Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32

*/
package recursion_1;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(powerOptimized(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        return x * power(x, n - 1);
    }

    public static int powerOptimized(int x, int n) {
        if (n == 0)
            return 1;
        int smallAns = powerOptimized(x, n / 2);
        smallAns = smallAns * smallAns;
        if (n % 2 == 0)
            return smallAns;
        return smallAns * x;
    }
}
