package com.deepcloneingexample;

class C{
	
	protected static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}
	
}

public class Test4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		C.swap(a, b);
		System.out.println(a+ " "+b);

	}

}
