package searching;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearchRecursive(new int[]{1, 2, 3, 4, 5}, 8, 2, 4));
    }

    public static int binarySearchIterative(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binarySearchRecursive(arr, key, low , mid - 1);
        else
            return binarySearchRecursive(arr, key, low + 1, high);
    }
}
