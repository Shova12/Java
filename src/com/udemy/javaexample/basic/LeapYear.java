package com.udemy.javaexample.basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 2010;
		if (year% 4== 0 && year!=100 ){
			System.out.println("The year is leap year");
		}
		else if (year %400==0){
			
			System.out.println("The year is leap year");
		}
		else{
			System.out.println("The year is not leap year");
		}
		
		LeapYear lp = new LeapYear();
		lp.method1();
		int[] input ={2004,2005,2016,2010,2020};
		//System.out.println(input);
		lp.method2(input);
		
			

	}
	
	public void method1(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year1 = s.nextInt();
		boolean isLeapYear = ((year1%4 ==0 && year1!=100) || (year1%400==0));
		
		if(isLeapYear){
			System.out.println(year1 +" is a LeapYear");
		}
		else{
			System.out.println(year1 +" is not a LeapYear");
		}
		
	}
	
	public int[] method2(int[] year3){
		
		for(int i=0; i<year3.length;i++){
			
			if(year3[i]%4==0 && year3[i]!=100){
				System.out.println(year3[i] + " is Leapyear");
			}
			else if (year3[i]%400==0){
				System.out.println(year3[i] + " is  LeapYear");
			}
			
			else{
				System.out.println(year3[i] + " is not a Leapyear");
			}
			
			
		}
		return year3;
		
	}

}
