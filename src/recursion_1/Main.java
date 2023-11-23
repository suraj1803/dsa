package recursion_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    // PMI (Principal of Mathematical Induction
    // 1. Prove p(1) is true
    // 2. Assume p(k) is true
    // 3. Assuming that prove p(k + 1) is true
    // the function for naturalSum(3) we get it by knowing naturalSum(2) + 3
    public static int naturalSum(int n) {
        if (n == 1)
            return 1;
        return n + naturalSum(n - 1);
    }
}
