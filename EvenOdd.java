//4. Write a program to accept an integer and check if it is even or odd.

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num;
		num=s1.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number is even.");
		}
		else
		{
			System.out.println("The number is odd.");
		}
	}

}
