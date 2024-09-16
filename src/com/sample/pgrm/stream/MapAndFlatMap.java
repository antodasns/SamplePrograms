package com.sample.pgrm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> names=Arrays.asList(
				Arrays.asList("abc","efg","hij")
				,Arrays.asList("abc","efg","hij")
				);
		
		List<String>newname=names.stream().map(i->i+"a").collect(Collectors.toList());
		
		List<String>newname2=names.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		
		newname2.forEach(i->System.out.println(i));

	}

}
