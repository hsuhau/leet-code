package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("47.全排列 II-测试用例")
public class PermuteUniqueTest {
    @Autowired
    private PermuteUnique permuteUnique;

    // 提供参数化测试的输入数据和期望结果
    public static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 3, 4, 2},
                        List.of(
                                Arrays.asList(1, 2, 2, 3, 3, 4),
                                Arrays.asList(1, 2, 2, 3, 4, 3)
                                // 你可以添加更多期望结果
                        )
                ),
                // 你可以根据需要添加更多的测试用例
                Arguments.of(
                        new int[]{1, 1, 2},
                        List.of(
                                Arrays.asList(1, 1, 2),
                                Arrays.asList(1, 2, 1),
                                Arrays.asList(2, 1, 1)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void permuteUnique(int[] inputArray, List<List<Integer>> expectedResult) {
        // 执行测试
        List<List<Integer>> actualResult = permuteUnique.permuteUnique(inputArray);

        // 使用 Assertions.assertEquals 检查实际结果与预期结果
        Assertions.assertEquals(expectedResult, actualResult, "实际结果与预期结果不匹配");
    }


    @Test
    public void backtrack() {
    }
}