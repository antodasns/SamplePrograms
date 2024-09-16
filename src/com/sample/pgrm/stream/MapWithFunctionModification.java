package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapWithFunctionModification {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer>multi=i->i*i;
		
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		
		List<Integer> num2=num.stream().map(i->multi.apply(i)).collect(Collectors.toList());
		
		System.out.println(num2);
		
	}

}
