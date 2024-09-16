package com.sample.pgrm.logics;

public class OddHiphen {
	
	public static void main(String[] args) {
		
		String str="454793879";
		
		String newStr="";
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.getNumericValue(str.charAt(i))%2!=0 
					&& i+1!=str.length()
					&& Character.getNumericValue(str.charAt(i+1))%2!=0) {
				
				newStr=newStr+str.charAt(i)+"-";
				
			}else {
				newStr=newStr+str.charAt(i);
			}
			
		}
		
		System.out.println(newStr);
		
	}

}
