package com.hsuhau.easy.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 9. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int len = 0;
        while (x >= Math.pow(10, len + 1)) {
            len++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= len; i++) {
            int mod = (int) Math.pow(10, len - i);
            int tmp = x / mod;
            x -= tmp * mod;
            list.add(tmp);
        }

        for (int i = 0; i <= len; i++) {
            if (list.get(i) != list.get(len - i)) {
                return false;
            }
        }
        return true;
    }
}
