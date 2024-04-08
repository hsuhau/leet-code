package com.hsuhau.medium.service;

import com.hsuhau.MainApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MainApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("1208.尽可能使字符串相等-测试用例")
class GetEqualSubstringsWithinBudgetTest {

    @Autowired
    private GetEqualSubstringsWithinBudget getEqualSubstringsWithinBudget;

    @DisplayName("1208.尽可能使字符串相等")
    @ParameterizedTest
    @CsvSource({"abcd,bcdf,3,3", "abcd,cdef,3,1", "abcd,acde,0,1", "krrgw,zjxss,19,2"})
    void equalSubstring(String s, String t, int maxCost, int expected) {
        Assertions.assertEquals(expected, getEqualSubstringsWithinBudget.equalSubstring1_wrong(s, t, maxCost));
    }
}