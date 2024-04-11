package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("556. 下一个更大元素 III-测试用例")
class NextGreaterElementTest {

    @Autowired
    private NextGreaterElement nextGreaterElement;

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void nextGreaterElement(int value) {
        nextGreaterElement.nextGreaterElement(value);
    }
}