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
public class PlusOneTest {
    @Autowired
    private PlusOne plusOne;

    // 数据源方法，提供测试数据
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                // 添加测试数据用例
                Arguments.of(
                        new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6},
                        new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7}),
                Arguments.of(new int[]{9, 9}, new int[]{1, 0, 0})
                // 可以添加更多的测试用例
        );
    }


    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testPlusOne(int[] inputArray, int[] expectedArray) {
        int[] result = plusOne.plusOne(inputArray);
        Assertions.assertArrayEquals(expectedArray, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testPlusOne0(int[] inputArray, int[] expectedArray) {
        int[] result = plusOne.plusOne0(inputArray);
        Assertions.assertArrayEquals(expectedArray, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme