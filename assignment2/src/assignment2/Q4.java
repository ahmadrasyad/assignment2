package assignment2;

import java.util.Arrays;

//write a java program to check whether two given strings are anagram

public class Q4 {

	static boolean anagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		
		if(n1 != n2) {
			return false;
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i = 0; i<n1;i++)
			if(str1[i] != str2[i]) {
				return false;
			}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char str1[] = { 'c', 'd', 'a', 'm' };
	     char str2[] = { 'd', 'c', 'm', 'a' };
	     
	     
	     if (anagram(str1, str2))
	            System.out.println("The two strings are anagram of each other");
	        else
	            System.out.println("The two strings are not anagram of each other");
	}

}
