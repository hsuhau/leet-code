package com.hsuhau.easy;

import com.hsuhau.common.TreeNode;

import java.util.Stack;

/**
 * 938. 二叉搜索树的范围和
 *
 * 相关标签：树，递归
 *
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 *
 * 二叉搜索树保证具有唯一的值。
 *
 * 示例 1：
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 *
 * 示例 2：
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/range-sum-of-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RangeSumBST {
    /**
     * 递归实现深度优先搜索
     * @param root
     * @param L
     * @param R
     * @return
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val > L && root.val < R) {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        } else if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        } else {
            return rangeSumBST(root.left, L, R);
        }
    }

    /**
     * 迭代实现深度优先搜索
     *
     * 复杂度分析
     * 时间复杂度：O(N)O(N)，其中 NN 是树中的节点数目。
     * 空间复杂度：O(H)O(H)，其中 HH 是树的高度
     *
     * @param root
     * @param L
     * @param R
     * @return
     */
    public int rangeSumBST0(TreeNode root, int L, int R) {
        int result = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.val >= L && node.val <= R) {
                    result +=node.val;
                }
                if (node.val < R) {
                    stack.push(node.right);
                }
                if (node.val > L) {
                    stack.push(node.left);
                }
            }
        }
        return result;
    }


}
