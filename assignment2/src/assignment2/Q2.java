package assignment2;

import java.util.Scanner;

//How to count number of words in string?

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input : ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); //11
		String s2 = s.replaceAll("\\s","");
		//using length to count number of word in string
		System.out.println("Number of word in string is "+s2.length());
		
	}

}
