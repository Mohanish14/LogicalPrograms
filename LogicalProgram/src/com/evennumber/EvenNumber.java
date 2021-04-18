package com.evennumber;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Plase Enter a number :");
		int no=sc.nextInt();
		int j=no%2;
		String result=(j==0?"even ":"odd");
		System.out.println(result);
		
		testprime(no);

	}
	
	public  static void   testprime(int no){
		int temp;
		boolean primeno=true;
		
		for(int i=2;i<=i/2;i++){
			temp=no%i;
			
			if(temp==0){
				
				primeno=false;
				 
				break;
			}
			else{System.out.println("given number is not prime number :"+no);}
		}
		
		if(primeno){
			System.out.println("Given number is prime number :"+no);
			
		}
		
	//	else{System.out.println("given number is not prime number :"+no);}
		
	}

}
