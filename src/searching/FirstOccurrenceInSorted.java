package searching;

public class FirstOccurrenceInSorted {
    public static void main(String[] args) {
        System.out.println(firstOccurrenceBin(new int[]{1, 2, 3, 4, 4, 5}, 4, 0, 5));
    }

    public static int firstOccurrence(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }

        return -1;
    }

    public static int firstOccurrenceBin(int[] arr, int x, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            if (mid != 0 && arr[mid - 1] == arr[mid]) {
                return firstOccurrenceBin(arr, x, low, mid - 1);
            } else {
                return mid;
            }
        } else if (arr[mid] > x) {
            return firstOccurrenceBin(arr, x, low, mid - 1);
        } else {
            return firstOccurrenceBin(arr, x, low + 1, high);
        }
    }
}
