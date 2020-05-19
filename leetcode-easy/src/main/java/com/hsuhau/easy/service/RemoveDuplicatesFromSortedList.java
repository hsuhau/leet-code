package com.hsuhau.easy.service;

import com.hsuhau.common.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        List<Integer> list = new ArrayList<>();
        list.add(head.val);
        while (head.next != null) {
            if (!list.contains(head.next.val)) {
                list.add(head.next.val);
            }
            head = head.next;
        }
        ListNode root = new ListNode(head.val);
        for (int i = list.size() -2 ; i > -1; i--) {
//            root.next = root; // todo 为什么会循环嵌套
//            root.val = list.get(i);
            ListNode temp = root;
            root = new ListNode(list.get(i));
            root.next = temp;
        }
        return root;
    }
}
