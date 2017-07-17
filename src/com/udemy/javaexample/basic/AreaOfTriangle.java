package com.udemy.javaexample.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class AreaOfTriangle {
	
	public static void main (String[]args){
		
		int height = 12;
		int base = 6;
		int area ;
			
		area = (height*base)/2;
			
		System.out.println("The area of Triangle is : "+ area);
		
		
		//When 3 sides are given
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		String input;
		
		try{
			
			
			System.out.println("Enter side1: ");
			input = br.readLine();
			float side1 = Float.parseFloat(input) ;
			
			System.out.println("Enter side2: ");
			input = br.readLine();
			float side2 = Float.parseFloat(input) ;
			
			System.out.println("Enter side3: ");
			input = br.readLine();
			float side3 = Float.parseFloat(input) ;
			
			if((side1+side2>side3) 
					&&(side2+side3> side1) 
					&&(side3+side1>side2)){
				float perimeter = side1 + side2 +side3;
				float p = perimeter/2;
				
				DecimalFormat df = new DecimalFormat("0.00");
				double area1 = Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
				
				System.out.println("The area of Triangle2 is : "+ df.format(area1));
				
			}
			else {
                System.out.println( "Cannot form a closed triangle with the given sides" );
            }
			
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		
	}
	
	

}
