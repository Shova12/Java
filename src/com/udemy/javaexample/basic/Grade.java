package com.udemy.javaexample.basic;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		String grade = "F";
		float score = (float) 80;
		System.out.println("Pre condition: The score can't be negative.");
		if(score >= 90){
			grade = "A+";
		}
		else if(score >=80 && score < 90){
			grade = "A";
		}

		else if(score >= 70 && score < 80){
			grade = "A-";
		}
		
		else if(score >= 60 && score < 70){
			grade = "B+";
		}

		else if(score >= 50 && score < 60){
			grade = "B";
		}

		else if(score >= 40 && score < 50){
			grade = "B-";
		}

		else {
			grade = "F";
		}
		
		System.out.println("The grade is "+ grade);
		
		Grade g = new Grade();
		int [] input = {4,35,80,56,74,90,95};
		g.grade1(input);
		g.method();


	}

		public  String grade1(int [] score1){
			System.out.println("Pre condition: The score can't be negative.");
			String grade2 = "F";
			
			for(int i=0; i<score1.length; i++){
				if(score1[i] >= 90){
					grade2 = "A+";
				}
				else if(score1[i] >=80 && score1[i] < 90){
					grade2 = "A";
				}

				else if(score1[i] >= 70 && score1[i] < 80){
					grade2 = "A-";
				}
				
				else if(score1[i] >= 60 && score1[i] < 70){
					grade2 = "B+";
				}

				else if(score1[i] >= 50 && score1[i] < 60){
					grade2 = "B";
				}

				else if(score1[i]>= 40 && score1[i] < 50){
					grade2 = "B-";
				}

				else {
					grade2 = "F";
				}
				
				System.out.println("The grade is "+ grade2);
				
				
			}
			
			return grade2;
			
		}
		
		public void method(){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter positive score: ");
			int record = s.nextInt();
			String grade3 = "F";
			if(record >= 90){
				grade3 = "A+";
			}
			else if(record >=80 && record < 90){
				grade3 = "A";
			}

			else if(record >= 70 && record < 80){
				grade3 = "A-";
			}
			
			else if(record >= 60 && record < 70){
				grade3 = "B+";
			}

			else if(record >= 50 && record < 60){
				grade3 = "B";
			}

			else if(record>= 40 && record < 50){
				grade3 = "B-";
			}

			else {
				grade3 = "F";
			}
			
			System.out.println("The grade is "+ grade3);
			
		} 
}
