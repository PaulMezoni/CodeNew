import java.util.List;

public class Master {
    public static void main(String[] args) {
        System.out.println("Hello world");

        List<Integer> list = List.of(1, 2, 2, 3, 3, 3, 4, 5);
        CalculateRepeat.calculateRepeat(list);
    }
}
