package com.udemy.javaexample.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbers {

	public static void main(String[] args) {

		//primeNumberCheck(132);
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		String input;
		try{
			
			System.out.println("Read all prime numbers");
			System.out.println("Enter prime number to be read: ");
			input = br.readLine();
			int maxPrimeCount = Integer.parseInt(input);
			System.out.println("Prime Numbers: ");
			
			for(int count=2, primeCount=0; primeCount<maxPrimeCount; count++ ){
				if(primeNumberCheck(count)){
					System.out.println(count);
					primeCount++;
					
				}
			}
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		

	}
	
	private static boolean primeNumberCheck(int num){
		boolean isPrime = true;
		if(num==2){
			isPrime = true;
			//System.out.println(num+" is PrimeNumber");
			
		}
		else if(num%2==0) {
			isPrime = false;
			//System.out.println(num+" is not PrimeNumber");
		}
		else{
			 int maxCount = (int)Math.ceil(Math.sqrt(num)); // Math.ceil will give large number than square of number(round number of Math.sqrt)
			 //boolean isPrime = true;
			 for(int count =3; count <= maxCount; count = count +2){
				 if(num%count == 0){
					 isPrime = false;
					 break;
				 }
				 
			 }
			 
			 /*if(isPrime){
				 System.out.println(num+ " is Prime number");
			 }
			 else{
				 System.out.println(num+" is not PrimeNumber");
			 }*/
		}
		return isPrime;
	}

}
