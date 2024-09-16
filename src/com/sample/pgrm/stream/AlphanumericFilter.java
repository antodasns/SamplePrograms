package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlphanumericFilter {

	public static void main(String[] args) {
		String str = "a1b2c3d4e5f6g7h8i9j0";
		
		String [] array = str.split("");
		
		List<String> nums = Arrays.stream(array)
		.filter(num->Character.isDigit(num.charAt(0))).collect(Collectors.toList());
		
		System.out.println("Numbers only: " + nums);

	}

}
