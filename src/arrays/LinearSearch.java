package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4}, 11));
    }

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i])
                return i;
        }
        return -1;
    }
}
