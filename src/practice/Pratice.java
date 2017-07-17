
package practice;

import java.util.Arrays;

public class Pratice {

	public static void main(String[] args) {
		
		
		int iArr[] = {-6,-4,-1,2,3,5};
		for (int number : iArr){
		
		System.out.println("Number =" +number);
		}
		for(int i =0; i < iArr.length; i++){
			iArr[i] = (int) Math.pow(iArr[i], 2);
				
		}
		Arrays.sort(iArr);
		for(int value : iArr){
			
			System.out.println("The sorted squared "+value);
			
		}
		
		/*Arrays.sort(iArr);
		System.out.println("The sorted int is " );
		
		for(int number :iArr){
			System.out.println(number);
		}*/

	}

}
