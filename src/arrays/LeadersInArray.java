package arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        leaders(new int[]{7, 10, 4, 3, 6, 5, 2});
    }

    public static void leaders(int[] arr) {
        int leader = arr[arr.length - 1];
        System.out.print(leader + " ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                System.out.print(leader + " ");
            }
        }
    }
}
