package impl;


import java.util.List;
import java.util.stream.Collectors;

public class Calculate {

    public static <T> void calculate(List<T> list) {
        list.stream().sorted().collect(Collectors.groupingBy(k -> k, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}