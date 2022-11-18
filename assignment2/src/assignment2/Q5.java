package assignment2;

import java.util.Scanner;

//Write a java program to count occurence of each character in String in java

public class Q5 {

	 public static int count(String s, char c)
	    {
	        int res = 0;
	 
	        for (int i=0; i<s.length(); i++)
	        {
	            
	            if (s.charAt(i) == c)
	            res++;
	        }
	        return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char c2 = 'l';
		System.out.println(count(s1,c2));
	
		
	}

}
