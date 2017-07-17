package com.udemy.javaexample.basic;

public class AddNumbers {

	public static void main(String[] args) {
		int [] input = {1,2,3,4,5};
		//int [] input2 = {2,4,5,7};
		AddNumbers newAdd= new AddNumbers();
		//int sumof2Numbers = newAdd.addNumbers(1234, 2345);
		
		int sArray = newAdd.sumofArrays(input);
		
		
		
		
	}
	
	public static int addNumbers(int i, int j){
		/*int a = 0;
		int b = 0;*/
		int sum = i + j;
		System.out.print("The sum of a and b is "+sum);
		return sum;	
		
	}
	
	public static int sumofArrays(int[] input){
		int array[] = new int[10];
		int sum = 0;
		for(int num : array){
			System.out.println("number "+num);
			sum = sum + num;
		
				System.out.println("The sum of Array is "+sum);
			
			
		}
		return sum;		
	}

}
