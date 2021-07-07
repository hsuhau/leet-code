package com.hsuhau.medium.service.impl;

import com.hsuhau.MainApplication;
import com.hsuhau.medium.service.RotateImage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MainApplication.class)
@RunWith(SpringRunner.class)
class RotateImageTest {

    @Test
    void rotate() {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage.rotate(matrix);
        Assert.assertArrayEquals(matrix,
                new int[][]{{7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}});
    }
}