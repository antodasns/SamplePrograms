package com.sample.pgrm.logics;

public class HappyNo {
	
	public boolean isHappy(int n) {

        while(n!=1){
        	
            n=powerMethod(n);
            
        }
        
        if(n==1) {
        	return true;
        }else{

        return false;

        }
       
    }

    public int powerMethod(int num){

        String string_number = Integer.toString(num);
        
        int powerInt=0;
 
        for (int i = 0; i < string_number.length(); i++) {
            
        	powerInt=powerInt+(int)Math.pow(Integer.parseInt(String.valueOf(string_number.charAt(i))), 2);
           
        }

        return powerInt;

    }
	
	public static void main(String[] args) {
		
		HappyNo happy=new HappyNo();
		
		System.out.println(happy.isHappy(1));
		
	}

}
