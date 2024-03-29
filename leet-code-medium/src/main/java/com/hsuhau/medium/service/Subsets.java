package com.hsuhau.medium.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 * <p>
 * 相关标签：位运算，数组，回溯算法
 * <p>
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int size = lists.size();
            for (int j = 0; j < size; j++) {
                List<Integer> tmp = new ArrayList<>(lists.get(j));
                tmp.add(num);
                lists.add(tmp);
            }
        }
        return lists;
        /**
         * List<List<Integer>> res = new ArrayList<>();
         *         res.add(new ArrayList<>());
         *         for (int i = 0; i < nums.length; i++) {
         *            int all = res.size();
         *             for (int j = 0; j < all; j++) {
         *                 List<Integer> tmp = new ArrayList<>(res.get(j));
         *                 tmp.add(nums[i]);
         *                 res.add(tmp);
         *             }
         *         }
         *         return res;
         */
    }
}
