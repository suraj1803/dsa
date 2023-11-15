package recursion;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fun2(16));
//        binaryToDecimal(7);
        RecursionQ recursionQ = new RecursionQ();
        recursionQ.printNto1(5);
    }

    public static void fun(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fun(n - 1);
        System.out.println(n);
    }

    public static void fun1(int n) {
        if (n == 0)
            return;
        fun1(n - 1);
        System.out.println(n);
        fun1(n - 1);
    }

    public static int fun2(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + fun2(n / 2);
    }

}
