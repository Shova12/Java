package practice;

public class Array {
	
	public static void main (String[] args){
		int [] input = {-6,-4,-1,2,3,5};
		
		Array newA = new Array();	
		int [] sarr = newA.SquareArray(input);
		int [] iarr = newA.sortArray(sarr);
		
		for (int i =0; i< iarr.length; i ++){
			System.out.println(iarr[i]);
		}	
	
	}
	
	public int [] SquareArray(int [] a){
		int iArray[] = new int[6];
		for (int i=0; i< a.length; i ++){
			iArray[i] = (int) Math.pow(a[i], 2);	

		}				
		return iArray;
	}
	
	public int [] sortArray(int [] a) {
		int temp ;
		for (int i=0; i< a.length; i++){
			for (int j=0; j< a.length; j++){
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
				//System.out.println(a[i]);
			}
		}				
		return a;
	}
	

}
