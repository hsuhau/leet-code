package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 171. Excel表列序号
 * <p>
 * 相关标签：数学
 * <p>
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 例如，
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * <p>
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 * <p>
 * 输入: "ZY"
 * 输出: 701
 */
@Service
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int num = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            num += (chars[i] - 'A' + 1) * Math.pow(26, len - 1 - i);
        }
        return num;
    }
}
