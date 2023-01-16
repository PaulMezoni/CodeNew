import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateRepeatImplLogic {

    public <T> void calculateRepeat(List<T> list) {
        System.err.println(list);
        list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public <t> Map<t, Integer> calculateRepeat2(List<t> list) {
        Map<t, Integer> map = new HashMap<>();
        for (t i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else map.put(i, 1);
        }
        return map;
    }
}
