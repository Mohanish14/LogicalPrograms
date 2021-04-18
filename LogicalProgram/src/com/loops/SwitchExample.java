package com.loops;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Character:");
       String s1=s.next();
       
       
       switch(s1){
       case "A":
    	   System.out.println("a");
    	   break;
    	   
       case "B":
    	   System.out.println("b");
         break;
       
       case "C":
    	   System.out.println("c");
    	   break;
      default:
           System.out.println("not a string");       
         
       }
	}

}
