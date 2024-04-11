package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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
@DisplayName("面试题05. 替换空格-测试用例")
public class ReplaceSpaceTest {
    @Autowired
    private ReplaceSpace replaceSpace;

    // 数据源方法
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("replace Me With Expected Result", "replace%20Me%20With%20Expected%20Result"),
                Arguments.of("We are happy.", "We%20are%20happy."),
                // 可以在此处添加更多测试用例
                Arguments.of("Hello World", "Hello%20World"),
                Arguments.of("NoSpace", "NoSpace")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testReplaceSpace(String input, String expected) throws Exception {
        String result = replaceSpace.replaceSpace(input);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testReplaceSpace0(String input, String expected) throws Exception {
        String result = replaceSpace.replaceSpace0(input);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme