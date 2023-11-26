package arrays;

public class LargestInArray {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{5, 3, 4, 5}));
    }

    public static int largest(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }
}
