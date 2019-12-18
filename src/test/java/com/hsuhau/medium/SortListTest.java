package com.hsuhau.medium;

import com.hsuhau.common.ListNode;
import org.junit.jupiter.api.Test;

public class SortListTest {
    @Test
    void test() {
        SortList sortList = new SortList();
        ListNode head = new ListNode(4);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(1);
        head.next = second;
        second.next = third;
        third.next = forth;
        sortList.sortList(head);
    }
}
