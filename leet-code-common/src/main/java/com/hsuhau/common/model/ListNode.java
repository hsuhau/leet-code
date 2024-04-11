package com.hsuhau.common.model;

/**
 * @author hsuhau
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    @Override
    public boolean equals(Object obj) {
        // 检查对象是否与自身相同
        if (this == obj) {
            return true;
        }

        // 检查对象是否为 ListNode 的实例
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 强制类型转换
        ListNode other = (ListNode) obj;

        // 当前节点和其他节点
        ListNode current = this;
        ListNode otherCurrent = other;

        // 遍历链表节点进行比较
        while (current != null && otherCurrent != null) {
            // 比较节点的值
            if (current.val != otherCurrent.val) {
                return false;
            }
            // 移动到下一个节点
            current = current.next;
            otherCurrent = otherCurrent.next;
        }

        // 如果两个链表都到达末尾，说明相等
        return current == null && otherCurrent == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + next.hashCode();
        return result;
    }
}