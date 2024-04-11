package com.hsuhau.hard.service;

import com.hsuhau.hard.HardApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = HardApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("32.最长有效括号-测试用例")
class LongestValidParenthesesTest {
    @Autowired
    private LongestValidParentheses longestValidParentheses;

    @ParameterizedTest
    @CsvSource({
            "((), 2",
            ")()()), 4",
    })
    void testLongestValidParentheses(String input, int expected) {
        int result = longestValidParentheses.longestValidParentheses(input);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme