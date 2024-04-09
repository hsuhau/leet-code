package com.hsuhau.hard.service;

import com.hsuhau.hard.HardApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = HardApplication.class)
@ExtendWith(SpringExtension.class)
class LongestValidParenthesesTest {
    @Autowired
    private LongestValidParentheses longestValidParentheses;

    @Test
    void testLongestValidParentheses() {
        int result = longestValidParentheses.longestValidParentheses("()()()(()())");
        Assertions.assertEquals(0, result);
        System.out.println("result = " + result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme