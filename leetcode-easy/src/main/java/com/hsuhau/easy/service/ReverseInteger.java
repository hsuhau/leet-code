package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
@Service
public class ReverseInteger {

    public int reverse(int x) {
        Long xLong = new Long(x);
        long absX = Math.abs(xLong);
        if (xLong < 0 && -xLong != (int) (-xLong)) {
            return 0;
        }
        int len = 0;
        while (absX >= Math.pow(10, len + 1)) {
            len++;
        }
        long result = 0;
        for (int i = 0; i <= len; i++) {
            long mod = (long) Math.pow(10, len - i);
            long tmp = absX / mod;
            absX -= tmp * mod;
            result += tmp * (long) Math.pow(10, i);
            if (result != (int) result) {
                return 0;
            }
        }
        return x > 0 ? (int) result : -(int) result;
    }
}
