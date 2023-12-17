package searching;

public class Count1sinBin {
    public static void main(String[] args) {
        System.out.println(count(new int[]{0, 0, 1, 1, 1, 1}));
    }

    public static int count(int[] arr) {
        int count = 0;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 1) {
                if (mid == 0 || arr[mid - 1] == 0)
                    count = arr.length - mid;
                else
                    high = mid - 1;
            } else
                low = high + 1;
        }

        return count;
    }
}
