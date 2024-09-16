package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndMulti {
	
	public static void main(String[] args) {
		
		//Write a program to find even 
		//numbers from a list of integers and multiply with 2 using stream java 8.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> multi=numbers.stream()
				.filter(i->i%2==0)
				.map(n->n*2).
				collect(Collectors.toList());	
		System.out.println(multi);
		
	}

}
