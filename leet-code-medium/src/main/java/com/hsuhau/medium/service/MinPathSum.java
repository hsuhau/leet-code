package com.hsuhau.medium.service;

import org.springframework.stereotype.Service;

/**
 * 64. 最小路径和
 * <p>
 * 相关标签：数组，动态规划
 * <p>
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * 输入:
 * [
 *   [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        // todo 没看懂答案
        int[] dp = new int[grid[0].length];
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j != 0) {

                } else if (i != 0 && j == 0) {

                } else if (i != 0 && j != 0) {

                } else {

                }
            }
        }
        return grid[row - 1][col - 1];
    }
}
