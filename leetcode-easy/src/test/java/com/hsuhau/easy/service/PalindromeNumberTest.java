package com.hsuhau.easy.service;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void testIsPalindrome() throws Exception {
        boolean result = palindromeNumber.isPalindrome(12321);
        Assert.assertEquals(true, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme