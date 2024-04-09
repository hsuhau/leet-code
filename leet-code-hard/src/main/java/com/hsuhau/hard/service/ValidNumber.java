package com.hsuhau.hard.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// 65 有效数字（按顺序）可以分成以下几个部分：
//
//
// 一个 小数 或者 整数
// （可选）一个 'e' 或 'E' ，后面跟着一个 整数
//
//
// 小数（按顺序）可以分成以下几个部分：
//
//
// （可选）一个符号字符（'+' 或 '-'）
// 下述格式之一：
//
// 至少一位数字，后面跟着一个点 '.'
// 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
// 一个点 '.' ，后面跟着至少一位数字
//
//
//
// 整数（按顺序）可以分成以下几个部分：
//
//
// （可选）一个符号字符（'+' 或 '-'）
// 至少一位数字
//
//
// 部分有效数字列举如下：["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7
//", "+6e-1", "53.5e93", "-123.456e789"]
//
// 部分无效数字列举如下：["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]
//
// 给你一个字符串 s ，如果 s 是一个 有效数字 ，请返回 true 。
//
//
//
// 示例 1：
//
//
//输入：s = "0"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "e"
//输出：false
//
//
// 示例 3：
//
//
//输入：s = "."
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 20
// s 仅含英文字母（大写和小写），数字（0-9），加号 '+' ，减号 '-' ，或者点 '.' 。
//
//
// Related Topics 字符串 👍 372 👎 0

@Service
public class ValidNumber {
    public boolean isNumber(String s) {
        // 判断整数
        if (!s.contains(".")) {

        }
        if (s.contains("e")) {
            if (s.charAt(s.indexOf("e")) == (s.length() - 1) || !Character.isDigit(s.charAt(s.indexOf("e") + 1))) {

            }
        }
        return false;
    }

    public boolean isNumber_wrong(String s) {
        String first = s.substring(0, 1);
        String last = s.substring(s.length() - 1);
        if ("+".equals(last) || ("-").equals(last) || (".").equals(last) || ".".equals(first)) {
            return false;
        }
        List<String> numList = Arrays.asList("0", "1", "2", "3", "4", "5", "7", "6", "8", "9", "e", "+", "-", ".");
        List<String> list = Arrays.asList(s.split(""));
        for (int i = 0; i < list.size(); i++) {
            if (!numList.contains(list.get(i))) {
                return false;
            }
            if (((list.get(i).equals("-") || list.get(i).equals("+") || list.get(i).equals("."))
                    && (list.get(i + 1).equals("-") || list.get(i + 1).equals("+") || list.get(i + 1).equals("."))) || (i > 0 && (list.get(i).equals("-") || list.get(i).equals("+") || list.get(i).equals("."))
                    && (list.get(i - 1).equals("-") || list.get(i - 1).equals("+") || list.get(i - 1).equals(".")))
            ) {
                return false;
            }
        }
        return true;
    }
}
