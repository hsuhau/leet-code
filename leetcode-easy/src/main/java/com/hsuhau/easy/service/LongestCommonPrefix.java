package com.hsuhau.easy.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String min = strs[0];
        int len = strs.length;
        for (int i = 0; i < len; i++) {
            if (strs[i].length() < min.length()) {
                min = strs[i];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < min.length(); j++) {
                String str = strs[i];
                char c = str.length() > j ? str.charAt(j) : 'A';
                char a = min.toCharArray()[j];
                if (a != c) {
                    min = min.substring(0, j);
                }
            }
        }
        return min;
    }
}
