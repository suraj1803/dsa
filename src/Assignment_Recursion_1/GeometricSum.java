/*
Geometric Sum

Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
using recursion.
Input format :
Integer k
Output format :
Geometric sum
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.875
Sample Input 2 :
4
Sample Output 2 :
1.93750
*/

package Assignment_Recursion_1;

public class GeometricSum {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    public static double sum(int k) {
        if (k == 0)
            return 1;
        return sum(k - 1) + 1 / Math.pow(2, k);
    }
}
