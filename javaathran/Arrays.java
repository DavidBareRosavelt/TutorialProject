package test.workspace.javaathran;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var var_name[] = {};
		int number1[] = {45, 34, 23, 12, 01};
		System.out.println(number1[3]);
		
		//foreach
		int myNumber[] = {2, 4, 6, 8};
		int result = 0;
		
		for (int x : myNumber) {
			
			result += x;
			//can be done by add any type of operator plus the equals sign
			System.out.println(x);
		}
	}

}
