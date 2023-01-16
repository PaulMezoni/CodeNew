//* Дана строка, состоящая из букв A-Z:
//        * "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
//        * Нужно написать функцию RLE, которая на выходе даст строку вида:
//        * "A4B3C2XYZD4E3F3A6B28"
//        * И сгенерирует любую ошибку, если на вход пришла невалидная строка.
//        *
//        * Пояснения:
//        * 1. Если символ встречается 1 раз, он остается без изменений
//        * 2. Если символ повторяется более 1 раза, к нему добавляется количество повторений
//        */

import java.util.Arrays;

public class RleFunc {

    public static void main(String[] args) throws Exception {
        String string1 = "ABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        String string2 = "AAAABBBCCXYZ";
//        System.out.println(countElement(string1));
        System.out.println(countEle(string2));
        System.out.println(countEle(string1));
//        System.out.println(countElement(string2));
//        System.out.println(countEle(string1));
    }

    static int countEle(String s) {
        String[] split = s.split("");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            count++;
        }
        return count;
    }

    public static String countElem(String targetString) throws IllegalArgumentException {
        String[] s = targetString.split("");
        char[] c = targetString.toCharArray();
        System.out.println(c);
        int count = 1;
        StringBuilder str = new StringBuilder();
        return str.toString();
    }

    public static String countElement(String targetString) throws IllegalArgumentException {
        //проверяем корректны ли данные пришли согласно ТЗ
        boolean isNotCorrect = Arrays.stream(targetString.split(""))
                .anyMatch(el -> el.matches("[^A-Z]") || targetString.length() == 0);

        //если данные не корректны бросаем исключение
        if (isNotCorrect) {
            throw new IllegalArgumentException("Не валидные данные");
        }

        StringBuilder stringBuilder = new StringBuilder();
        //алгоритм подсчета
        for (int i = 0, count = 1; i < targetString.length(); i++) {
            if (i + 1 < targetString.length() && targetString.charAt(i) == targetString.charAt(i + 1))
                count++;
            else {
                stringBuilder.append(targetString.charAt(i));
//                count = 1;
            }
        }
        //возращаем результат, попутно убирая цифру 1
//        return stringBuilder.toString().replaceAll("1", "");
        return stringBuilder.toString();
    }
}
