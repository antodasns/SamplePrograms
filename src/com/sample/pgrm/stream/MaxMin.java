package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {
	
	public static void main(String[] args) {
		
		List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7,47,2, 8, 9,4,10,4,10,11);
		
		Optional<Integer> min=numbers.stream().min(Integer::compare);
		
		Optional<Integer> max=numbers.stream().max(Integer::compare);
		
		System.out.println(min.get());
		System.out.println(max.get());
	}

}
