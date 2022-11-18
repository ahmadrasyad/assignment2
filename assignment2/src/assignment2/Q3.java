package assignment2;

import java.util.Scanner;

//Write a java program for the Armstrong number

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input number : ");
		Scanner sc = new Scanner(System.in);
		int nomor = sc.nextInt();
		int originalNumber = 0;
		int remainder = 0; 
		int result = 0;

        originalNumber = nomor;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == nomor)
            System.out.println(nomor + " is an Armstrong number.");
        else
            System.out.println(nomor + " is not an Armstrong number.");
	}
}


