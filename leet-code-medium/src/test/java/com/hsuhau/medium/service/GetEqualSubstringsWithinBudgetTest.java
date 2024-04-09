package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("1208.尽可能使字符串相等-测试用例")
class GetEqualSubstringsWithinBudgetTest {

    @Autowired
    private GetEqualSubstringsWithinBudget getEqualSubstringsWithinBudget;

    @DisplayName("1208.尽可能使字符串相等 equalSubstring_by_me_wrong_0")
    @ParameterizedTest
    @CsvSource({"abcd,bcdf,3,3", "abcd,cdef,3,1", "abcd,acde,0,1", "krrgw,zjxss,19,2"})
    void equalSubstring0_wrong(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_by_me_wrong_0(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 equalSubstring_by_me_wrong_1")
    @ParameterizedTest
    @CsvSource({"abcd,bcdf,3,3", "abcd,cdef,3,1", "abcd,acde,0,1", "krrgw,zjxss,19,2"})
    void equalSubstring1_wrong(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_by_me_wrong_1(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 equalSubstring_by_me_fixed_1")
    @ParameterizedTest
    @CsvSource({"abcd,bcdf,3,3", "abcd,cdef,3,1", "abcd,acde,0,1", "krrgw,zjxss,19,2"})
    void equalSubstring_by_me_fixed_1(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_by_me_fixed_1(s, t, maxCost));
    }

    @DisplayName("1208.尽可能使字符串相等 滑动窗口算法")
    @ParameterizedTest
    @CsvSource({"abcd,bcdf,3,3", "abcd,cdef,3,1", "abcd,acde,0,1", "krrgw,zjxss,19,2", "pxezla,loewbi,25,4"})
    void equalSubstring_sliding_window_algorithm(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring_sliding_window_algorithm_like_wrong(s, t, maxCost));
    }
}