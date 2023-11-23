package recursion_1;

public class CheckSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 3, 4}, 0));
    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;

        return arr[i] <= arr[i + 1] && isSorted(arr, i + 1);
    }
}
