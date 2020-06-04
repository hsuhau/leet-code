package com.hsuhau.easy.service;

import com.hsuhau.common.model.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void testMergeTwoLists0() throws Exception {
        ListNode result = mergeTwoSortedLists.mergeTwoLists0(new ListNode(0), new ListNode(0));
        Assert.assertEquals(new ListNode(0), result);
    }

    @Test
    public void testMergeTwoLists1() throws Exception {
        ListNode result = mergeTwoSortedLists.mergeTwoLists1(new ListNode(0), new ListNode(0));
        Assert.assertEquals(new ListNode(0), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme