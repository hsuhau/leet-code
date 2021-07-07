package com.hsuhau.easy.service;

// 实现 strStr() 函数。
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
// 果不存在，则返回 -1。
//
// 示例 1:
//
// 输入: haystack = "hello", needle = "ll"
// 输出: 2
//
//
// 示例 2:
//
// 输入: haystack = "aaaaa", needle = "bba"
// 输出: -1
//
//
// 说明:
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
// Related Topics 双指针 字符串

import org.springframework.stereotype.Service;

// leetcode submit region begin(Prohibit modification and deletion)
@Service
public class ImplementStrStr {
  public int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }

  /**
   * 方法一：子串逐一比较 - 线性时间复杂度 最直接的方法 - 沿着字符换逐步移动滑动窗口，将窗口内的子串与 needle 字符串比较。
   *
   * @param haystack
   * @param needle
   * @return
   */
  public int strStr0(String haystack, String needle) {
    int L = needle.length(), n = haystack.length();

    for (int start = 0; start < n - L + 1; ++start) {
      if (haystack.substring(start, start + L).equals(needle)) {
        return start;
      }
    }
    return -1;
  }

  /**
   * 方法二：双指针 - 线性时间复杂度
   *
   * @param haystack
   * @param needle
   * @return
   */
  public int strStr1(String haystack, String needle) {

    //todo 参照官方题解 然而结果不对
    int L = needle.length(), n = haystack.length();

    if (L == 0) return 0;

    int pn = 0;
    while (pn < n - L + 1) {
      while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
        pn++;
      }
      int pl = 0;
      while (pn < L && pn < n && haystack.charAt(pn) == needle.charAt(pl)) {
        ++pn;
        ++pl;
      }
      if (pl == L) {
        return pn - L;
      }
      pn = pn - pl + 1;
    }
    return -1;
  }

  /**
   * 方法三： Rabin Karp - 常数复杂度
   * todo
   * @param haystack
   * @param needle
   * @return
   */
  public int strStr2(String haystack, String needle) {
    return -1;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
