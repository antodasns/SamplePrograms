package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
	
	public static void main(String[] args) {
		
		List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7,2, 8, 9,4,10,4,10,11);
		
		List<Integer>noDup=numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(noDup);
		
	}

}
