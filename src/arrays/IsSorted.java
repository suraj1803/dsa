package arrays;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println(isSortedArray(new int[]{1, 2, 3, 1}));
    }

    public static boolean isSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}
