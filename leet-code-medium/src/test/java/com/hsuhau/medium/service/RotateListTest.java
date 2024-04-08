package com.hsuhau.medium.service;

import com.hsuhau.MainApplication;
import com.hsuhau.common.model.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
@DisplayName("61.旋转链表-测试用例")
class RotateListTest {

    @Autowired
    private RotateList rotateList;

    @Test
    void rotateRight() {

        ListNode node = new ListNode();
        node.val = 1;
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        rotateList.rotateRight(node, 2);

    }
}