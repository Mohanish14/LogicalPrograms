package com.userexception;

public class UserException extends Exception {

	public UserException(String s) {

		super(s);
	}

	public static void main(String[] args) {

		try {

			throw new UserException("Our created exception");
			
		} catch (UserException e) {
			System.out.println("Our created Exception work");
			System.out.println(e.getMessage());
		}

	}

}
