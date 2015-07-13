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
	
}
