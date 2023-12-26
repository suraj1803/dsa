package recursion_1;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }

    public static void toh(int n, char a, char b, char c) {
        if (n == 0)
            return;
        toh(n - 1, a, c, b);
        System.out.printf("Move disc %d from %c to %c\n", n, a, b);
        toh(n - 1, c, b, a);
    }
}
