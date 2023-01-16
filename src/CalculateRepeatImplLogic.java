import java.util.List;
import java.util.stream.Collectors;

public class CalculateRepeatImplLogic implements One {

    @Override
    public int method(int i) {
        return i;
    }

    public <T> void calculateRepeat(List<T> list) {
        list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
