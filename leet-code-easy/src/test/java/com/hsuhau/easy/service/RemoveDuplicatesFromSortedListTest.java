package com.hsuhau.easy.service;

import com.alibaba.fastjson.JSONObject;
import com.hsuhau.MainApplication;
import com.hsuhau.common.model.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
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