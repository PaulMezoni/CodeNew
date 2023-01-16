import java.nio.CharBuffer;
import java.util.Arrays;

public class DeleteDuplicateChar {
    public static void main(String[] args) {
        String str = "Прииивеееттт, Сбеееерррр!";
        System.out.println(deduplicate(str));
        char[] charArray = str.toCharArray();
        CharBuffer.wrap(charArray).chars().distinct().forEach(c -> System.out.print((char) c + " "));
    }

    static String deduplicate(String s) {
        String[] str = s.split(", ");
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            break;
        }
        return s;
    }
}
