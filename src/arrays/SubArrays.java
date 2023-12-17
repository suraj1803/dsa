package arrays;

public class SubArrays {
    public static void main(String[] args) {
        printSubArray(new int[]{1, 2, 3, 4});
    }

    public static void printSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(arr[k] + " ");
                System.out.println();
            }
        }
    }

}
