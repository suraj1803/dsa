package mathemaics;

public class MathQ {
    public int countDigits(int n) {
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        return digits;
    }

    public boolean isPalindromeNum(int n) {
        int temp = n;

        int reverseNum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            temp /= 10;
        }

        return n == reverseNum;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int trailingZeroesInFactorial(int n) {
        int result = 0;
        for (int i = 5; i <= n; i *= 5) {
            result += n / i;
        }
        return result;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void allDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i)
                    System.out.println(n / i);

            }
        }
    }
}
