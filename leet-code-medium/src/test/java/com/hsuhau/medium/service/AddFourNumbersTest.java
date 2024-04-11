package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("18.四数之和-测试用例")
public class AddFourNumbersTest {

    @Autowired
    private AddFourNumbers addFourNumbers;

    // 创建数据源方法
    public static Stream<Object[]> dataProvider() {
        return Stream.of(
                new Object[]{
                        new int[]{1, 0, -1, 0, -2, 2},
                        0,
                        List.of(
                                Arrays.asList(-2, -1, 1, 2),
                                Arrays.asList(-2, 0, 0, 2),
                                Arrays.asList(-1, 0, 0, 1)
                        )
                },
                new Object[]{
                        new int[]{2, 2, 2, 2, 2},
                        8,
                        List.of(Arrays.asList(2, 2, 2, 2))
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void fourSum(int[] input, int target, List<List<Integer>> expected) {
        List<List<Integer>> actual = addFourNumbers.fourSum(input, target);

        // 将预期结果和实际结果转换为 Set
        Set<List<Integer>> expectedSet = new HashSet<>(expected);
        Set<List<Integer>> actualSet = new HashSet<>(actual);

        // 使用集合进行断言
        Assertions.assertEquals(expectedSet, actualSet);
    }
}