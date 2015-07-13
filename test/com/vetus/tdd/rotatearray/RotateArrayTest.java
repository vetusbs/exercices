package com.vetus.tdd.rotatearray;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class RotateArrayTest {

    @Test public void shouldReturnSameArrayWhenNIsZero() {
        RotateArray rotateArray = new RotateArray(0, 7);

        int[] rotatedArray = rotateArray.rotate();

        assertEquals(rotatedArray.length, 0);
    }

    @Test public void shouldReturnArrayWithSingleItemWhenNIsOne() {
        RotateArray rotateArray = new RotateArray(1,5);

        int[] rotatedArray = rotateArray.rotate();
        
        assertEquals(0, rotatedArray[0]);
    }
    
    @Test public void shouldReturnReverseArrayWhenNIsTwoAndKIsOne() {
        RotateArray rotateArray = new RotateArray(2,1);

        int[] rotatedArray = rotateArray.rotate();
        
        assertEquals(1, rotatedArray[0]);
        assertEquals(0, rotatedArray[1]);
    }
    
    @Test public void shouldReturnReverseArrayWhenNIsFiveAndKIsOne() {
        RotateArray rotateArray = new RotateArray(5,1);

        int[] rotatedArray = rotateArray.rotate();
        
        assertEquals(4, rotatedArray[0]);
        assertEquals(0, rotatedArray[1]);
        assertEquals(1, rotatedArray[2]);
        assertEquals(2, rotatedArray[3]);
        assertEquals(3, rotatedArray[4]);
    }
    
    @Test public void shouldRotateTwoWhenKIsTwoMoreThanN() {
        RotateArray rotateArray = new RotateArray(5,7);

        int[] rotatedArray = rotateArray.rotate();
        
        assertEquals(3, rotatedArray[0]);
        assertEquals(4, rotatedArray[1]);
        assertEquals(0, rotatedArray[2]);
        assertEquals(1, rotatedArray[3]);
        assertEquals(2, rotatedArray[4]);
    }

}
