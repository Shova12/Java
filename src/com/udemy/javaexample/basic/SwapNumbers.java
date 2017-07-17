package com.udemy.javaexample.basic;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 121;
		int b = 245;
		
		System.out.println("Before Swaping Number 1 "+ a + "  Number2: "+b);
		
		int temp = a;
		a = b;
		b = temp; //If we do b = a in line then value of b will be 24 as a is already assigned to b in above code line 
		
		System.out.println("After Swaping Number 1 "+ a + "  Number2: "+b);
		
		SwapNumbers sw = new SwapNumbers();
		sw.swapNumberWithoutTempVariable();

	}
	
	public int swapNumberWithoutTempVariable(){
		
		int c = 23;
		int d = 12;
		
		System.out.println("Before Swap: ");
		
		System.out.println("Number 1 "+ c + "  Number2: "+d);
	
	
		// can be done by add and subtract method too.
		c = c * d;
		
		d =  c/d;
		
		c = c/ d;
		
		System.out.println("After Swaping ");
		
		System.out.println("Number 1 "+ c + "  Number2: "+d);
		return 0;
		
	}

}
