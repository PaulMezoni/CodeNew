package main;

import java.util.List;

import static impl.Calculate.calculate;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 3, 3, 4, 5);
        calculate(list);
    }
}
