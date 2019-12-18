package com.hsuhau.medium;

/**
 * 3. 无重复字符的最长子串
 *
 * 相关标签：哈希表，双指针，字符串，滑动窗口
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        // todo 解答错误

//        List<String> array = Arrays.asList(s.split(""));
//        List<String> characterList = new ArrayList<>();
//
//        for (String c : array) {
//            if (!characterList.contains(c)) {
//                characterList.add(c);
//            }
//        }
//        int len = 0;
//        for (String c : characterList) {
//            for (String x : array) {
//                int lenB = array.indexOf(x);
//                s.indexOf("");
//            }
//        }
//
//        return len;

        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i),flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }

    public static void main(String[] args) {

    }
}
