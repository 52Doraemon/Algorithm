package src.com.yummy.algorithm.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 49. 字母异位词分组
 * 题目：给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 说明：字母异位词指字母相同，但排列不同的字符串。
 */
public class GroupAnagrams {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            return new ArrayList<>(Arrays.stream(strs)
                    .collect(Collectors.groupingBy(str -> {
                        // 返回 str 排序后的结果。
                        // 按排序后的结果来 grouping by ，算子类似于 sql 里的 group by。
                        char[] array = str.toCharArray();
                        Arrays.sort(array);
                        return new String(array);
                        // 注意 groupingBy 算子计算完以后，返回的是一个 Map<String, List<String>>，map 的键是每种排序后的字符串，值是聚合的原始字符串，现在只关心值，所以最后 new ArrayList<>(map.values())
                    })).values());
        }
    }
}
