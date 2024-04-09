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
@DisplayName("997.找到小镇的法官-测试用例")
class FindTheTownJudgeTest {
    @Autowired
    private FindTheTownJudge findTheTownJudge;

    private static Stream<Arguments> findJudgeTestData() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 2}}, 2),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}}, 3),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}, -1),
                Arguments.of(1, new int[][]{}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("findJudgeTestData")
    void findJudge(int n, int[][] trust, int expected) {
        Assertions.assertEquals(expected, findTheTownJudge.findJudge(n, trust));
    }

}