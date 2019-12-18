package com.hsuhau.medium;

import com.hsuhau.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 *
 * 相关标签：栈，树
 *
 * 题目描述
 *
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class PreOrderTraversal {
    public List<Integer> preOrderTraversal(TreeNode root) {
        //前序遍历：根结点 ---> 左子树 ---> 右子树
        //中序遍历：左子树---> 根结点 ---> 右子树
        //后序遍历：左子树 ---> 右子树 ---> 根结点
        //层次遍历：只需按层次遍历即可

        // todo 没想明白

        //todo 迭代算法，未完成， 没有看懂答案

        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (root != null) {
            if (root.right != null) {
                list.add(root.right.val);
                root = root.right;
            } else if (root.left != null) {
                list.add(root.left.val);
                root = root.left;
            } else {
                return list;
            }

        }
        return null;
    }
}
