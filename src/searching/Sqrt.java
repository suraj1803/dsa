package searching;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(5));
    }

    public static int sqrt(int n) {
        int low = 1, high = n, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midsq = mid * mid;
            if (midsq == n) {
                return mid;
            } else if (midsq > n)
                high = mid - 1;
            else {
                low = mid + 1;
                res = mid;
            }
        }
        return res;
    }
}
