package com.vetus.tdd.problem02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicatedNumberTest {

	@Test public void shuldReturnSecondValueWhenFirstIsEqualsToSecond() {
		int[] array = {1,1};
		DuplicatedNumber duplicatedNumber = new DuplicatedNumber(array);
		
		int value = duplicatedNumber.find();
		
		assertEquals(1,value);
	}
	
	@Test public void shouldReturnLastValueWhenLastEqualsFirst() {
		int[] array = {10,3,5,2,7,9,5,10};
		DuplicatedNumber duplicatedNumber = new DuplicatedNumber(array);
		
		int value = duplicatedNumber.find();
		
		assertEquals(10,value);
	}
	
	@Test public void shouldReturnRepeatedValueWhenExist() {
		
		for (int i = 0; i < 20; i++) {
			int lenght = (int)(Math.random() * 1000);
			int repeatedValue = (int)(Math.random() * lenght);
			int[] array = generateArrayWithRepeatedValue(repeatedValue, lenght);
			DuplicatedNumber duplicatedNumber = new DuplicatedNumber(array);
			
			int result = duplicatedNumber.find();
			assertEquals(result, repeatedValue);
		}
	}
	
	private int[] generateArrayWithRepeatedValue(int repeatedValue, int lenght) {
		int[] array = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			array[i] = i;
		}
		array[repeatedValue + 1] = repeatedValue;
		return array;
	}
	
}
