package com.sample.pgrm.search;

import java.util.Arrays;

public class BinarySearchString {
	
	
	int binarySearch(String arr[], String element) {

		 int l = 0, r = arr.length - 1; 
		  
	        // Loop to implement Binary Search 
	        while (l <= r) { 
	  
	            // Calculatiing mid 
	            int m = l + (r - l) / 2; 
	  
	            int res = element.compareTo(arr[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
	  }
	
	public static void main(String[] args) {
		
		BinarySearchString obj = new BinarySearchString();
		 String[] array = { "contribute", "geeks", "ide", "practice"};
		 
		 Arrays.sort(array);
		 
		    int n = array.length;

		    int result = obj.binarySearch(array, "ide");
		    
		    System.out.println(result+1);

	}

}
