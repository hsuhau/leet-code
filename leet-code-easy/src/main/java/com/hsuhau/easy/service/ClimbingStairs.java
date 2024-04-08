package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * Related Topics 记忆化搜索 数学 动态规划 👍 3488 👎 0
 */
@Service
public class ClimbingStairs {

    private static Map<Integer, Integer> map = new HashMap<>() {
        {
            put(1, 1);
            put(2, 2);
        }
    };

//    暴力递归

    public int climbStairs0(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n > 2) {
            return climbStairs0(n - 1) + climbStairs0(n - 2);
        }
        return 0;
    }


    //    带备忘录的递归解法（自顶向下）
    public int climbStairs1(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, climbStairs1(n - 1) + climbStairs1(n - 2));
        return map.get(n);
    }


    //    动态规划 （一般自底向上）
    public int climbStair2(int n) {
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(i + 1)) {
                map.put(i + 1, map.get(i) + map.get(i - 1));
            }
        }
        return map.get(n);
    }
}
