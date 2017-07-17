package com.udemy.javaexample.basic;

public class DaysFinder {

	public static void main(String[] args) {
			int years = 2016;
			int months = 21;
			int noOfDays = 0;
			if(months == 1 
					|| months == 3 
					|| months == 5 
					|| months == 7
					|| months == 8 
					|| months == 9 
					|| months == 10 
					|| months == 12){
				noOfDays = 31; 
			}
			
			else if (months == 4 
					|| months == 6 
					|| months == 9 
					|| months == 11){
				
				noOfDays = 30;
				
			}
			
			else if(months == 2){
				if((years%4 ==0 && years!=100) || (years%400==0)){
					noOfDays = 29;
				}
				else{
				noOfDays = 28;
				}
			}
			else {
				System.out.println("Enter valid month");
			}
			
			System.out.println("Year: "+years);
			System.out.println("The no of days in month: "+ noOfDays);		

	}

}
