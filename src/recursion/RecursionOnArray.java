package recursion;

public class RecursionOnArray {
    public void print(int[] arr, int index) {
       if (index == arr.length)
          return;
        System.out.println(arr[index]);
        print(arr, index + 1);
    }
}
