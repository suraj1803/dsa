package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{5, 20, 3, 10}));
    }

    private static int getSecondLargest(int[] arr) {
        int largest = LargestInArray.largest(arr);
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest])
                    secondLargest = i;
            }
        }
        return secondLargest;
    }

}

