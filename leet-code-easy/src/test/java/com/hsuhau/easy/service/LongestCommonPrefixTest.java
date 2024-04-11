package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
public class LongestCommonPrefixTest {
    @Autowired
    private LongestCommonPrefix longestCommonPrefix;

    static Stream<Arguments> longestCommonPrefixData() {
        return Stream.of(
                Arguments.of(new String[]{"ca", "a"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("longestCommonPrefixData")
    public void testLongestCommonPrefix0(String[] strs, String expected) throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix0(new String[]{"ca", "a"});
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("longestCommonPrefixData")
    public void testLongestCommonPrefix1(String[] strs, String expected) throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix1(strs);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("longestCommonPrefixData")
    public void testLongestCommonPrefix2(String[] strs, String expected) throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix2(strs);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLongestCommonPrefix4() throws Exception {
        String result = longestCommonPrefix.longestCommonPrefix4("a", new String[]{"ca", "a"});
        Assertions.assertEquals("", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme