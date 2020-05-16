package com.hsuhau.medium.service;

import com.hsuhau.common.model.TreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 94. 二叉树的中序遍历
 * <p>
 * 相关标签：栈，树，哈希表
 * <p>
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class InOrderTraversal {
    // 递归
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;

    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            helper(root.left, result);
            result.add(root.val);
            helper(root.right, result);
        }
    }

    // 栈
    public List<Integer> inOrderTraversal0(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }

    // 莫里斯遍历， 不破坏原结构
    public List<Integer> inOrderTraversal1(TreeNode root) {
        List<Integer> ldr = new ArrayList<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null) {
            // 左子树为空，输出当前节点，将其右孩子作为当前节点
            if (cur.left == null) {
                ldr.add(cur.val);
            } else {
                pre = cur.left;
                // 找到前驱节点，即左子树中的最右节点
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                // 如果前驱节点的右孩子为空，将他的you孩子设置为当前节点。当前节点更新为当前节点的左孩子
                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                }
                // 如果前驱节点的右孩子为当前节点，将它的右孩子重新设为空（回复数的形状），输出当前节点，当前节点更新为当前节点的右孩子

                if (pre.right == cur) {
                    pre.right = null;
                    ldr.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return ldr;
    }
}
