package com.repeatednumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReapetedElement {
	
	Object obj;
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((obj == null) ? 0 : obj.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReapetedElement other = (ReapetedElement) obj;
		if (this.obj == null) {
			if (other.obj != null)
				return false;
		} else if (!this.obj.equals(other.obj))
			return false;
		return true;
	}



	public static void main(String[] args) {

		int a[]={20,30,56,86,45,60};
		
		for(int i=1;i<=20;i++){
			if(i%5==0){
				
				continue;
			}
			System.out.println(i);
			
		}
	}

}
