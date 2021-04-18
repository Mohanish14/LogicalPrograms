package com.fibonacii;

public class UsingRecurstion {
	
	static int a=0;
	static  int b=1;
	static int c;

	public static void main(String[] args) {

		System.out.println(a +" " +b);
		UsingRecurstion s1= new UsingRecurstion();
		s1.fibo(10);
		
		
		

	}
	void fibo(int i){
		if(i>=1){
		c=a+b;
		
		System.out.println(c);
		
		a=b;
		b=c;
		
		
		fibo(i-1);
		}
	}
}
