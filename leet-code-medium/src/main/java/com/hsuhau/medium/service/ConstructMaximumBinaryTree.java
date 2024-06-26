package com.hsuhau.medium.service;

import com.hsuhau.common.model.TreeNode;
import org.springframework.stereotype.Service;

/**
 * 654. 最大二叉树
 * <p>
 * 相关标签：树
 * <p>
 * <p>
 * 题目描述
 * 评论 (139)
 * 题解(75)
 * 提交记录
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * <p>
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * <p>
 * <p>
 * <p>
 * 示例 ：
 * <p>
 * 输入：[3,2,1,6,0,5]
 * 输出：返回下面这棵树的根节点：
 * <p>
 * 6
 * /   \
 * 3     5
 * \    /
 * 2  0
 * \
 * 1
 * <p>
 * <p>
 * 提示：
 * <p>
 * 给定的数组的大小在 [1, 1000] 之间。
 */

@Service
public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    // 递归
    public TreeNode construct(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int max = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max]);
        root.left = construct(nums, l, max);
        root.right = construct(nums, max + 1, r);
        return root;
    }

    public int max(int[] nums, int l, int r) {
        int max = l;
        for (int i = l; i < r; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }
}
