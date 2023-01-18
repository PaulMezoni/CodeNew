public class RevertSymbol {
    public static boolean revert(String s) {
        s = s.trim();
        System.out.println(s);
        return s.equals(new StringBuilder(s.toLowerCase()).reverse().toString());
    }

    public static void main(String[] args) {
        String s = "ama ";
        String s2 = "amas";

        System.out.println(revert(s));
        System.out.println(revert(s2));
    }
}
