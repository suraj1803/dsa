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
        // without sorting
//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//                if (n / i != i)
//                    System.out.println(n / i);
//            }
//        }

        // with sorting
        int i = 1;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }

        for ( ; i >= 1; i--) {
            if (n % i == 0 && n / i != i)
                System.out.println(n / i);
        }
    }

    // main idea of sieve algorithm is to mark all the composite numbers as false
    public void sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            primes[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i])
                System.out.println(i);
        }
    }

    // time complexity log(b)
    public int power(int a, int b) {
        if (b == 0)
            return 1;

        int temp = power(a, b / 2);

        temp = temp * temp;

        if (b % 2 == 0)
            return temp;
        return temp * a;
    }
}
