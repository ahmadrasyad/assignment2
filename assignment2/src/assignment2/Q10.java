package assignment2;

import java.util.Scanner;

//convert Lowercase to Uppercase in java and Uppercase to Lowercase without using built in method

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input name : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char str[]= input.toCharArray();
		for(int i = 0; i<str.length;i++) {
			if(str[i]>='a' && str[i] <= 'z') {
				str[i] = (char)((int) str[i] - 32);
			}else if(str[i]>='A' && str[i] <= 'Z') {
				str[i] = (char)((int) str[i] + 32);
			}
		}
		System.out.println("Uppercase string or Lowercase String: ");
		for(int i = 0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		
	}

}
