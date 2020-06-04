package com.hsuhau.easy.service;

import com.alibaba.fastjson.JSONObject;
import com.hsuhau.common.model.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

    @Test
    public void testDeleteDuplicates() throws Exception {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(2);
        node1.next.next.next = new ListNode(3);
        System.out.println(JSONObject.toJSON(node1));
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(3);
        System.out.println(JSONObject.toJSON(node2));
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(node1);
        Assert.assertEquals(node2, result);
    }

    @Test
    public void testDeleteDuplicates0() throws Exception {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(2);
        node1.next.next.next = new ListNode(3);
        System.out.println(JSONObject.toJSON(node1));
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(3);
        System.out.println(JSONObject.toJSON(node2));
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates0(node1);
        Assert.assertEquals(node2, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme