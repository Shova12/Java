package com.udemy.javaexample.basic;

public class UnaryOperation {

	public static void main(String[] args) {
		int num1 = 19;
		int num2 = 0;
		
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		
		//num1++;
		//num1--;
		//++num1;
		--num1;
		System.out.println("After changing in num1:"+num1 + " Number2: " +num2);
		
		//PRE increment after assigning values
		
		num2 = num1++; // num2 =num1; num1 =num1+1
		System.out.println("After PRE increasing in Number1: "+ num1 +" Number2: "+num2);
		
		//POST increment 
		num2 =++num1; // num1= num1+1 ; num2= num1
		
		
		System.out.println("After POST increasing in Number1: "+ num1 + " Number2 "+num2);
		
		
	}

}
