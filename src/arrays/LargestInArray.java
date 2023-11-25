package arrays;

public class LargestInArray {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{1, 2, 10, 3, 4, 5}));
    }

    public static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
