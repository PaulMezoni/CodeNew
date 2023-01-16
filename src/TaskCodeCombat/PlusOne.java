package TaskCodeCombat;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] x0 = {1}, x2 = {1, 0}, x4 = {1, 0, 0};
        System.out.println(arraysToString(x0) + " " + Arrays.equals(x0, plusOne(new int[]{0})) + " " + (arraysToString(plusOne(new int[]{0}))));
        System.out.println(arraysToString(x2) + " " + Arrays.equals(x2, plusOne(new int[]{9})) + " " + (arraysToString(plusOne(new int[]{9}))));
        System.out.println(arraysToString(x4) + " " + Arrays.equals(x4, plusOne(new int[]{9, 9})) + " " + (arraysToString(plusOne(new int[]{9, 9}))));
        System.out.println();
        System.out.println(arraysToString(x0) + " " + Arrays.equals(x0, plusOne2(new int[]{0})) + " " + (arraysToString(plusOne2(new int[]{0}))));
        System.out.println(arraysToString(x2) + " " + Arrays.equals(x2, plusOne2(new int[]{9})) + " " + (arraysToString(plusOne2(new int[]{9}))));
        System.out.println(arraysToString(x4) + " " + Arrays.equals(x4, plusOne2(new int[]{9, 9})) + " " + (arraysToString(plusOne2(new int[]{9, 9}))));
    }

    static String arraysToString(int[] a) {
        return Arrays.toString(a);
    }


    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (digits[i] == 9) {
            digits[i] = 0;
            i--;
            if (i < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (i >= 0) {
            digits[i]++;
        }
        return digits;
    }

    public static int[] plusOne2(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        Integer i = Integer.parseInt(sb.toString()) + 1;
        String s = String.valueOf(i);
        char[] chars = s.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (digits.length < chars.length) {
                digits = new int[digits.length + 1];
            }
            digits[j] += Character.digit(chars[j], 10);
        }
        return digits;
    }
}
