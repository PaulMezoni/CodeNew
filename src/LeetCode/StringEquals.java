package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringEquals {

    /* "Дан  большой текст (статья, книга, газета) и несколько сообщений. \n" +
             "Утверждается что эти сообщения составлены следующим образом:  \n" +
             "• Распечатываем текст  \n" +
             "• Вырезаем некоторые слова из распечатки \n" +
             "• Наклеиваем эти слова на бумагу в произвольном порядке \n" +
             "\n" +
             "Требуется составить программу которая проверяет это утверждение для каждого сообщения.  \n" +
             "Пример: \n" +
             "Текст: \"Мой дядя самых честных правил, \n" +
             "Когда не в шутку занемог, \n" +
             "Он уважать себя заставил \n" +
             "И лучше выдумать не мог. \n" +
             "Его пример другим наука; \n" +
             "Но, боже мой, какая скука \n" +
             "С больным сидеть и день и ночь, \n" +
             "Не отходя ни шагу прочь! \n" +
             "Какое низкое коварство \n" +
             "Полуживого забавлять, \n" +
             "Ему подушки поправлять, \n" +
             "Печально подносить лекарство, \n" +
             "Вздыхать и думать про себя: \n" +
             "Когда же черт возьмет тебя!\"  \n" +
             "\n" +

             "Сообщение 1:    \"Мой дядя  мог  думать  про  тебя  и день и ночь\"  \n" +
             "Сообщение 2:   \"Мой дядя  мог  думать  про Linux и Java день и ночь\"
             Очевидно для Сообщения 1 программа должна выдать true, а для Сообщения 2 -- false.";*/

    public static void main(String[] args) {
        String s =
                "Мой дядя самых честных правил, Когда не в шутку занемог, " +
                        "Он уважать себя заставил " +
                        "И лучше выдумать не мог. " +
                        "Его пример другим наука; " +
                        "Но, боже мой, какая скука " +
                        "С больным сидеть и день и ночь, " +
                        "Не отходя ни шагу прочь! " +
                        "Какое низкое коварство " +
                        "Полуживого забавлять," +
                        "Ему подушки поправлять, " +
                        "Печально подносить лекарство, " +
                        "Вздыхать и думать про себя: " +
                        "Когда же черт возьмет тебя!";
        String s1 =
                "Мой дядя мог  думать  про  тебя  и день и ночь";

        String s2 =
                "Мой дядя  мог  думать  про Linux и Java день и ночь";

        System.out.println(equalsStr(s, s1));
        System.out.println(equalsStr(s, s2));
//        String x = "Max";
//        String y = "Mx";
//        System.out.println(compareString(x, y));
        testText(s, s1);
        testText(s, s2);
    }

    public static boolean compareString(String word1, String word2) {
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private static void testText(String text, String message1) {
        String[] s = message1.split(" ");
        boolean testText = false;
        for (String t : s) {
            Pattern pattern = Pattern.compile(".*" + t + ".*");
            Matcher matcher = pattern.matcher(text);
            testText = matcher.find();
        }
        System.out.println(testText);
    }

    public static boolean equalsStr(String initial, String comparable) {
        List<String> list = parseStr(comparable);
        Set<String> set = new HashSet<>(parseStr(initial));
        for (String s : list) {
            if (!set.contains(s)) {
                return false;
            }
        }
        return true;
    }

    public static List<String> parseStr(String s) {
        return Arrays.stream(s.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "").toLowerCase().split("\\s+")).collect(Collectors.toList());
    }
}
