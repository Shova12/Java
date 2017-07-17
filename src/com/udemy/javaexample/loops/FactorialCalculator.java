package com.udemy.javaexample.loops;

import java.util.Scanner;

public class FactorialCalculator {
	
	//Factorial of 3 = 3*2*1

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
			boolean isVaild = false;
			System.out.println("Enter the number: ");
			int num; 
			
			do{
				num = s.nextInt(); // need to read integer inside DO only, otherwise  false statement print for infinity.
					if(num < 1
							||num >20){
						System.out.println("Please enter the number between 1 and 20.");
					}
					else{
						isVaild = true;
					}
				
			}while( !isVaild);
			
			long factorial = 1;
			for (int num1 = num; num1 >= 1; num1--){
				factorial = factorial* num1;
			}
			
			System.out.println("Factorial of "+num +" is "+ factorial);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}	

	}

}
