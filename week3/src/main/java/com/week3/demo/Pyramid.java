package com.week3.demo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Pyramid {
    private static Pyramid instance;
    private static int maxInstance = 2;

    //v1
    public static Pyramid buildPyramid() {
        if (canBuild()) {
            maxInstance--;
            return new Pyramid();
        }
        return null;
    }

    private static boolean canBuild() {
        return maxInstance >0;
    }
}
