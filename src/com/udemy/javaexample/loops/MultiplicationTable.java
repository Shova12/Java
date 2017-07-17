package com.udemy.javaexample.loops;

public class MultiplicationTable {

	public static void main(String[] args) {
	
		MultiplicationTable mt = new MultiplicationTable();
		mt.method(20);
		
	}
	
	public void method(int x){
		System.out.println("Multiplication Table: ");
		for(int y=1; y<=10; y++){
			int product = x*y;
			//System.out.println("The product of x and y: ");
			System.out.println(x+" * "+ y+ " = " + product);
		}
	}
	
	public void method1(int[]x,int[]y){
		
		for(int i=1; i<=10; i++){
			
		}
	}

}
