package assignment2;

import java.util.Arrays;


//write a java program to implement merge sort

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a1 = {2,4,5,10,4,6,12};
		int [] a2 = {3,7,2,10,15,1,4};
		
		int a1len = a1.length;
		int a2len = a2.length;
		int[] b = new int[a1len+a2len];
		
		System.arraycopy(a1, 0, b, 0, a1len);
        System.arraycopy(a2, 0, b, a1len, a2len);
		
    
		System.out.println("First Array : "+Arrays.toString(a1));	
		System.out.println("Second Array : "+Arrays.toString(a2));	
		
		System.out.println("Merge Array : "+Arrays.toString(b));	
		
		Arrays.sort(b);
		
		System.out.println("Merge Sort Array : "+Arrays.toString(b));	
		
		
	}

}
