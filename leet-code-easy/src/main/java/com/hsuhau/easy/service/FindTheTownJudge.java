package com.hsuhau.easy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class FindTheTownJudge {

    /**
     * 计数
     * @param n
     * @param trust
     * @return
     */
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            in[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        log.info("in = {}", Arrays.toString(in));
        log.info("out = {}", Arrays.toString(out));

        for (int i = 1; i < n + 1; i++) {
            if (in[i] == (n -1) && out[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    /**
     *
     */
}
