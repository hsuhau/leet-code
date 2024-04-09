package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
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