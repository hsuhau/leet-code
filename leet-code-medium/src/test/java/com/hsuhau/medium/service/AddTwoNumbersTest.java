package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import com.hsuhau.medium.MediumApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
public class AddTwoNumbersTest {
    @Autowired
    private AddTwoNumbers addTwoNumbers;

    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode node_1_3 = new ListNode(3);
        ListNode node_1_2 = new ListNode(4);
        ListNode node_1_1 = new ListNode(2);
        node_1_2.next = node_1_3;
        node_1_1.next = node_1_2;


        ListNode node_2_3 = new ListNode(4);
        ListNode node_2_2 = new ListNode(6);
        ListNode node_2_1 = new ListNode(5);
        node_2_2.next = node_2_3;
        node_2_1.next = node_2_2;

        ListNode result = addTwoNumbers.addTwoNumbers(node_1_1, node_2_1);

        ListNode node_3_3 = new ListNode(8);
        ListNode node_3_2 = new ListNode(0);
        ListNode node_3_1 = new ListNode(7);
        node_3_2.next = node_3_3;
        node_3_1.next = node_3_2;

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

    @Test
    public void testAddTwoNumbers0() throws Exception {

        ListNode node_1_3 = new ListNode(3);
        ListNode node_1_2 = new ListNode(4);
        ListNode node_1_1 = new ListNode(2);
        node_1_2.next = node_1_3;
        node_1_1.next = node_1_2;


        ListNode node_2_3 = new ListNode(4);
        ListNode node_2_2 = new ListNode(6);
        ListNode node_2_1 = new ListNode(5);
        node_2_2.next = node_2_3;
        node_2_1.next = node_2_2;

        ListNode result = addTwoNumbers.addTwoNumbers0(node_1_1, node_2_1);

        ListNode node_3_3 = new ListNode(8);
        ListNode node_3_2 = new ListNode(0);
        ListNode node_3_1 = new ListNode(7);
        node_3_2.next = node_3_3;
        node_3_1.next = node_3_2;

        Assert.assertEquals(node_3_1, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
