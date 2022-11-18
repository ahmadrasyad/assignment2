package assignment2;

import java.util.Scanner;

//write a java program to find out the square root of given number ?




public class Q6 {

	public static double root(int num) {
		double d;
		double sqr = num/2;
		
		do {d = sqr;
		sqr = (d+(num/d))/2;
		}
		while((d-sqr)!=0);
			return sqr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("The root of "+n+" is "+root(n));
		
	}

}
