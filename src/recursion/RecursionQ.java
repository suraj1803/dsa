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
//        if (q == 0)
//            return 1;
//        return p * power(p , q - 1);
        if (q == 0)
            return 1;
        if (q == 1)
            return p;
        int temp = power(p, q / 2);
        temp = temp * temp;
        if (q % 2 == 0)
            return temp;
        return temp * p;
    }

    // print pattern -
    // n = 16
    // 16 11 6 1 -4 1 6 11 16
    // n = 10
    // 10 5 0 5 10
    public void printPattern(int n, int m, boolean flag) {
        if (n == m && flag) {
            System.out.println(m);
            return;
        }

        System.out.println(m);
        if (m <= 0)
            flag = true;

        if (flag) {
            printPattern(n, m + 5, flag);
        }
        else
            printPattern(n, m - 5, flag);
    }

    public int mthSum(int n, int m) {
        if (m == 1)
            return n * (n + 1) / 2;
        return mthSum(mthSum(n, m - 1), 1);
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


    public int multiplication(int a, int b) {
        if (b == 1)
            return a;
        return a + multiplication(a, b - 1);
    }

    public void decimalToBinary(int n) {
        if (n == 0)
            return;
        decimalToBinary(n / 2);
        System.out.print(n % 2);
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
