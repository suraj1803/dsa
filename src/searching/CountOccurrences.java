package searching;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 2, 2, 3, 3, 3, 3, 4}, 4));
    }

    public static int count(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
            else if (arr[i] != x && count != 0)
                return count;
        }
        return count;
    }
}
