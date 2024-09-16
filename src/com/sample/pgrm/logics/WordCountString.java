package com.sample.pgrm.logics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountString {

	public static void main(String[] args) {
		
		String str="This is a This you hae a a a This";
		
		String[] arr=str.split(" ");
		
		Map<String,Long> mapArr=new HashMap<String,Long>();
		
		mapArr=Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			int c=0;
//			
//			for(int j=0;j<arr.length;j++) {
//				
//				if(arr[i].equals(arr[j])) {
//					c++;}
//				
//			}
//			
//			mapArr.put(arr[i], c);
//			
//		}
		
		mapArr.forEach((key,v)->{
			System.out.println(key);
			System.out.println(v);
			});

	}

}
