package com.vetus.tdd.problem02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
		if (array[0] == array[array.length -1]) {
			return array[array.length-1];
		}
		int result = -1;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
				result = array[i];
				break;
			} else {
				set.add(array[i]);
			}
		}
		return result;
	}

}
