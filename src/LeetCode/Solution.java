package LeetCode;

public class Solution {
    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(f(5));

        int result = 0;
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                i += 1;
            }
            result = i + (i - 1);
            System.out.print(result + " ");
        }
    }

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    static long factorial(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}
