import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateRepeatImplLogic implements One {

    @Override
    public int method(int i) {
        return i;
    }

    public <T> void calculateRepeat(List<T> list) {
        list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public <t> void calculateRepeat2(List<t> list) {
        Map<t, Integer> map = new HashMap<>();
        for (t i : list) {
            if (map.containsKey(i)) ;
        }
    }
}
