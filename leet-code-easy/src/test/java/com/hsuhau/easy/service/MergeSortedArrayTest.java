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
public class MergeSortedArrayTest {
    @Autowired
    private MergeSortedArray mergeSortedArray;

    /**
     * 数据源方法，提供测试数据
     */
    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 0, 0, 0}, // nums1
                        3, // m
                        new int[]{2, 5, 6}, // nums2
                        3, // n
                        new int[]{1, 2, 2, 3, 5, 6} // 预期结果数组
                )
                // 您可以添加更多的测试数据
                // org.junit.jupiter.params.provider.Arguments.of(...)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMerge(int[] nums1, int m, int[] nums2, int n, int[] expected) throws Exception {
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme