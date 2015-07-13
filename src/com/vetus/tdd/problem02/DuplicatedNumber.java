package com.vetus.tdd.problem02;

/**
 * You have got a range of numbers between 1 to N, 
 * where one of the number is repeated. 
 * You need to write a program to find out the duplicate number. - 
 * See more at: 
 * http://www.java2novice.com/java-interview-programs/duplicate-number/#sthash.Ud8ganGD.dpuf
 */

public class DuplicatedNumber {
	
	private final int[] array;
	
	public DuplicatedNumber(int[] array) {
		this.array = array;
	}
	
	public int find() {
		if (array[0] == array[1]) {
			return array[0];
		}
		return -1;
	}

}
