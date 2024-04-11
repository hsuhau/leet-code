package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

import static com.hsuhau.common.model.ListNode.createListNode;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("2. 两数相加-测试用例")
public class AddTwoNumbersTest {
    @Autowired
    private AddTwoNumbers addTwoNumbers;

    // 数据来源方法
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(createListNode(new int[]{2, 4, 3}), createListNode(new int[]{5, 6, 4}), createListNode(new int[]{7, 0, 8})),
                Arguments.of(createListNode(new int[]{0}), createListNode(new int[]{0}), createListNode(new int[]{0}))
                // 在这里添加更多的测试用例
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testAddTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testAddTwoNumbers0(ListNode l1, ListNode l2, ListNode expected) {
        ListNode result = addTwoNumbers.addTwoNumbers0(l1, l2);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
