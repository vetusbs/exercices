package com.vetus.tdd.rotatearray;

/**
 *   Problem: Rotate an array of n elements to the right by k steps.
 *   For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *   How many different ways do you know to solve this problem?
 */
public class RotateArray {
    private int[] array;
    private int rotate;

    public RotateArray(int n, int k) {
        initArray(n);
        rotate = k;
    }

    private void initArray(int n) {
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
    }

    public int[] rotate() {
        return array;
    }
}
