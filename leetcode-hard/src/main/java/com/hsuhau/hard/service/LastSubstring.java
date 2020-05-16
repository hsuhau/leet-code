package com.hsuhau.hard.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1163. 按字典序排在最后的子串
 * <p>
 * 给你一个字符串 s，找出它的所有子串并按字典序排列，返回排在最后的那个子串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入："abab"
 * 输出："bab"
 * 解释：我们可以找出 7 个子串 ["a", "ab", "aba", "abab", "b", "ba", "bab"]。按字典序排在最后的子串是 "bab"。
 * 示例 2：
 * <p>
 * 输入："leetcode"
 * 输出："tcode"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 4 * 10^5
 * s 仅含有小写英文字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/last-substring-in-lexicographical-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Service
public class LastSubstring {
    // todo

    public String lastSubstring(String s) {

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
}
