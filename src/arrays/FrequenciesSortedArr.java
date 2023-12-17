package arrays;

public class FrequenciesSortedArr {
    public static void main(String[] args) {
        printFrequencies(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4});
    }

    public static void printFrequencies(int[] arr) {
        int curr = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (curr == arr[i]) {
                count++;
            } else {
                System.out.println(curr + " " + count);
                curr = arr[i];
                count = 1;
            }
        }
        System.out.println(curr + " " + count);
    }
}
