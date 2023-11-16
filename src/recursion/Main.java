package recursion;

public class Main {
    public static void main(String[] args) {
        RecursionQ recursionQ = new RecursionQ();
//        System.out.println(recursionQ.maxPieces(5, 2, 3, 4));
        String str = "abc";
        int i = 0;
        String curr = "";
        recursionQ.subSets(str, curr, i);
    }
}