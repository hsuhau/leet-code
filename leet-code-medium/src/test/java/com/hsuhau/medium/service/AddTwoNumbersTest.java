package com.hsuhau.medium.service;

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
public class AddTwoNumbersTest {
    @Autowired
    private AddTwoNumbers addTwoNumbers;

    @Test
    public void testAddTwoNumbers() throws Exception {
//        ListNode result = addTwoNumbers.addTwoNumbers(new ListNode(0), new ListNode(0));
//        Assert.assertEquals(new ListNode(0), result);
    }

    @Test
    public void testAddTwoNumbers0() throws Exception {

        ListNode node_1_3 = new ListNode(3);
        ListNode node_1_2 = new ListNode(4);
        ListNode node_1_1 = new ListNode(2);
        node_1_2.next = node_1_3.next;
        node_1_1.next = node_1_2.next;


        ListNode node_2_3 = new ListNode(4);
        ListNode node_2_2 = new ListNode(6);
        ListNode node_2_1 = new ListNode(5);
        node_2_2.next = node_2_3.next;
        node_2_1.next = node_2_2.next;

        ListNode result = addTwoNumbers.addTwoNumbers0(node_1_1, node_2_1);

        ListNode node_3_3 = new ListNode(8);
        ListNode node_3_2 = new ListNode(0);
        ListNode node_3_1 = new ListNode(7);
        node_3_2.next = node_3_3.next;
        node_3_1.next = node_3_2.next;

        while (result != null) {
            System.out.println("result.val = " + result.val);
            if (result.next != null) {
                result = result.next;
            } else {
                break;
            }
        }
        Assert.assertEquals(node_3_1, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme