package com.hsuhau.medium.service;

import org.springframework.stereotype.Service;

/**
 * 5. 最长回文子串
 *
 * 相关标签：字符串，动态规划
 *
 *
 * 题目描述
 * 评论 (1.4k)
 * 题解(308)
 * 提交记录
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 */

@Service
public class LongestPalindrome {

    // 中心扩展算法
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int lenX = expandAroundCenter(s, i, i);
            int lenY = expandAroundCenter(s, i, i + 1);
            int len = Math.max(lenX, lenY);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
