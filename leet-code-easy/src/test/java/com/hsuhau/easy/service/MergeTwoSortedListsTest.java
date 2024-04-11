package com.hsuhau.easy.service;

import com.hsuhau.common.model.ListNode;
import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

import static com.hsuhau.common.model.ListNode.createListNode;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
public class MergeTwoSortedListsTest {
    @Autowired
    private MergeTwoSortedLists mergeTwoSortedLists;

    // 数据源方法，提供测试数据
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                // 添加测试数据用例
                Arguments.of(
                        createListNode(new int[]{1, 2, 4}),
                        createListNode(new int[]{1, 3, 4}),
                        createListNode(new int[]{1, 1, 2, 3, 4, 4})
                ),
                Arguments.of(
                        createListNode(new int[]{1, 2, 5}),
                        createListNode(new int[]{4, 6}),
                        createListNode(new int[]{1, 2, 4, 5, 6})
                )
                // 可以添加更多的测试用例
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMergeTwoLists0(ListNode list1, ListNode list2, ListNode expectedResult) {
        // 调用 mergeTwoLists0 方法
        ListNode result = mergeTwoSortedLists.mergeTwoLists0(list1, list2);
        // 使用 Assertions.assertEquals 验证实际结果与预期结果是否匹配
        expectedResult.equals(result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMergeTwoLists1(ListNode list1, ListNode list2, ListNode expectedResult) {
        // 调用 mergeTwoLists0 方法
        ListNode result = mergeTwoSortedLists.mergeTwoLists1(list1, list2);
        // 使用 Assertions.assertEquals 验证实际结果与预期结果是否匹配
        expectedResult.equals(result);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme