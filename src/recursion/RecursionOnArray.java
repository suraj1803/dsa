package recursion;

public class RecursionOnArray {
    public void print(int[] arr, int index) {
       if (index == arr.length)
          return;
        System.out.println(arr[index]);
        print(arr, index + 1);
    }

    public int max(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return Math.max(arr[index], max(arr, index + 1));
    }

    public int sum(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return arr[index] + sum(arr, index + 1);
    }
}
