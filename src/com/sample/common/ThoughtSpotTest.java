package com.sample.common;

public class ThoughtSpotTest {
	
	public static String reverseString(String str) {
		
		String newStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			newStr=newStr+str.charAt(i);
			
		}
		
		return newStr;
		
	}

	public static void main(String[] args) {
		
		String s = "abcd";
				//Output: "aaacecaaa"
				//Example 2:
				//Input: s = "abcd"
				//Output: "dcbabcd"

		// TODO Auto-generated method stub
		
		String newStr=s;
		
		if(!newStr.equals(reverseString(newStr))) {
		
			for(int i=0;i<=s.length()-1;i++) {
				 newStr=s.charAt(i)+newStr;
				if(s.length()%2==0) {
					if(i==0) {
						if(newStr.equals(reverseString(newStr))) {
							System.out.println(newStr);
						}
					}else {
						if(newStr.equals(reverseString(newStr))) {
							System.out.println(newStr);
						}
					}
				}else {
					if(newStr.equals(reverseString(newStr))) {
						System.out.println(newStr);
					}
				}
				
			}
		
		}else {
			System.out.println(newStr);
		}

	}

}
