package assignment2;

//Find the second largest number in array

import java.util.Arrays;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {2,1,5,8,12,18,4,21,7};
		
		Arrays.sort(a);
		System.out.println("Sorting number : ");
		for(int aa : a) {
			System.out.println(aa);
		}
		System.out.println();
		
		System.out.println("Second Largest : "+a[7]);
		
	}

}
