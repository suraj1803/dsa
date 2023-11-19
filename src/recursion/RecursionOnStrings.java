package recursion;

public class RecursionOnStrings {
    public String removeOccurrences(String str, char ch, int index) {
        if (index == str.length())
            return "";

        String temp = removeOccurrences(str, ch, index + 1);
        return (str.charAt(index) == ch) ? temp : str.charAt(index)  + temp;
    }

    public boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1);
    }
}
