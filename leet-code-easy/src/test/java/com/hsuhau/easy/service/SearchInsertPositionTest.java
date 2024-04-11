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
@DisplayName("35. 搜索插入位置-测试用例")
public class SearchInsertPositionTest {
    @Autowired
    private SearchInsertPosition searchInsertPosition;

    // 数据源方法，提供测试数据
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of(new int[]{1, 3, 5, 6}, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testSearchInsert(int[] array, int target, int expected) throws Exception {
        int result = searchInsertPosition.searchInsert(array, target);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testSearchInsert0(int[] array, int target, int expected) throws Exception {
        int result = searchInsertPosition.searchInsert0(array, target);
        Assertions.assertEquals(expected, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme