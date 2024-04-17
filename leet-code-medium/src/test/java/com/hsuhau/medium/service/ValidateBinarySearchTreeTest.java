package com.hsuhau.medium.service;

import com.hsuhau.common.model.TreeNode;
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

import static com.hsuhau.common.model.TreeNode.buildTree;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("98.验证二叉搜索树-测试用例")
class ValidateBinarySearchTreeTest {

    @Autowired
    private ValidateBinarySearchTree validateBinarySearchTree;

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of((Object) new Integer[]{2,2,2}, false),
                Arguments.of((Object) new Integer[]{2147483647}, true),
                Arguments.of((Object) new Integer[]{5, 4, 6, null, null, 3, 7}, true),
                Arguments.of((Object) new Integer[]{32, 26, 47, 19, null, null, 56, null, 27}, true),
                Arguments.of((Object) new Integer[]{120, 70, 140, 50, 100, 130, 160, 20, 55, 75, 110, 119, 135, 150, 200}, false)
        );
    }

    @DisplayName("98.验证二叉搜索树")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testIsValidBST(Integer[] bstArray, boolean expectedResult) {
        TreeNode bst = buildTree(bstArray);

        Assertions.assertEquals(expectedResult, validateBinarySearchTree.isValidBST(bst));
    }

}