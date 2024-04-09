package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
class RotateImageTest {

    @Autowired
    private RotateImage rotateImage;

    @Test
    void rotate() {
        int[][] initMatrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        int[][] matrix = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        rotateImage.rotate(initMatrix);
        Assert.assertEquals(matrix, initMatrix);
    }
}