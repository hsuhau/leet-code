package com.hsuhau.medium.service;

import com.hsuhau.common.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题32 - III. 从上到下打印二叉树 III
 *
 * 相关标签：树、广度优先搜索
 *
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 *
 * 提示：
 *
 * 节点总数 <= 1000
 * 通过次数4,485提交次数7,484
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        //todo what to do
        return list;
    }
}
