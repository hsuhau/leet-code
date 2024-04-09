package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * 172. 阶乘后的零
 * <p>
 * 相关标签：数学
 * <p>
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 * <p>
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 说明: 你算法的时间复杂度应为 O(log n)
 */
@Service
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial = " + factorial);
        int zeroCount = 0;
        while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            zeroCount++;
            factorial = factorial.divide(BigInteger.TEN);
        }
        return zeroCount;
    }
}
