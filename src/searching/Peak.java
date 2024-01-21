package searching;

public class Peak {
    public static void main(String[] args) {
            findPeak(new int[]{7, 7, 8, 20, 12});
    }

    public static void findPeak(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        if (arr[0] >= arr[1]) {
            System.out.println(arr[0]);
        }
        if (arr[n - 1] >= arr[n - 2]) {
            System.out.println(arr[n - 1]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                System.out.println(arr[i]);
        }
    }
}
