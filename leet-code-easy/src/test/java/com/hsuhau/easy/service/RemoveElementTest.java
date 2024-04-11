package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
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
public class RemoveElementTest {
    @Autowired
    private RemoveElement removeElement;

    // 数据源方法，提供测试数据
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                // 添加更多测试用例
                Arguments.of(new int[]{0, 12, 3, 4, 3, 45, 55, 5, 5, 5, 5}, 5, 7),
                Arguments.of(new int[]{1, 2, 3, 4}, 3, 3),
                Arguments.of(new int[]{5, 5, 5, 5, 5}, 5, 0),
                Arguments.of(new int[]{1, 2, 2, 2, 3}, 2, 2),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testRemoveElement(int[] array, int valueToRemove, int expected) throws Exception {
        int result = removeElement.removeElement(array, valueToRemove);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme