package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamIterate {
    public static void main(String[] args) {

        IntStream.iterate(1, x -> x + 1).limit(5).forEach(s -> System.out.print(s + " "));
//        IntStream.iterate(1, x -> x + 1).sorted().limit(5).forEach(System.out::println);
        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        list.stream().filter(s -> !s.equals("A")).forEach(System.out::println);
        list.stream().forEach(x -> {
            if (x.equals("C")) {
                list.remove("C");
            }
        });
    }

}
