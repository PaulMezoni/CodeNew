package TaskCodeCombat;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalculateRepeat {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 1, 2, 3, 4, 5, 6);
        calculateRepeat(list);
    }

    private static void calculateRepeat(List<Integer> list) {
        list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
