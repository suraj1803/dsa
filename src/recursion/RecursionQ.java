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
}
