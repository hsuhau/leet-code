package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = EasyApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("20. 有效的括号-测试用例")
public class ValidParenthesesTest {
    @Autowired
    ValidParentheses validParentheses;

    @ParameterizedTest
    @CsvSource({
            "(), true",
            "()[]{}, true",
            "(], false",
            "([)], false",
            "()[]{}, true",
            "{[]}, true",
            "([)], false",
            "{[]}, true",
            "(, false",
    })
    public void testIsValid(String value, boolean expected) throws Exception {
        Assertions.assertEquals(expected, validParentheses.isValid(value));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme