package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import org.springframework.stereotype.Service;

//给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], k = 2
//输出：[4,5,1,2,3]
//
//
// 示例 2：
//
//
//输入：head = [0,1,2], k = 4
//输出：[2,0,1]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目在范围 [0, 500] 内
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 10⁹
//
//
// Related Topics 链表 双指针 👍 1039 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
@Service
class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode iter = head;

        int n = 0;

        while (iter.next != null){
            iter = iter.next;
            n++;
        }

        int add = n - k % n;
        if (add == n) {
            return head;
        }

        iter.next = head;

        while (add >= 0) {
            iter = iter.next;
        }

        ListNode ret = iter.next;

        iter.next = null;

        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
