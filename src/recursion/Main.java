package recursion;

public class Main {
    public static void main(String[] args) {
        RecursionQ recursionQ = new RecursionQ();
//        System.out.println(recursionQ.maxPieces(5, 2, 3, 4));
        RecursionOnArray  r = new RecursionOnArray();
        r.print(new int[]{1, 2, 3, 4, 5}, 0);
    }
}