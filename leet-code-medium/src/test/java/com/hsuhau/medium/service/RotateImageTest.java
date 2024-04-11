package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
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

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("48. 旋转图像-测试用例")
class RotateImageTest {

    @Autowired
    private RotateImage rotateImage;

    // 提供参数化测试的输入数据和期望结果
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // 每个 Arguments 对象包含输入矩阵和期望结果矩阵
                Arguments.of(
                        new int[][]{
                                {5, 1, 9, 11},
                                {2, 4, 8, 10},
                                {13, 3, 6, 7},
                                {15, 14, 12, 16}
                        },
                        new int[][]{
                                {15, 13, 2, 5},
                                {14, 3, 4, 1},
                                {12, 6, 8, 9},
                                {16, 7, 10, 11}
                        }
                )
                // 你可以根据需要添加更多测试用例
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testRotate(int[][] initMatrix, int[][] expectedMatrix) {
        rotateImage.rotate(initMatrix);
        // 对比实际结果和预期结果
        for (int i = 0; i < initMatrix.length; i++) {
            // 使用 assertArrayEquals 逐行比较二维数组
            Assertions.assertArrayEquals(expectedMatrix[i], initMatrix[i], "矩阵行 " + i + " 不匹配");
        }
    }
}