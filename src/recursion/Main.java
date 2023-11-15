package recursion;

public class Main {
    public static void main(String[] args) {
        RecursionQ recursionQ = new RecursionQ();
//        System.out.println(recursionQ.factorial(5));
//        System.out.println(recursionQ.isPalindromeString("abas"));
        String str = "abcbba";
        System.out.println(recursionQ.isPalindromeString(str));
    }
}