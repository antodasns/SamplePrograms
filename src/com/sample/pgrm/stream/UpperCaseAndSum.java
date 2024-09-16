package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseAndSum {

	public static void main(String[] args) {
		 List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		    System.out.println("List of strings: " + colors);
		    // Convert strings to uppercase using streams
		    List < String > uppercaseStrings = colors.stream()
		    .map(String::toUpperCase)
		    .collect(Collectors.toList());

		    System.out.println("\nUppercase Strings: " + uppercaseStrings);

		    List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		      
		    int oddSum=numbers.stream().filter(i->i%2==0)
		    .reduce((a,b)->a+b).get();
		    
		    System.out.println(oddSum);

	}

}
