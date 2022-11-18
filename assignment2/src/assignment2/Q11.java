package assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//write a java program to find common elements between two given array

public class Q11 {

	private static void common(int [] arr1, int [] arr2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int i : arr1) {
			set1.add(i);
		}
		
		for (int i : arr2) {
			set2.add(i);
		}
		
		set1.retainAll(set2);
		System.out.println("Common elements : "+set1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = {2,4,5,10,4,6,12};
		int [] a2 = {3,7,2,10,15,1,4};
		
		System.out.println("Array 1: "+ Arrays.toString(a1));

		System.out.println("Array 2: " + Arrays.toString(a2));
		
		common(a1,a2);
		
	}

}
