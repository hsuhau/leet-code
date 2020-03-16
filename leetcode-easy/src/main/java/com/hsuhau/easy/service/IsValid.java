package com.hsuhau.easy.service;

public class IsValid {

    //todo 还没有做对
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int x = 0;
        int y = 0;
        int z = 0;
        for (char c : chars) {
            if (c == '(') {
                x++;
            } else if (c == ')') {
                x--;
            } else if (c == '{') {
                y++;
            } else if (c == '}') {
                y--;
            } else if (c == '[') {
                z++;
            } else {
                z--;
            }
        }
        if (x != 0 || y != 0 || z != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char b = s.charAt(j);
                if (a == b) {

                }
            }
        }
        return true;

    }
}
