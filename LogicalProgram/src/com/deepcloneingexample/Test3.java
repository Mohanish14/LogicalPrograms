package com.deepcloneingexample;

public class Test3 {
	
	public static String fun(String s){
		
		if(s=="hello")
			return "yes";
		else 
			return "no";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1=new Test3();
		t1.fun(null);
		System.out.println(t1.fun(null));
	}

}
