package com.hsuhau.medium;

import com.hsuhau.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. 两数相加
 *
 * 相关标签：链表，数学
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class AddTwoNumbers {
    // todo

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return new ListNode(0);
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            List<Integer> firstNodeValList = new ArrayList<>();
            firstNodeValList.add(l1.val);
            while (l1.next != null) {
                firstNodeValList.add(l1.next.val);
                l1 = l1.next;
            }

            List<Integer> secondNodeValList = new ArrayList<>();
            secondNodeValList.add(l2.val);
            while (l2.next != null) {
                secondNodeValList.add(l2.next.val);
                l2 = l2.next;
            }

            int sum = 0;
            for (int i = 0; i < firstNodeValList.size(); i++) {
                sum += firstNodeValList.get(i) * 10 ^ i;
            }
            for (int i = 0; i < firstNodeValList.size(); i++) {
                sum += firstNodeValList.get(i) * 10 ^ i;
            }
            String[] result = String.valueOf(sum).split("");
            ListNode root = new ListNode(0);
            for (int i = 0; i < result.length; i++) {

            }

        }
        return new ListNode(0);

    }

    public static void main(String[] args) {
        ListNode x1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);
        x1.next = x2;
        x2.next = x3;
        ListNode y1 = new ListNode(5);
        ListNode y2 = new ListNode(6);
        ListNode y3 = new ListNode(4);
        y1.next = y2;
        y2.next = y3;
        ListNode re = addTwoNumbers(x1, y1);
    }
}
