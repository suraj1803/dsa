package recursion_1;

public class HelperFunctions {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 0, 2, 3, 4}));
    }

    public static boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    private static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;

        return arr[i] <= arr[i + 1] && isSorted(arr, i + 1);
    }
}
