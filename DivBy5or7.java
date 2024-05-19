//Write a program to accept a number and check if it is divisible by 5 and 7.

import java.util.Scanner;

public class DivBy5or7 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num1;
		num1=s1.nextInt();
		
		if (num1%5==0)
		{
			System.out.println("The number is divisible by 5.");
		}
		else if (num1%11==0)
		{
			System.out.println("The number is divisible by 11");
		}
		else {
			System.out.println("The number is neither divisible by 5 nor by 11.");
		}
	}

}
