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
}
