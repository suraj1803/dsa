package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(findMajority(new int[]{8, 8, 6, 6, 4, 6, 6}));
    }

    public static int findMajority(int[] arr) {
        int res = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (res == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                count = 1;
                res = i;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (res == arr[i])
                count++;
        }

        if (count <= arr.length / 2)
            return -1;

        return res;
    }
}
