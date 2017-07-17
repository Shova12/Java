package com.udemy.javaexample.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ConvertFarenheitToCelsius {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String input;
		try{
			System.out.print("Enter Farenheit: ");
			input = br.readLine();
			float tempF = Float.parseFloat(input);
			//float tempF = 89;
			float C = (tempF-32)*5/9;
			//double c = C;
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("The temp. in Celius is "+ df.format(C));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}


	}

	
}
