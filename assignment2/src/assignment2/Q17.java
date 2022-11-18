package assignment2;

//write java to program to find smallest and largest element in array

import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,7,2,17,12,10,29,12,5,10};
		
		Arrays.sort(a);
		
		for(int aa : a) {
			System.out.println(aa);
		}
		System.out.println();
		
		System.out.println("Largest number  : "+a[9]);
		System.out.println("Smallest number : "+a[0]);
		
	}

}
