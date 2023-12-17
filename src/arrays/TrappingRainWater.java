/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
*/
package arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(calculateWater(new int[]{3, 0, 2, 0, 4}));
    }

    public static int calculateWater(int[] arr) {
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int[] rightMax = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += Math.min(rightMax[i], leftMax[i]) - arr[i];
        }
        return res;
    }
}
