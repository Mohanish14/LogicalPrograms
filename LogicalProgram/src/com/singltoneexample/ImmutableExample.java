package com.singltoneexample;

public final class ImmutableExample {

	final int id;
	final String name;

	public int getId() {
		return id;

	}

	public String getName() {

		return name;
	}

	public ImmutableExample(int id, String name) {

		this.id = id;

		this.name = name;
	}

	public static void main(String[] args) {

		ImmutableExample im = new ImmutableExample(20, "Akshay");
		// im.id=30;

	}

}
