package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
public class PalindromeNumberTest {
    @Autowired
    private PalindromeNumber palindromeNumber;

    @ParameterizedTest
    @CsvSource({"12321, true", "1234321, true", "120321, false", "12340321, false"})
    public void testIsPalindrome(int input, boolean isPalindromeNumber) throws Exception {
        boolean result = palindromeNumber.isPalindrome(input);
        Assertions.assertEquals(isPalindromeNumber, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme