package com.hsuhau.hard.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestValidParenthesesTest {
    LongestValidParentheses longestValidParentheses = new LongestValidParentheses();

    @Test
    void testLongestValidParentheses() {
        int result = longestValidParentheses.longestValidParentheses("()()()(()())");
        Assertions.assertEquals(0, result);
        System.out.println("result = " + result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme