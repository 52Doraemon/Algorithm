package src.com.yummy.algorithm.leetcode.hot100;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1、两数之和
 */
public class twoSum {
    // 1、暴力 --遍历每个数字两两配对相加比对是否匹配
    static class Solution1 {
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }

        public static void main(String[] args) {
            int[] nums = {0, 7, 2, 15};
            int target = 9;

            int[] ints = twoSum(nums, target);
            System.out.println(Arrays.toString(ints));
        }
    }

    // 2、哈希表 --方法一时间复杂度过高的原因是重复匹配和比较。创建一个哈希表，对于每一个 x，我们首先查询哈希表中是否存在 target - x，然后将 x 插入到哈希表中，即可保证不会让 x 和自己匹配。
    static class Solution2 {
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hashTable = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (hashTable.containsKey(target - nums[i])) {
                    return new int[]{hashTable.get(target - nums[i]), i};
                }
                hashTable.put(nums[i], i);
            }

            return new int[0];
        }
    }

}
