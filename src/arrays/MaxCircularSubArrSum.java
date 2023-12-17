package arrays;

public class MaxCircularSubArrSum {
    public static void main(String[] args) {
        int[] arr = {8, -4, 3, -5, 4};
        System.out.println(maxSum(arr));;
    }

    public static int maxSum(int[] arr) {
        // global max variable
        int maxSubArrSum = arr[0];

        // maxSum ending at index i
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding);
            maxSubArrSum = Math.max(maxSubArrSum, maxEnding);
        }

        if (maxSubArrSum < 0)
            return maxSubArrSum;

        int minSubArrSum = arr[0];
        int minEnding = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            minEnding = Math.min(arr[i], arr[i] +  minEnding);
            minSubArrSum = Math.min(minSubArrSum, minEnding);
        }

        int circularSubArrSum = Math.max(maxSubArrSum, sum - minSubArrSum);
        return circularSubArrSum;
    }
}
