package recursion;

public class Main {
    public static void main(String[] args) {
        RecursionQ recursionQ = new RecursionQ();
//        System.out.println(recursionQ.maxPieces(5, 2, 3, 4));
        recursionQ.towerOfHanoi(3, 'A', 'B', 'C');
    }
}