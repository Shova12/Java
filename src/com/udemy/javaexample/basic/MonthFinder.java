package com.udemy.javaexample.basic;

import java.util.Scanner;

public class MonthFinder {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter month number: ");
		int month = sn.nextInt();
		String strMonth = "";
		 
			switch(month){
				case 1 :
					strMonth = "January";
					break;
				case 2 :
					strMonth = "February";
					break;
				case 3 :
					strMonth = "March";
					break;
				case 4 :
					strMonth = "April";
					break;
				case 5 :
					strMonth = "May";
					break;
				case 6 :
					strMonth = "June";
					break;
				case 7 :
					strMonth = "July";
					break;
				case 8 :
					strMonth = "August";
					break;
				case 9 :
					strMonth = "September";
					break;
				case 10 :
					strMonth = "October";
					break;
				case 11 :
					strMonth = "Novemeber";
					break;
				case 12 :
					strMonth = "December";
					break;
					
				default:
					strMonth = "Invaild month";
					
			}
		System.out.println("The month is "+ strMonth);
		
		

	}

}
