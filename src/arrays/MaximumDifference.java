package arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{2, 3, 10, 6, 4, 8}));
    }
    public static int maxDiff(int[] arr) {
         int res = arr[1] - arr[0];
         int minSoFar = arr[0];

         for (int i = 1; i < arr.length; i++) {
             res = Math.max(res, arr[i] - minSoFar);
             minSoFar = Math.min(minSoFar, arr[i]);
         }

         return res;
    }
}
