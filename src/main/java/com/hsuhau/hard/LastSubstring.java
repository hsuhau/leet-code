package com.hsuhau.hard;

import java.util.Arrays;
import java.util.List;

/**
 * 1163. 按字典序排在最后的子串
 *
 * 给你一个字符串 s，找出它的所有子串并按字典序排列，返回排在最后的那个子串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："abab"
 * 输出："bab"
 * 解释：我们可以找出 7 个子串 ["a", "ab", "aba", "abab", "b", "ba", "bab"]。按字典序排在最后的子串是 "bab"。
 * 示例 2：
 *
 * 输入："leetcode"
 * 输出："tcode"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 4 * 10^5
 * s 仅含有小写英文字符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/last-substring-in-lexicographical-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LastSubstring {
    // todo

    public static String lastSubstring(String s) {

        List<String> sList = Arrays.asList(s.split(""));
        char[] sChar = s.toCharArray();
        String lst = "";
        char lsr = 'a';
        System.out.println((byte) 'a');
        System.out.println((byte) 'z');
        for (char c : sChar) {
            if ((byte) c > (byte) lsr) {
                lsr = c;
            }
        }
        System.out.println(lsr);
//        if () {
//        }
        return s.substring(s.indexOf(lsr));
    }

    public static void main(String[] args) {
        lastSubstring("leetcode");
    }
}
