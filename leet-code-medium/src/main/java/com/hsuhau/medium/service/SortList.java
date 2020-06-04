package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 148. 排序链表
 * <p>
 * 相关标签：排序，链表
 * <p>
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * <p>
 * 示例 1:
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * <p>
 * 示例 2:
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
@Service
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = head;
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        while (next.next != null) {
            next = next.next;
            list.add(next);
        }
        Collections.sort(list, Comparator.comparing(l -> l.val));
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
            list.get(i + 1).next = null;
        }
        ListNode result = list.get(0);
        return result;
    }
}
