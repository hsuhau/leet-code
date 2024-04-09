package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 88. 合并两个有序数组
 * <p>
 * 相关标签：数组，双指针
 * <p>
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * <p>
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 *
 * @see <a href="https://leetcode-cn.com/problems/merge-sorted-array/">https://leetcode-cn.com/problems/merge-sorted-array/</a>
 */
@Service
public class MergeSortedArray {
    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n     todo 实现有问题，nums1并未改变
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = m - 1;
        int point2 = n - 1;
        int point = m + n - 1;
        while (point1 >= 0 && point2 >= 0) {
//            if (nums1[point1] >= nums2[point2]) {
//                nums1[point] = nums1[point1];
//                point1--;
//            } else {
//                nums1[point] = nums2[point2];
//                point2--;
//            }
//            point--;
            // 神奇
            nums1[point--] = nums1[point1] >= nums2[point2] ? nums1[point1--] : nums2[point2--];
        }

        // 参考官方题解，add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, point2 + 1);
    }
}
