package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 69. x 的平方根
 * <p>
 * 相关标签：数学，二分查找
 * <p>
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
@Service
public class Sqrtx {

    /**
     * 方法一：二分查找
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int l = 0, r = x, ans = -1;
        while (l < r) {
            int center = (l + r) / 2;
            if (center * center <= x) {
                ans = center;
                l = center + 1;
            } else {
                r = center - 1;
            }
        }
        return ans;

    }

}
