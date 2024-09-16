package com.sample.pgrm.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteratorStream {

	public static void main(String[] args) {
		
		List<Integer> nums=Stream.iterate(1,i->i+1)
				.limit(50)
				.filter(i->i%2==0)
				.collect(Collectors.toList());
		
		nums.forEach(System.out::println);	

	}

}
