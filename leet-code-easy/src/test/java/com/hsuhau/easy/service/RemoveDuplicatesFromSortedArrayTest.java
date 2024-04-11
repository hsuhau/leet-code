package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
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

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("")
public class RemoveDuplicatesFromSortedArrayTest {
    @Autowired
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    // 数据源方法，提供测试数据
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                // 添加测试数据用例
                // fixme
                Arguments.of(new int[]{0, 2, 3, 4, 4, 3, 22, 33, 33, 1, 1, 1, 1, 0}, 7),
                // 可以添加更多的测试用例
                Arguments.of(new int[]{1, 1, 2, 2, 3}, 3),
                Arguments.of(new int[]{4, 4, 4, 4}, 1),
                Arguments.of(new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testRemoveDuplicates(int[] input, int expected) throws Exception {
        int result = removeDuplicatesFromSortedArray.removeDuplicates(input);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme