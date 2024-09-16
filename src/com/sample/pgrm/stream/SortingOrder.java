package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrder {
	
	public static void main(String[] args) {
		
		List < String > colors = Arrays.asList("red", "grEEn", "rhite", "orange", "pink");
		
		List < String > orderedAsc=colors.stream()
				.sorted().collect(Collectors.toList());
		
		List < String > orderedDesc=colors.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List < String > orderedByLen=colors.stream()
				.sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());
		
		System.out.println(orderedAsc);
		System.out.println(orderedDesc);
		System.out.println(orderedByLen);
		
	}

}
