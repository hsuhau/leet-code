package com.hsuhau.medium.service;

import com.hsuhau.common.model.TreeNode;
import org.springframework.stereotype.Service;

/**
 * 98. 验证二叉搜索树
 * 中等
 * 相关标签
 * 相关企业
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 有效 二叉搜索树定义如下：
 * <p>
 * 节点的左
 * 子树
 * 只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [2,1,3]
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [5,1,4,null,null,3,6]
 * 输出：false
 * 解释：根节点的值是 5 ，但是右子节点的值是 4 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点数目范围在[1, 104] 内
 * -231 <= Node.val <= 231 - 1
 * 通过次数
 * 888.1K
 * 提交次数
 * 2.4M
 * 通过率
 * 37.8%
 * 相关标签
 * 树
 * 深度优先搜索
 * 二叉搜索树
 * 二叉树
 */
@Service
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
//        TreeNode treeNode = buildTree(new Integer[]{32, 26, 47, 19, null, null, 56, null, 27});
        TreeNode treeNode = buildTree(new Integer[]{120, 70, 140, 50, 100, 130, 160, 20, 55, 75, 110, 119, 135, 150, 200});
        boolean validBST = isValidBST(treeNode);
        System.out.println("validBST = " + validBST);
    }

    public static boolean isValidBST_wrong(TreeNode root) {
        System.out.println("root = " + root.val);
        int min = root.val;
        int max = root.val;
        TreeNode left = root.left;
//        todo 计算出每条线最大

//        todo 计算出每条线最小

        if (left != null) {
            System.out.println("left = " + left.val);
            if (left.val >= root.val) {
                return false;
            }

            if (!isValidBST(left)) {
                return false;
            }

        }

        TreeNode right = root.right;
        if (right != null) {
            System.out.println("right = " + right.val);
            if (right.val <= root.val) {
                return false;
            }

            if (!isValidBST(right)) {
                return false;
            }
        }

        return true;
    }

    private static TreeNode buildTree(Integer[] array) {
        if (array.length == 0) return null;
        TreeNode root = new TreeNode(array[0]);
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < array.length) {
            TreeNode node = queue.poll();
            if (array[i] != null) {
                node.left = new TreeNode(array[i]);
                queue.offer(node.left);
            }
            i++;
            if (i < array.length && array[i] != null) {
                node.right = new TreeNode(array[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }

    //   inspired by geeks for geeks
    static int maxValue(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int val = node.val;
        int leftMax = node.left.val;
        int rightMax = node.right.val;

        return Math.max(val, Math.max(leftMax, rightMax));
    }

    static int minValue(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int val = node.val;
        int leftMin = node.left.val;
        int rightMin = node.right.val;

        return Math.min(val, Math.min(leftMin, rightMin));
    }

    public static boolean isValidBST(TreeNode root) {
        return true;

    }

    public boolean isValid(TreeNode node, int max, int min) {
        return isValid(node.left, max, min) && isValid(node.right, max, min);
        // 右节点要保证大于父节点，但如果父节点中属于左节点，则需要保证小于父节点的父节点，还要大于父节点的父节点的父节点 wrong?

        // 左节点要保证小于父节点，但如果父节点中属于右节点，则需要保证大于父节点的父节点，还要小于父节点的父节点的父节点 wrong
    }
}
