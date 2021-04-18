package com.primenumber;

import java.util.Scanner;

public class PrimeNumber{
	
	public static void cheackPrime (int no){
		
		int temp=0;
		
		for(int i=2; i<=no/2;i++){
			
			if(no%i==0){
				
				temp=temp+1;
			}
		}
		
		if(temp==0){
			System.out.println("Gven number is primenumber :"+no);
		}
		
		else{
			System.out.println("Given number is not prime number :"+no);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a any number:");
		int no=sc.nextInt();
		cheackPrime(no);
		
		
		
	}
	
	
	
}