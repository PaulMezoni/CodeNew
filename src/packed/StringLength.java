package packed;

import java.util.ArrayList;
import java.util.List;

public class StringLength {

    static int lengthOfLastWord(String s) {
        s = s.replace(" ", "");
        System.out.println(s);
        s = s.trim();
        s = s.substring(s.lastIndexOf(" ") + 1);
        return s.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "Hello world";
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s2));

    }
}
