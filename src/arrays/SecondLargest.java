package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{10, 5, 3, 4, 5}));
    }

    public static int getSecondLargest(int[] arr) {
        int largestIndex = LargestInArray.largest(arr);
        int secondLargestIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largestIndex]) {
                if (secondLargestIndex == -1 || arr[i] > arr[secondLargestIndex])
                    secondLargestIndex = i;
            }
        }
        return secondLargestIndex;
    }
}

