package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 相关标签：数组，分治算法，动态规划
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
@Service
public class MaximumSubArray {

    /**
     * 解法一、分治法
     * todo 题解
     * @param nums
     * @return
     */
    public int maxSubArray0(int[] nums) {
        return maxSubArrayDivideWithBorder(nums, 0, nums.length - 1);
    }

    private int maxSubArrayDivideWithBorder(int[] nums, int start, int end) {
        //只有一个元素，意味着递归结束
        if (start == end) {
            return nums[start];
        }

        //计算中间值
        int center = (start + end) / 2;
        // 计算左侧子序列最大值
        int leftMax = maxSubArrayDivideWithBorder(nums, start, center);
        // 计算左侧子序列最大值
        int rightMax = maxSubArrayDivideWithBorder(nums, center + 1, end);

        //下面计算横跨连个子序列的最大值
        //计算包含左侧子序列最后一个元素的子序列最大值
        int leftCrossMax = Integer.MIN_VALUE;
        int leftCrossSum = 0;
        for (int i = center; i >= start; i--) {
            leftCrossSum += nums[i];
            leftCrossMax = Math.max(leftCrossMax, leftCrossSum);
        }

        // 计算包含左侧子序列最后一个元素的子序列最大值
        int rightCrossMax = nums[center + 1];
        int rightCrossSum = 0;
        for (int i = center +1; i <=end ; i++) {
            rightCrossSum += nums[i];
            rightCrossMax = Math.max(rightCrossMax, rightCrossSum);
        }

        // 计算跨中心的子序列的最大值
        int crossMax = leftCrossMax + rightCrossMax;

        // 比较三者，返回最大值
        return Math.max(crossMax, Math.max(leftMax, rightMax));
    }

    /**
     * 解法二：动态规划
     * todo 按照解题思路，自己写的
     */
    public int maxSubArray1(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : dp) {
            max = Math.max(max, i);
        }
        return max;
    }
}
