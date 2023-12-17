/*
Check Palindrome (recursive)

Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/

package Assignment_Recursion_1;

import java.util.Scanner;

public class CheckPalindromicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isPalindrome(str));
    }

    public static  boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    public static boolean isPalindrome(String str, int s, int e) {
        if (s >= e)
            return true;
        return str.charAt(s) == str.charAt(e) && isPalindrome(str, s + 1, e - 1);
    }
}
