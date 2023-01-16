package LeetCode;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        String haystack1 = "aaaaa", needle1 = "bba";
        String haystack2 = "aaa", needle2 = "aaaa";

//        System.out.println(strStr(haystack, needle));
//        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));

    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0 || needle.length() == 0) {
            return 0;
        }
        char[] chars = haystack.toCharArray();
        char c = needle.charAt(0);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
