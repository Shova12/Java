package com.udemy.javaexample.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ConvertCeliusToFarenheit {

	public static void main(String[] args) {
		
			InputStreamReader sr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(sr);
			String input;
			
			try{
				System.out.println("Enter tempature in Celius: ");
				input = br.readLine();
				float tempC = Float.parseFloat(input);
				float tempF =  tempC *9/5 + 32;
				DecimalFormat df = new DecimalFormat("0.00");
				//double F = tempF;
				System.out.println("The tempature in Farenheit is " + df.format(tempF));
				
				
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				
			}
			
			

	}


}