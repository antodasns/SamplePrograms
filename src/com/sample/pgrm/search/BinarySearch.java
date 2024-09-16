package com.sample.pgrm.search;

import java.util.Arrays;

public class BinarySearch {
	
	
	int binarySearch(int array[], int element) {

	    // Repeat until the pointers low and high meet each other
		int low=0;
		
		int high = (array.length)-1;
		
	    while (low <= high) {

	      // get index of mid element
	      int mid = low + (high - low) / 2;

	      // if element to be searched is the mid element
	      if (array[mid] == element)
	        return mid;

	      // if element is less than mid element
	      // search only the left side of mid
	      if (array[mid] < element)
	        low = mid + 1;

	      // if element is greater than mid element
	      // search only the right side of mid
	      else
	        high = mid - 1;
	    }

	    return -1;
	  }
	
	public static void main(String[] args) {
		
		BinarySearch obj = new BinarySearch();
		 int[] array = { 3, 4, 5,9,15,100,20, 6, 7,40,17,35,45 ,10, 8 };
		 
		 Arrays.sort(array);
		 
		    int n = array.length;

		    int result = obj.binarySearch(array, 35);
		    
		    System.out.println(result+1);

	}

}
