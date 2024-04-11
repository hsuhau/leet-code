package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
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

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("1208.尽可能使字符串相等-测试用例")
class GetEqualSubstringsWithinBudgetTest {

    @Autowired
    private GetEqualSubstringsWithinBudget getEqualSubstringsWithinBudget;

    // 数据来源方法，提供参数化测试所需的数据
    public static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("abcd", "bcdf", 3, 3),
                Arguments.of("abcd", "cdef", 3, 1),
                Arguments.of("abcd", "acde", 0, 1),
                Arguments.of("krrgw", "zjxss", 19, 2),
                Arguments.of("pxezla", "loewbi", 25, 4)
                // 你可以根据需要添加更多的测试用例
        );
    }

    @DisplayName("1208.尽可能使字符串相等 equalSubstring_by_me_wrong_0")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void equalSubstring0_wrong(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_by_me_wrong_0(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 equalSubstring_by_me_wrong_1")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void equalSubstring1_wrong(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_by_me_wrong_1(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 equalSubstring_by_me_fixed_1")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void equalSubstring_by_me_fixed_1(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_by_me_fixed_1(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 错误解答")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void equalSubstring_sliding_window_algorithm_like_wrong(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_sliding_window_algorithm_like_wrong(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 滑动窗口算法")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void equalSubstring_sliding_window_algorithm(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_sliding_window_algorithm(s, t, maxCost));
    }


}