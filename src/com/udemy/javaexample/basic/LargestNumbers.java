package com.udemy.javaexample.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class LargestNumbers {

	//different methods to find largest and smallest
	
	public static void main(String[] args) {
		
		int a = 1023;
		int b = 10231;
		int c = 1023;
		int largest = 0;
		
		if(a>b && a>c){
			largest = a; 
		}
		
		else if(b>a && b>c){
			largest = b;
			
		}
		else{
			largest = c;
		}
		
		System.out.println("The largest number is :" + largest);
		
		LargestNumbers ln = new  LargestNumbers();
		int[] input = new int[] {2, 1,4,6,7,8,9,12};
		ln.findLargestAndSmallestNumber(input);
		//second function
		ln.findLargestNumbers();
		
	}
	public void findLargestAndSmallestNumber(int[] input){	
		int smallest = input[0];
		int largest = input[0];
	

		for(int i=0; i<input.length; i++){
					if(input[i]>largest ){
						 largest = input[i];
					}
					else if(input[i]< smallest){
						smallest = input[i];
					}
					
			
			
		}
		System.out.println("The largest number is :" + largest);
		System.out.println("The smallest number is :" + smallest);
		
	}
	
	public void findLargestNumbers(){
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		String values;
		
		
		try {
			System.out.println("Enter the value of  x: ");
			values = br.readLine();
			int x = Integer.parseInt(values);
			System.out.println("Enter the value of  y: ");
			values = br.readLine();
			int y = Integer.parseInt(values);
			System.out.println("Enter the value of  z: ");
			values = br.readLine();
			int z = Integer.parseInt(values);
			
			int largest = x;
			
			if(y>largest){
				largest = y;
				
			}
			else if (z > largest){
				largest = z;
			}
			
			System.out.println("The Largest value is "+ largest);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
		
	}

}
