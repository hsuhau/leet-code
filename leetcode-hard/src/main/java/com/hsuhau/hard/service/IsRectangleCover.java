package com.hsuhau.hard.service;

import org.springframework.stereotype.Service;

@Service
public class IsRectangleCover {
    // todo

    public boolean isRectangleCover(int[][] rectangles) {
        // 边缘四角
        int[] ru = new int[2]; //右上
        ru[0] = rectangles[0][0];
        ru[1] = rectangles[0][1];
        int[] rd = new int[2]; //右下
        int[] lu = new int[2]; //左上
        int[] ld = new int[2]; //左下
        ld[0] = rectangles[0][2];
        ld[1] = rectangles[0][3];

        int all = 0;
        for (int[] rectangle : rectangles) {
            int[] rightUp = new int[2];
            rightUp[0] = rectangle[2];
            rightUp[1] = rectangle[3];

            int[] rightDown = new int[2];
            rightDown[0] = rectangle[2];
            rightDown[1] = rectangle[1];

            int[] leftUp = new int[2];
            leftUp[0] = rectangle[0];
            leftUp[1] = rectangle[3];

            int[] leftDown = new int[2];
            leftDown[0] = rectangle[0];
            leftDown[1] = rectangle[1];

            if (leftDown[0] < ld[0]) {
                ld[0] = leftDown[0];
            }
            if (leftDown[1] < ld[1]) {
                ld[1] = leftDown[1];
            }
            if (rightUp[0] > ru[0]) {
                ru[0] = rightUp[0];
            }
            if (rightUp[1] > ru[1]) {
                ru[1] = rightUp[1];
            }
            all = (rectangle[2] - rectangle[0]) * (rectangle[3] - rectangle[1]);
        }

        if ((ru[0] - ld[0]) * (ru[1] - ld[1]) != all) {
            return false;
        }
        return false;
    }
}
