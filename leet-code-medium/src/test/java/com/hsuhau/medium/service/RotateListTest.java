package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("61.旋转链表-测试用例")
class RotateListTest {

    @Autowired
    private RotateList rotateList;

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{4, 5, 1, 2, 3}),
                Arguments.of(new int[]{0, 1, 2}, 4, new int[]{2, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void rotateRight(int[] head, int k, int[] expected) {
        ListNode actual = rotateList.rotateRight(ListNode.createListNode(head), k);
        ListNode expectedListNode = ListNode.createListNode(expected);
        actual.equals(expectedListNode);
    }
}