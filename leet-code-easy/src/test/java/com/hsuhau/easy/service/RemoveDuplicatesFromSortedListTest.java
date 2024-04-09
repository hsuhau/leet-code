package com.hsuhau.easy.service;

import com.alibaba.fastjson.JSONObject;
import com.hsuhau.common.model.ListNode;
import com.hsuhau.easy.EasyApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
public class RemoveDuplicatesFromSortedListTest {
    @Autowired
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

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