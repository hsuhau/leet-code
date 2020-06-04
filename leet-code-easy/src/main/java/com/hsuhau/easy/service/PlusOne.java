package com.hsuhau.easy.service;

import java.math.BigInteger;

/**
 * 66. 加一
 * <p>
 * 相关标签：数组
 * <p>
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        BigInteger start = BigInteger.ZERO;
        int len = digits.length;
        for (int i = 0; i < len; i++) {
            start = start.add(BigInteger.valueOf(digits[i]).multiply(BigInteger.valueOf(10).pow(len - 1 - i)));
        }
        BigInteger end = start.add(BigInteger.valueOf(1));
        int length = String.valueOf(end).length();
        int[] res = new int[length];
        for (int i = 0; i < res.length; i++) {
            res[i] = (end.divide(BigInteger.valueOf(10).pow((length - i - 1)))).intValue();
            end = end.mod((BigInteger.valueOf(10).pow((length - i - 1))));
        }
        return res;
    }

    public int[] plusOne0(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i - 1]++;
                digits[i] -= 10;
            }
        }
        if (digits[0] < 10) {
            return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = digits[0] / 10;
        res[1] = digits[0] % 10;
        for (int i = 2; i < res.length; i++) {
            res[i] = digits[i -1];
        }
        return res;
    }
}
