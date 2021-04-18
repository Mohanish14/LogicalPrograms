package com.reversestring;

public class ReverseString3rd {
	
	public static String reverse(String in){
		char[] temp=in.toCharArray();
		int left ,right=0;
		right=temp.length-1;
		for(left=0; left<right ; left++ ,right--){
			
			char tp=temp[left];
			temp[left]=temp[right];
			temp[right]=tp;
		}
		
		
		return String.valueOf(temp);
	}
	
	public static String reverseString(String input){
		
     char[] temp=input.toCharArray();		
     int i,j=0;
     j=temp.length-1;
     for( i=0;i<j; i++,j--){
        char ch  =temp[i];
        temp[i]=temp[j];
        temp[j]=ch;
     }
     
     
		
     return String.valueOf(temp);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="akshay";
		str=reverse(str);
		System.out.println(str);
		
		String str1="Chidre";
		str1=reverseString(str1);
		System.out.println(str1);
		
		
		StringBuffer sb=new StringBuffer(str1);

		System.out.println(sb.reverse());
	}

}
