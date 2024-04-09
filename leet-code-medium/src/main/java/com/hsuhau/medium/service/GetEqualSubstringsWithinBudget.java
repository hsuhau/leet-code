package com.hsuhau.medium.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//给你两个长度相同的字符串，s 和 t。
//
// 将 s 中的第 i 个字符变到 t 中的第 i 个字符需要 |s[i] - t[i]| 的开销（开销可能为 0），也就是两个字符的 ASCII 码值的差的
//绝对值。
//
// 用于变更字符串的最大预算是 maxCost。在转化字符串时，总开销应当小于等于该预算，这也意味着字符串的转化可能是不完全的。
//
// 如果你可以将 s 的子字符串转化为它在 t 中对应的子字符串，则返回可以转化的最大长度。
//
// 如果 s 中没有子字符串可以转化成 t 中对应的子字符串，则返回 0。
//
//
//
// 示例 1：
//
//
//输入：s = "abcd", t = "bcdf", maxCost = 3
//输出：3
//解释：s 中的 "abc" 可以变为 "bcd"。开销为 3，所以最大长度为 3。
//
// 示例 2：
//
//
//输入：s = "abcd", t = "cdef", maxCost = 3
//输出：1
//解释：s 中的任一字符要想变成 t 中对应的字符，其开销都是 2。因此，最大长度为 1。
//
//
// 示例 3：
//
//
//输入：s = "abcd", t = "acde", maxCost = 0
//输出：1
//解释：a -> a, cost = 0，字符串未发生变化，所以最大长度为 1。
//
//
//
//
// 提示：
//
//
// 1 <= s.length, t.length <= 10^5
// 0 <= maxCost <= 10^6
// s 和 t 都只含小写英文字母。
//
//
// Related Topics 字符串 二分查找 前缀和 滑动窗口 👍 206 👎 0


@Service
@Slf4j
public class GetEqualSubstringsWithinBudget {

    /**
     * FIXME 需要的是连续字符串转换
     *
     * @param s
     * @param t
     * @param maxCost
     * @return
     */
    public int equalSubstring_by_me_wrong_0(String s, String t, int maxCost) {
        int length = s.length();
        int[] costs = new int[length];
        for (int i = 0; i < length; i++) {
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            costs[i] = cost;
        }
        log.info(Arrays.toString(costs));

        Arrays.sort(costs);

        int maxLength = 0;

        int totalCost = 0;
        for (int i = 0; i < length; i++) {
            totalCost += costs[i];
            if (totalCost <= maxCost) {
                maxLength++;
            } else {
                break;
            }
        }

        return maxLength;
    }


    //    fixme
    public int equalSubstring_by_me_wrong_1(String s, String t, int maxCost) {
        int length = s.length();
        int[] costs = new int[length];
        for (int i = 0; i < length; i++) {
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            costs[i] = cost;
        }

        log.info(Arrays.toString(costs));

        int left = 0;
        int right = 0;
        int totalCost = 0;
        int max = 0;
        int now = 0;
        for (int i = left; i <= right; i++) {
            if (right >= costs.length) {
                break;
            }
            int cost = costs[i];
            totalCost += cost;
            if (totalCost <= maxCost) {
                now++;
                right++;
            } else {
                left++;
                right = left;
                log.info("cost = " + cost);
                if (max < now) {
                    max = now;
                }
            }
        }
        return max;
    }

    /**
     * 暴力解法
     */
    public int equalSubstring_by_me_fixed_1(String s, String t, int maxCost) {

        int length = s.length();
        int[] costs = new int[length];
        for (int i = 0; i < length; i++) {
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            costs[i] = cost;
        }

        log.info(Arrays.toString(costs));

        int left = 0;
        int right = 0;
        int totalCost = 0;
        int max = 0;
        int now = 0;
        for (int i = 0; i <= right; i++) {
            if (right >= costs.length) {
                break;
            }
            int cost = costs[right];
            totalCost += cost;
            if (totalCost <= maxCost) {
                now++;
                right++;
                i--;
                if (max < now) {
                    max = now;
                }
            } else {
                right = ++left;
                totalCost = 0;
                now = 0;
                log.info("cost = " + cost);
            }
        }
        return max;
    }


    /**
     * 滑动窗口？暴力
     *
     * @param s
     * @param t
     * @param maxCost
     * @return
     */
    public int equalSubstring_sliding_window_algorithm_like_wrong(String s, String t, int maxCost) {
        int length = s.length();
        int[] costs = new int[length];
        for (int i = 0; i < length; i++) {
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            costs[i] = cost;
        }

        int left = 0;
        int totalCost = 0;
        int max = 0;
        for (int right = 0; right < costs.length; right++) {
            if (right < left) {
                continue;
            }
            int cost = costs[right];
            totalCost += cost;
            if (totalCost <= maxCost) {
                if (max < right - left + 1) {
                    max = right - left + 1;
                }
            } else {
                left++;
                totalCost -= cost;
            }
        }
        return max;
    }
}