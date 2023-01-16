package TaskCodeCombat;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MinElement {
    public static void main(String[] args) {
        int[] i = {2, 3, 45, 13, 18, 19, 20, 800, 1};
        System.out.println(minElement(i));
        OptionalInt min = Arrays.stream(i).max();
        System.out.println(min);
    }

    static int minElement(int[] ints) {
        int min = ints[0];
        for (int j = 1; j < ints.length; j++) {
            if (min > ints[j]) {
                min = ints[j];
            }
        }
        return min;
    }
}
