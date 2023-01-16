import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = List.of(1, 2, 3, 1, 1);

        String s0 = "2      *4";
        String[] split = s0.split("[+-/*]");
        int a = Integer.parseInt(split[0].trim());
        int b = Integer.parseInt(split[1].trim());
        char c = s0.charAt(split[0].length());
        System.out.println(sum(a, b, c));

    }

    public static int sum(int a, int b, char c) {
        if ('+' == c) {
            return a + b;
        } else if (c == '*') {
            return a * b;
        }
        return -1;
    }

    public static void main2(java.lang.String[] args) {
        System.out.println("read");
    }

    public static int sum(int a, int b) {
        return a * 2;
    }

}
