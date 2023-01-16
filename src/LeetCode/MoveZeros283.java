package LeetCode;

import java.util.Arrays;

//283. Move Zeroes
//228. Summary Ranges
class MoveZeros283 {
    //    Input: nums = [0,1,0,3,12]
    //    Output: [1,3,12,0,0]

    public static void main(String[] args) {
        int[] i = {0, 1, 0, 3, 12};
        moveZeroes(i);
        moveZeroes2(i);
        String s = "Здраввввствуууй, Сберрррр!";

    }

    public static void moveZeroes2(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[n];
                nums[n++] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0, lastZero = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != lastZero) {
                    nums[lastZero] = nums[i];
                    nums[i] = 0;
                }
                lastZero++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
