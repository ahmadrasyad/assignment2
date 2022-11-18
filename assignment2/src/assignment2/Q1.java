package assignment2;

import java.util.HashSet;
import java.util.Scanner;

//write a java program to find out given String has Unique Characters

public class Q1 {

	static int unique(String str)
	{
		HashSet<Character> s = new HashSet<Character>();
		
		for(int i = 0;i<str.length();i++) {
			s.add(str.charAt(i));
		}
		return s.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input : ");
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine();
		System.out.println(unique(str));
		
	}

}
