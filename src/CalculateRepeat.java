import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateRepeat {
    public static void main(String[] args) {
        List<Integer> listInt = List.of(1, 2, 3, 1);
        List<String> listString = List.of("Max", "Paul", "Max");
        ArrayList<String> listString2 = new ArrayList<>();
        listString2.add("Max");
        listString2.add("Max");
        listString2.add("Paul");

        System.out.println(extracted(listInt));
        System.out.println(extracted(listString));
        extracted(listString2);
    }

    static <T> Map<T, Long> extracted(List<T> list) {
        return list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
    }

    static <T> void extracted(ArrayList<T> list) {
        list.stream().sorted().collect(Collectors.groupingBy(k -> k, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
