package com.udemy.javaexample.basic;

public class SwapString {

	public static void main(String[] args) {
		String name = "Will Smith";
		
		System.out.println("Before swaping: " + name);
		
		String firstName = name.substring(0, name.indexOf(" "));
		String lastName = name.substring(name.indexOf(" "));
		
		String swapName =  lastName + " ," + firstName;
		
		System.out.println("After swaping: " + swapName);
	}

}
