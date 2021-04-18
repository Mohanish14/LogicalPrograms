package com.thirdlargestElement;import java.util.Arrays;

public class ThridLargestElement {

	public static void main(String[] args) {

		int array[]={10,50,56,89,53};
		System.out.println(array.length);

		int size=array.length;
		Arrays.sort(array);
		System.out.println("Shorted Array :"+(Arrays.toString(array)));
		System.out.println("3rd Largest element inside the array is:"+(array[size-3]));
		System.out.println("2nd largest element inside the array is :"+(array[size-2]));
		
	}

}
