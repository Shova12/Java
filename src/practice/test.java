package practice;

public class test {

		public static void main(String args[]) {
			for(int i = 1; i < 3; i++){
				  for(int j = 3; j > i; j--)
				     assert i!=j; // complier error if there is ; symbol
				  System.out.println(i);
			}
		}



}
