package com.sample.pgrm.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LastNumber {
	
	public static void main(String[] args) {
		
		Integer arr[]= {1,2,7,8};
		
		Integer last=Arrays.stream(arr).sorted(Comparator.reverseOrder()).findFirst().get();
		
		System.out.println(last);
		
	}
	

}
