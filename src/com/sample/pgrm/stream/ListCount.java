package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;

public class ListCount {

	//Write a Java program to count the number of strings in a list that start with a specific letter using streams.
	
	public static void main(String[] args) {
		
		List < String > colors = Arrays.asList("red", "grEEn", "rhite", "orange", "pink");
		
		long count=colors.stream()
				.filter(i->i.charAt(0)=='r')
				.count();
		
		System.out.println(count);
		
	}
}
