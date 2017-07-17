package com.udemy.javaexample.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pythagorean {

	public static void main(String[] args) {
		
		
	//h^2 = p^2 +b^2
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		String input;
		
		try{
			System.out.println("Precondition: The int must be positive greater than Zero");
			System.out.println("The value of a: ");
			input = br.readLine();
			int a = Integer.parseInt(input);
			
			System.out.println("The value of b: ");
			input = br.readLine();
			int b = Integer.parseInt(input);
			
			System.out.println("The value of c: ");
			input = br.readLine();
			int c = Integer.parseInt(input);
			
			if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)
			|| Math.pow(b,2) == Math.pow(c,2) + Math.pow(a,2)
			|| Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
				
				System.out.println("The inputs are pythagorean tripples");
			}
			else{
				System.out.println("The inputs are not pythagorean tripples");
			}
			
			
			
			
		}
		catch(Exception e){
			System.out.print(e.getMessage());
			e.printStackTrace();
		}

	}

}
