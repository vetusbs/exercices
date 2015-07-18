package com.vetus.tdd.problem01;

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

    	if (array.length == rotate || rotate == 0 || array.length == 0) {
    		return array;
    	}
    	
    	int currentPosition = 0;
    	int currentValue = array[currentPosition];
    	int movements = 0;
    	int nextValue = 0;
    	
    	while (movements < array.length){
    		int nextPosition = calculatePosition(currentPosition);
    		nextValue = array[nextPosition];
        	array[nextPosition] = currentValue;
        	currentPosition = nextPosition;
        	currentValue = nextValue;
        	movements ++;
        }
    	return array;
    }
    
    private int calculatePosition(int currentPosition) {
    	return (currentPosition + rotate) % array.length;
    }
}
