package stream;

import java.util.*;

public class StreamFindFirst {

    public static void main(String[] args) {
        List<Integer> list =
                List.of(1, 2, 2, 3, 3, 4, 5);
        list.stream().filter(s -> list.stream().filter(s::equals).count() == 1).forEach(s -> {
            for (int i : list) {
                if (i == s) {
                    System.out.println(s + " ");
                    continue;
                }
                break;
            }
        });
        Optional<Integer> integer = list.stream().distinct().findFirst();
        System.out.println(integer);

        Set<Integer> set = new HashSet<>(list);
        set.stream().limit(1).forEach(System.out::println);

        List<Integer> listNew = new ArrayList<>();
        int x;
        for (int i = 0; i < list.size(); i++) {
            x = list.get(i);
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j) != (x)) {
                    listNew.add(x);
                } else {
                    break;
                }
            }
        }
        System.out.println(listNew);
    }
}
