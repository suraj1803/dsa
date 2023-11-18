package recursion;

public class RecursionQ {
    public void printNto1(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        printNto1(n - 1);
    }

    public void print1toN(int n) {
        if (n < 1)
            return;
        print1toN(n - 1);
        System.out.println(n);
    }

    public void binaryToDecimal(int n) {
        if (n == 0)
            return;
        binaryToDecimal(n / 2);
        System.out.print(n % 2);
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public int naturalSum(int n) {
        if (n == 0)
            return 0;
        return n + naturalSum(n - 1);
    }

    public boolean isPalindromeString(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) && (isPalindromeString(str, start + 1, end - 1));
    }

    // time complexity = O(d)
    // space complexity = O(d)
    // where d = no of digits
    public int sumOfDigits(int n) {
        if (n >= 0 && n <= 9)
            return n;
        return n % 10 + sumOfDigits(n / 10);
    }

    public int power(int p, int q) {
        if (q == 0)
            return 1;
        return p * power(p , q - 1);
    }

    public int maxPieces(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = max(maxPieces(n - a, a, b, c), maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c));
        if (res == -1)
            return res;
        return res + 1;
    }

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public void subSets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.println(curr);
            return ;
        }
        subSets(str, curr, i + 1);
        subSets(str, curr + str.charAt(i), i + 1);
    }

    public void towerOfHanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 " + " disc " + " from " + A + " to " + C);
            return;
        }

        towerOfHanoi(n - 1, A , C, B);
        System.out.println("Move " + n + " disc " + " from " + A + " to " + C);
        towerOfHanoi(n - 1, B, A, C);
    }

}
