package packed;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    private static String longestCommonPrefix(String[] strings) {
        int minLengthWords = Integer.MAX_VALUE;
        for (String word : strings) {
            if (word.length() < minLengthWords) {
                minLengthWords = word.length();
            }
        }
        return String.valueOf(minLengthWords);
    }
}
