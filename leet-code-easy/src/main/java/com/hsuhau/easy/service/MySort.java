package com.hsuhau.easy.service;

//实现 int sqrt(int x) 函数。
//
// 计算并返回 x 的平方根，其中 x 是非负整数。
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
// 示例 1:
//
// 输入: 4
//输出: 2
//
//
// 示例 2:
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842...,
//     由于返回类型是整数，小数部分将被舍去。
//
// Related Topics 数学 二分查找
// 👍 707 👎 0


import org.springframework.stereotype.Service;

//leetcode submit region begin(Prohibit modification and deletion)
@Service
public class MySort {
    public static void main(String[] args) {
        MySort mySort = new MySort();
        System.out.println(mySort.mySqrt(2147395600));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(289398 * 289398);
        System.out.println(2147395600);
        System.out.println(289399 * 289399);
    }


    // todo 未通过
    public int mySqrt(int x) {
        for (int i = 0; i <= x; i++) {
            if (i * i <= x && (i + 1) * (i + 1) > x) {
                return i;
            }
        }
        return 0;
    }
}
