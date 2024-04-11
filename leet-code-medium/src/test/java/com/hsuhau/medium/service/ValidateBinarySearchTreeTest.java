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

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@DisplayName("98.验证二叉搜索树-测试用例")
class ValidateBinarySearchTreeTest {

    @Autowired
    private ValidateBinarySearchTree validateBinarySearchTree;

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of((Object) new Integer[]{5, 4, 6, null, null, 3, 7}, true),
                Arguments.of((Object) new Integer[]{32, 26, 47, 19, null, null, 56, null, 27}, true),
                Arguments.of((Object) new Integer[]{120, 70, 140, 50, 100, 130, 160, 20, 55, 75, 110, 119, 135, 150, 200}, false)
        );
    }

    @DisplayName("98.验证二叉搜索树")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void isValidBST(Integer[] bstArray, boolean expectedResult) {
        TreeNode bst = buildTree(bstArray);

        Assertions.assertEquals(validateBinarySearchTree.isValidBST(bst), expectedResult);
    }

    private TreeNode buildTree(Integer[] array) {
        if (array.length == 0) return null;
        TreeNode root = new TreeNode(array[0]);
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < array.length) {
            TreeNode node = queue.poll();
            if (array[i] != null) {
                node.left = new TreeNode(array[i]);
                queue.offer(node.left);
            }
            i++;
            if (i < array.length && array[i] != null) {
                node.right = new TreeNode(array[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }
}