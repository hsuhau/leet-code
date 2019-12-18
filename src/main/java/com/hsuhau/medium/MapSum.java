package com.hsuhau.medium;

import java.util.*;

/**
 * 677. 键值映射
 *
 * 相关标签：键值映射
 *
 * 实现一个 MapSum 类里的两个方法，insert 和 sum。
 * 对于方法 insert，你将得到一对（字符串，整数）的键值对。字符串表示键，整数表示值。如果键已经存在，那么原来的键值对将被替代成新的键值对。
 * 对于方法 sum，你将得到一个表示前缀的字符串，你需要返回所有以该前缀开头的键的值的总和。
 *
 * 示例 1:
 * 输入: insert("apple", 3), 输出: Null
 * 输入: sum("ap"), 输出: 3
 * 输入: insert("app", 2), 输出: Null
 * 输入: sum("ap"), 输出: 5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/map-sum-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class MapSum {
    private Map<String, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        if (!map.containsKey(key)) {
            map.put(key, val);
        } else {
            map.replace(key, map.get(key), val);
        }
    }

    public int sum(String prefix) {
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) {
                list.add(key);
            }
        }
        int valueSum = 0;
        for (String s : list) {
            valueSum += map.get(s);
        }
        return valueSum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */