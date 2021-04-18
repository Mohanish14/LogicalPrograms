package com.loops;

import java.util.Scanner;

public class Programms {

	public static void main(String[] args) {
 
		Scanner s=new Scanner(System.in);
		int sum=0;
		
		for(int i=1;i<=5;i++){
		
			System.out.println("Enter a number");
			int k=s.nextInt();
			sum=k+sum;
			
			System.out.println(sum);
		}
		 
		
		
	}

}
