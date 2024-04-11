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
public class ImplementStrStrTest {
    @Autowired
    private ImplementStrStr implementStrStr;

    @ParameterizedTest
    @CsvSource({"haystackneedle, needle, 8"})
    public void testStrStr(String haystack, String needle, int expected) throws Exception {
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"haystackneedle, needle, 8"})
    public void testStrStr0(String haystack, String needle, int expected) throws Exception {
        int result = implementStrStr.strStr0(haystack, needle);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"haystackneedle, needle, 8"})
    public void testStrStr1(String haystack, String needle, int expected) throws Exception {
        int result = implementStrStr.strStr1(haystack, needle);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"haystackneedle, needle, 8"})
    public void testStrStr2(String haystack, String needle, int expected) throws Exception {
        int result = implementStrStr.strStr2(haystack, needle);
        Assertions.assertEquals(expected, result);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme