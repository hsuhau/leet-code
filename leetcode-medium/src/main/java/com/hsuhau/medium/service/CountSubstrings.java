package com.hsuhau.medium.service;

import org.springframework.stereotype.Service;

/**
 * 647. 回文子串
 * <p>
 * 相关标签：字符串，动态规划
 * <p>
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * <p>
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abc"
 * 输出: 3
 * 解释: 三个回文子串: "a", "b", "c".
 * 示例 2:
 * <p>
 * 输入: "aaa"
 * 输出: 6
 * 说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
 * 注意:
 * <p>
 * 输入的字符串长度不会超过1000。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindromic-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class CountSubstrings {
    private static int num = 0;

    int countSubstrings(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            count(s, i, i, len);
            count(s, i, i + 1, len);
        }
        return num;
    }

    private void count(String s, int start, int end, int len) {
        while (start > 0 && end < len && s.charAt(start) == s.charAt(end)) {
            num++;
            start--;
            end++;
        }
    }
}
