package com.hsuhau.hard.service;

import com.hsuhau.hard.HardApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

@SpringBootTest(classes = HardApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("239. 滑动窗口最大值-测试用例")
class SlidingWindowMaximumTest {
    @Autowired
    private SlidingWindowMaximum slidingWindowMaximum;

    // 数据源方法
    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{0}, 0, new int[]{0}),
                // 其他测试案例
                Arguments.of(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3, new int[]{3, 3, 5, 5, 6, 7}),
                Arguments.of(new int[]{1}, 1, new int[]{1})
                // 您可以在此添加其他测试案例
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMaxSlidingWindow(int[] nums, int k, int[] expected) {
        int[] result = slidingWindowMaximum.maxSlidingWindow(nums, k);
        Assertions.assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMaxSlidingWindow0(int[] nums, int k, int[] expected) {
        int[] result = slidingWindowMaximum.maxSlidingWindow0(nums, k);
        Assertions.assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMaxSlidingWindow1(int[] nums, int k, int[] expected) {
        int[] result = slidingWindowMaximum.maxSlidingWindow1(nums, k);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCleanDeque() {
        // 您的 cleanDeque 方法测试代码，保留原有代码或根据实际需求修改
        slidingWindowMaximum.cleanDeque(0, 0);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme