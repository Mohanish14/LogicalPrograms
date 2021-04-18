package com.reversenumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Ecnter any number please :");
	int no=sc.nextInt();
	//	int no=74985;
		
		int result=0;
		
		while(no>0){
			result=result*10+no%10;
			no=no/10;
			
		}
	 System.out.println("Reverse of a given number "+result);	
    
	}

}
