package packed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamStr {
    public static void main(String[] args) {
        String str = "Я люблю язык Java, потому что я изучаю java";
        System.out.println(calculate(str));

        int[] i = new int[]{1, 2, 3, 1, 1, 1, 1, 1, 1, 1};
        int target = 2;
        System.out.println(Arrays.toString(twoSum(i, target)));
        List<Integer> integers = List.of(1, 2, 3, 1, 1, 1);
        System.out.println(method(integers));

    }

    static Map<Object, Long> calculate(String str) {
        return Arrays.stream(str.toLowerCase().split(" ")).collect(Collectors.groupingBy(k -> k, Collectors.counting()));

    }

    static <T> List<T> method(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        for (T t : list) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            }
            map.put(t, 1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (map.containsValue(2)) {
                list.remove(list.get(i));
            }
        }
        return list;
    }

    static int[] twoSum(int[] numbs, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = numbs.length - 1; i >= 0; i--) {
            if (map.containsKey(target - numbs[i])) {
                return new int[]{map.get(target - numbs[i]), i};
            }
            map.put(numbs[i], i);
        }
        return new int[0];
    }
}
