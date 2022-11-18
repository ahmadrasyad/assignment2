package assignment2;

import java.util.Arrays;

//how to seperate odd and even numbers in array

public class Q19 {

	public static int[] seperate(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		for(int i = 0; i<arr.length;i++) {
			//even number
			while(arr[left]%2==0)
			{
				left++;
			}
			//odd number
			while(arr[right]%2==1) {
				right--;
			}
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right]= temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] a1 = {3,7,2,10,15,1,4};
		
		System.out.println("Original Arrya :");
		System.out.println(Arrays.toString(a1));
		
		
		a1 = seperate(a1);
		System.out.println("Array seperate Even(Left) and Odd(Right) number");
		System.out.println(Arrays.toString(a1));
		
		
	}

}
