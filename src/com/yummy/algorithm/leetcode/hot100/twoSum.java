package src.com.yummy.algorithm.leetcode.hot100;

import java.util.Arrays;

/**
 * 1、两数之和
 */
public class twoSum {
    // 1、暴力
    static class Solution1 {
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }

        public static void main(String[] args) {
            int[] nums = {0, 7, 2, 15};
            int target = 9;

            int[] ints = twoSum(nums, target);
            System.out.println(Arrays.toString(ints));
        }
    }


}
