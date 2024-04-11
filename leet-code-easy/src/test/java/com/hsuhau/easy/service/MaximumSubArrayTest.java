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
public class MaximumSubArrayTest {
    @Autowired
    private MaximumSubArray maximumSubarray;

    // 提供测试数据的静态方法
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMaxSubArray0(int[] nums, int expected) throws Exception {
        int result = maximumSubarray.maxSubArray0(nums);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMaxSubArray1(int[] nums, int expected) throws Exception {
        int result = maximumSubarray.maxSubArray1(nums);
        Assertions.assertEquals(expected, result);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme