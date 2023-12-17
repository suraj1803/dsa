package arrays;

public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSumOpt(arr));
    }

    public static int maxSum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr += arr[j];
                result = Math.max(result, curr);
            }
        }
        return result;
    }

    public static int maxSumOpt(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], arr[i] + maxEnding);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
