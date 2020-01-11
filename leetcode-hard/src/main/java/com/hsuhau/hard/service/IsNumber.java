package com.hsuhau.hard.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 65. 有效数字
 *
 * 验证给定的字符串是否可以解释为十进制数字。
 *
 * 例如:
 *
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * " -90e3   " => true
 * " 1e" => false
 * "e3" => false
 * " 6e-1" => true
 * " 99e2.5 " => false
 * "53.5e93" => true
 * " --6 " => false
 * "-+3" => false
 * "95a54e53" => false
 *
 * 说明: 我们有意将问题陈述地比较模糊。在实现代码之前，你应当事先思考所有可能的情况。这里给出一份可能存在于有效十进制数字中的字符列表：
 *
 * 数字 0-9
 * 指数 - "e"
 * 正/负号 - "+"/"-"
 * 小数点 - "."
 * 当然，在输入中，这些字符的上下文也很重要。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class IsNumber {
    public boolean isNumber(String s) {
        // todo

        String first = s.substring(0, 1);
        String last = s.substring(s.length() -1);
        if ("+".equals(last) || ("-").equals(last) || (".").equals(last) || ".".equals(first)) {
            return false;
        }
        List<String> numList = Arrays.asList("0", "1", "2", "3", "4", "5", "7", "6", "8", "9", "e", "+", "-", ".");
        List<String> list = Arrays.asList(s.split(""));
        for (int i = 0; i < list.size(); i++) {
            if (!numList.contains(list.get(i))) {
                return false;
            }
            if (((list.get(i).equals("-") || list.get(i).equals("+") || list.get(i).equals(".")) &&
                    (list.get(i + 1).equals("-") || list.get(i + 1).equals("+") || list.get(i+1).equals(".")))
                    || (i > 0 && (list.get(i).equals("-") || list.get(i).equals("+") || list.get(i).equals(".")) &&
                    (list.get(i - 1).equals("-") || list.get(i - 1).equals("+") || list.get(i-1).equals(".")))
            ) {
                return false;
            }
        }
        return true;
    }

    // let-code答案
    public boolean isNumber2(String s) {
        int allowE = 1;
        int allowDot = 1;
        boolean dotE = false;
        int pre = -1; //行首-1，数字0，e1，+/-2，.3
        s = s.trim();
        if (s.length() == 0 || (s.length() == 1 && !isDigit(s.charAt(0)))) {
            return false;
        }
        if (s.charAt(s.length() - 1) != '.' && !isDigit(s.charAt(s.length() - 1))) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (!isDigit(a) && !isLegalChar(a)) {
                return false;
            }
            if (isDigit(a)) {
                pre = 0;
            }
            if (a == 'e') {
                if ((pre != 0 && pre != 3) || allowE == 0) {
                    return false;
                }
                if (pre == 3 && dotE) {
                    return false;
                }
                allowE = 0;
                allowDot = 0;
                pre = 1;
            }
            if (a == '+' || a == '-') {
                if (pre != -1 && pre != 1) {
                    return false;
                }
                pre = 2;
            }
            if (a == '.') {
                if ((pre != 0 && pre != -1 && pre != 2) || allowDot == 0) {
                    return false;
                }
                dotE = (pre == -1 || pre == 2);
                allowDot = 0;
                pre = 3;
            }
        }
        return !dotE || s.charAt(s.length() - 1) != '.';
    }

    private boolean isDigit(char a) {
        return a >= '0' && a <= '9';
    }

    private boolean isLegalChar(char a) {
        return a == '+' || a == '-' || a == 'e' || a == '.';
    }
}
