import java.util.List;

public class mane {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 3, 3, 4, 5);
        CalculateRepeatImplLogic calculateRepeatImplLogic = new CalculateRepeatImplLogic();
        calculateRepeatImplLogic.calculateRepeat(list);
        System.out.println(calculateRepeatImplLogic.calculateRepeat2(list));
    }
}
