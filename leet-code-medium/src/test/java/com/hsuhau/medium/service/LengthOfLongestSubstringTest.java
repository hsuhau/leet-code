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

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MediumApplication.class)
@DisplayName("3. 无重复字符的最长子串-测试用例")
public class LengthOfLongestSubstringTest {
    @Autowired
    private LengthOfLongestSubstring lengthOfLongestSubstring;

    @ParameterizedTest
    @CsvSource(
            {"abcabcbb, 3"}
    )
    public void testLengthOfLongestSubstring(String input, int expected) throws Exception {
        int result = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme