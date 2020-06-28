package coreJavaTraining;

public class ArraysDemo {

	// Arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a; a=4;
		 */

		// - A container which stores multiple values of same data type

		int a[] = new int[5];// Delcares an aray and allocates memory for the values
		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;// initilased values into that array
		
		String []ab=new String[0];
		System.out.println(ab.length);
		
		Integer num=new Integer(5);
		String cd="f";
		System.out.println("git checking 1");
		System.out.println("git checking 2");

		int b[] = { 1, 4, 3, 5, 7, 8 };

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			// retrieve values present in this array/
		}

	}

}
