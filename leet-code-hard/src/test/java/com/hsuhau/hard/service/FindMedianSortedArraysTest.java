package com.hsuhau.hard.service;

import com.hsuhau.hard.HardApplication;
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

@SpringBootTest(classes = HardApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("4. 寻找两个正序数组的中位数-测试用例")
public class FindMedianSortedArraysTest {
    @Autowired
    private FindMedianSortedArrays findMedianSortedArrays;

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                // 示例 1：输入：nums1 = [1,3], nums2 = [2]，输出：2.00000
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.0),

                // 示例 2：输入：nums1 = [1,2], nums2 = [3,4]，输出：2.50000
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5),

                // 示例 3：输入：nums1 = [0,0], nums2 = [0,0]，输出：0.00000
                Arguments.of(new int[]{0, 0}, new int[]{0, 0}, 0.0),

                // 示例 4：输入：nums1 = [], nums2 = [1]，输出：1.00000
                Arguments.of(new int[]{}, new int[]{1}, 1.0),

                // 示例 5：输入：nums1 = [2], nums2 = []，输出：2.00000
                Arguments.of(new int[]{2}, new int[]{}, 2.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testFindMedianSortedArrays(int[] nums1, int[] nums2, double expected) throws Exception {
        double result = findMedianSortedArrays.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme