package com.hsuhau.easy.service;

import com.hsuhau.easy.EasyApplication;
import org.junit.jupiter.api.Assertions;
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
public class CountBitsTest {

    @Autowired
    private CountBits countBits;

    // 数据源方法，返回测试参数
    static Stream<Arguments> countBitsData() {
        return Stream.of(
                Arguments.of(2, new int[]{0, 1, 1}),
                Arguments.of(5, new int[]{0, 1, 1, 2, 1, 2}),
                Arguments.of(0, new int[]{0}),
                Arguments.of(1, new int[]{0, 1})
                // 您可以根据需要添加更多的测试数据
        );
    }

    @ParameterizedTest
    @MethodSource("countBitsData")
    public void countBits(int n, int[] expected) {
        int[] result = countBits.countBits(n);
        Assertions.assertArrayEquals(expected, result);
    }
}