import java.util.List;
import java.util.stream.Collectors;

public class CalculateRepeat {
    public static <T> void calculateRepeat(List<T> list) {
        System.err.println(list);
        list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
