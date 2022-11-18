package assignment2;

//How to calculate total number of vowels in string

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		System.out.print("Enter Sentence :");
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'a'||c == 'A'||
			   c == 'i'||c == 'I'||
			   c == 'u'||c == 'U'||
			   c == 'e'||c == 'E'||
			   c == 'o'||c == 'O') {
				count++;
			}
		}
		System.out.println("Number of vowel in sentence : "+count);
	}

}
