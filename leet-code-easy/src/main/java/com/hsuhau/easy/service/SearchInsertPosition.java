package com.hsuhau.easy.service;

// 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 你可以假设数组中无重复元素。
//
// 示例 1:
//
// 输入: [1,3,5,6], 5
// 输出: 2
//
//
// 示例 2:
//
// 输入: [1,3,5,6], 2
// 输出: 1
//
//
// 示例 3:
//
// 输入: [1,3,5,6], 7
// 输出: 4
//
//
// 示例 4:
//
// 输入: [1,3,5,6], 0
// 输出: 0
//
// Related Topics 数组 二分查找

import org.springframework.stereotype.Service;

// leetcode submit region begin(Prohibit modification and deletion)
@Service
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < target) {
                if (i + 1 < nums.length && nums[i + 1] > target) {
                    return i + 1;
                }
            } else if (nums[i] == target) {
                return i;
            } else {
                return 0;
            }
        }
        return nums.length;
    }

    /**
     * 分治
     * todo 注意
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert0(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
// leetcode submit region end(Prohibit modification and deletion)
