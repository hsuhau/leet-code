package com.hsuhau.easy.service;

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
public class MergeTwoSortedListsTest {
    @Autowired
    private MergeTwoSortedLists mergeTwoSortedLists;

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