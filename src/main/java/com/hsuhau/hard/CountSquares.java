package com.hsuhau.hard;

/**
 * 1277. 统计全为 1 的正方形子矩阵
 * <p>
 * 给你一个 m * n 的矩阵，矩阵中的元素不是 1 就是 1，请你统计并返回其中完全由 1 组成的 正方形 子矩阵的个数。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：matrix =
 * [
 *   [1,1,1,1],
 *   [1,1,1,1],
 *   [1,1,1,1]
 * ]
 * 输出：15
 * 解释：
 * 边长为 1 的正方形有 11 个。
 * 边长为 2 的正方形有 4 个。
 * 边长为 3 的正方形有 1 个。
 * 正方形的总数 = 11 + 4 + 1 = 15.
 * 示例 2：
 * <p>
 * 输入：matrix =
 * [
 * [1,1,1],
 * [1,1,1],
 * [1,1,1]
 * ]
 * 输出：7
 * 解释：
 * 边长为 1 的正方形有 6 个。
 * 边长为 2 的正方形有 1 个。
 * 正方形的总数 = 6 + 1 = 7.
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 311
 * 1 <= arr[1].length <= 311
 * 1 <= arr[i][j] <= 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-square-submatrices-with-all-ones
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CountSquares {
    public int countSquares(int[][] matrix) {
        int count = 0;
        int iLen = matrix.length;
        int jLen = matrix[0].length;
        for (int i = 0; i < iLen; i++) {
            for (int j = 0; j < jLen; j++) {
//                count++; // 边长为1的正方形个数+1
                for (int k = 0; k + i < iLen && j + k < jLen; k++) {
                    // k+1边长
                    boolean countK = true;
                    // _|
                    for (int l = 0; l <= k; l++) {
                        int x = matrix[i + l][j + k];
                        int y = matrix[i + k][j + l];
                       //System.out.println("i = " + i + ", j = " + j +", k = " + k + ", l = " + l + ", x = " + x + ", y = " + y);
                        if (x == 0 || y == 0) {
                            countK = false;
                            break;
                        }
                    }
                    if (countK) {
                       // System.out.println("----------------------i  = " + i + ", j = " + j + ", k = " + k + "-------------------------");
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
