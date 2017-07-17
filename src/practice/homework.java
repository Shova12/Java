package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class homework {
	
	
	public static void main(String[] args) {
		/*int[] Array1 =  {1,2,3,4,5,6,7,8,9,10};
		
		//toString methods returns Arrays
		
			System.out.println(Arrays.toString(Array1));
		
	}*/
		
		ArrayList<Integer>number = new ArrayList<Integer>(101);	
		for(int i=1; i<=100; i++){
			number.add(i);
			//System.out.println(number.get(i-1));
			
		}
		
		homework h = new homework();
		int [] a;
		int [] eNumber = h.evenNumber();
		for (int i=0; i<eNumber.length;i++){
			
			System.out.println(eNumber[i]);
		}
	}
	
	public int[] evenNumber(){
		int[] a = new int[51];
		int j =0;
		for (int i=0; i<=100;i++){
			if(i%2==0){
				a[j]=i;
				j++;
				//System.out.println(a[i]);
			}
		}
		return a;
		
	}
	
	

}
