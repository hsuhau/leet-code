package com.hsuhau.medium.service.impl;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RotateImageTest {

    @Test
    void rotate() {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage.rotate(matrix);
        Assert.assertEquals(matrix,
                new int[][]{{7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}});
    }
}