package arrays;

public class LongestEvenOddSub {
    public static void main(String[] args) {

    }

    public static int maxLengthEvenOdd(int[] arr) {
        int result = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i] % 2 == 0) ) {
                curr++;
                curr = Math.max(arr[i], curr);
            }
            else
                curr = 1;
        }
        return result;
    }
}
