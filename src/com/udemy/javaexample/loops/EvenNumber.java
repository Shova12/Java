package com.udemy.javaexample.loops;

public class EvenNumber {

	public static void main(String[] args) {
		
		int []a = {12,5,75,48,25,6,111,200};
		
		for(int i=0; i<a.length; i++){
			if(a[i] %2 == 0 ){
				System.out.println( a[i]+" is even number." );
				
			}
			else{
				System.out.println(a[i]+" The number is not even number.");
			}
		}
		
		EvenNumber en = new EvenNumber();// instantiation
		
		int num = 10;
		en.evenCountNumber(num);
		
		int num2 =15;
		en.oddCountNumber(num2);

	}
	
	public void evenCountNumber(int maxcount){
		
		System.out.println("Print all even numbers");
		for(int count=1, evencount=0 ; evencount<maxcount; count++){
			if(count%2 == 0){
				System.out.println(count);
				evencount++;
			}
			
		}
	}
	
	public void oddCountNumber(int maxicount){
		System.out.println("Print all Odd Numbers");
		
		for(int count =1, oddcount=0; oddcount<maxicount; count++){
			
			if(count%2 != 0){
				System.out.println(count);
				oddcount++;
			}
		}
	}

}
