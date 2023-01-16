package packed;

import java.util.*;
import java.util.stream.IntStream;

public class Exam {
    public static void main(String[] args) {

        int[][] ii = new int[][]{{1, 2}, {3, 4}};
        IntStream integerStream = Arrays.stream(ii).flatMapToInt(Arrays::stream);
        System.out.println(Arrays.toString(integerStream.toArray()));

        int[] i = {1, 5, 2};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(i, target)));


    }


    public static int[] twoSum(int[] numbs, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            if (map.containsKey(target - numbs[i])) {
                return new int[]{map.get(target - numbs[i]), i};
            }
            map.put(numbs[i], i);
        }
        return new int[0];
    }
}

