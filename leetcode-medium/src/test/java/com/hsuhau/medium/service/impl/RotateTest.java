package com.hsuhau.medium.service.impl;

import org.junit.jupiter.api.Test;

class RotateTest {

    @Test
    void rotate() {
        Rotate rotate = new Rotate();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate.rotate(matrix);
    }
}