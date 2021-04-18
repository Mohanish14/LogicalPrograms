package com.primenumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {

		int a[]={5,6,7,5,3,6,3,5};
		/* Set<Integer> s1 =new HashSet<>();
	
		 for(int b:a){
			 
			 if(s1.add(b)==false){
				 
				 System.out.println(b);
			 }*/
			 
			 Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
			 
			 for (int i = 0; i < a.length; i++) {
				 
				 if(mp.get(a[i])!=null){
					 
					 mp.put(a[i], mp.get(a[i])+1);
				 }
				
				 else {
					mp.put(a[i], 1);
				}
			}
			 
			 Iterator<Integer> itr=mp.keySet().iterator();
			 while(itr.hasNext()){
			 Integer i1=itr.next();
			 
			 if(mp.get(i1)>1){
				 
				 System.out.println("Duplicate number is:"+a[i1] +"Number of time they reppted is :"+mp.get(a[i1]));
			 }
			 
			 }
		 }

	

}
