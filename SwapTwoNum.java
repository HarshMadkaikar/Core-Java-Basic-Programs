//3:Write a program to swap two numbers.

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1,num2,temp;
		num1=s1.nextInt();
		System.out.println("Enter the second number: ");
		num2=s1.nextInt();
		System.out.println("Before swapping the first number is "+num1+" And the second number is "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping the first number is "+num1+" And the second number is "+num2);
	}

}
