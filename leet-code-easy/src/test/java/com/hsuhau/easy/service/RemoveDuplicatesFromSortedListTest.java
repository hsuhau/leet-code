package com.hsuhau.easy.service;

import com.hsuhau.common.model.ListNode;
import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("83. 删除排序链表中的重复元素-测试用例")
public class RemoveDuplicatesFromSortedListTest {
    @Autowired
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    // 数据源方法，提供测试数据
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                // 添加测试数据用例
                Arguments.of(
                        createList(1, 1, 2), // 输入链表
                        createList(1, 2) // 预期输出链表
                ),
                Arguments.of(
                        createList(1, 1, 2, 3, 3), // 输入链表
                        createList(1, 2, 3) // 预期输出链表
                )
                // 可以添加更多的测试用例
        );
    }

    // 创建链表的辅助方法
    private static ListNode createList(int... values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testDeleteDuplicates(ListNode inputList, ListNode expectedList) throws Exception {
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(inputList);
        expectedList.equals(result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testDeleteDuplicates0(ListNode inputList, ListNode expectedList) throws Exception {
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates0(inputList);
        expectedList.equals(result);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme