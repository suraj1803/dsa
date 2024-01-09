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
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                if (mid != 0 && arr[mid - 1] == x) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
            else if (arr[mid] > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
