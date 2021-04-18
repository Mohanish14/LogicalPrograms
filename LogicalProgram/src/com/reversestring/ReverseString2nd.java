package com.reversestring;

public class ReverseString2nd {

	public void reverseString() {

		String str="akshaychidre";
	//	StringBuffer sb=new StringBuffer();
		int l1=str.length();
		for(int i=l1-1;i>=0;i--){
			
			System.out.print(str.valueOf(str.charAt(i)));
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString2nd sd=new ReverseString2nd();
		
		sd.reverseString();
	}

}
