package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

@Service
public class Game {
    public int game(int[] guess, int[] answer) {
        // todo

        int num = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) {
                num++;
            }
        }
        return num;
    }
}
