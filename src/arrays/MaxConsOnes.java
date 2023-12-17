/*
You are given a binary array and you have to find out maximum number of consecutive ones
in that array
*/
package arrays;

public class MaxConsOnes {
    public static void main(String[] args) {
        System.out.println(maxOne(new int[]{0, 1, 1, 1, 0, 0, 1, 1, 1, 1}));
    }

    public static int maxOne(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
