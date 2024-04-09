package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("15.三数之和-测试用例")
public class AddThreeNumbersTest {
    @Autowired
    private AddThreeNumbers addThreeNumbers;

    static Stream<Arguments> threeSumTestData() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1, 0, 1, 2, -1, -4},
                        List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5, 6},
                        List.of(List.of(1, 2, 3))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("threeSumTestData")
    public void threeSum(int[] nums, List<List<Integer>> expected) {
        Assert.assertEquals(expected, addThreeNumbers.threeSum(nums));
    }

    @ParameterizedTest
    @MethodSource("threeSumTestData")
    public void threeSum_set(int[] nums, List<List<Integer>> expected) {
        Assert.assertEquals(expected, addThreeNumbers.threeSum_set(nums));
    }

}