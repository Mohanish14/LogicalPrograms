package com.clonehashcodeandequals;

import org.omg.Messaging.SyncScopeHelper;

interface Mark{}

class Expce extends Exception{
	
	public Expce(String s){
		
		super(s);
	}
	
	
}

class Sum{
	
	public void m1() throws Expce{
		
		if(this instanceof Mark){
			
			System.out.println("Done it");
		}
		
		else{
			
			throw new Expce("You must create implament marker inteface");
		}
		
	}
	
	
}


public class Test extends Sum {
	
	public static void main(String[] args) {
		
		Test t=new Test();
		try{
			
			t.m1();
		}catch(Expce e){
			
			System.out.println(e);
		}
	}

}
