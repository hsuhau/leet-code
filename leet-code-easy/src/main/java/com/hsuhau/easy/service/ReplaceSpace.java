package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 面试题05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= s 的长度 <= 10000
 */
@Service
public class ReplaceSpace {
    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    public String replaceSpace0(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        return new String(array, 0, size);
    }
}
