package com.hsuhau.medium.service;

import com.hsuhau.common.model.TreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 114. 二叉树展开为链表
 *
 * 相关标签：树，深度优先搜索
 *
 * 给定一个二叉树，原地将它展开为链表。
 *
 * 例如，给定二叉树
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * 将其展开为：
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class Flatten {
    public void flatten(TreeNode treeNode) {
        //todo 可以尝试使用递归
        List<Integer> list = new ArrayList<>();
        TreeNode node = treeNode;
        while (node != null) {
            if (node.left != null) {
                node = node.left;
                list.add(node.val);
            } else if (node.right != null) {
                node = node.right;
                list.add(node.val);
            } else {
                //返回上一级
            }
        }
    }
}
