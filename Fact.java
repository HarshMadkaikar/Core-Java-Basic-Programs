//9:Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int num,i,fact=1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s1.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of "+num+" is "+fact);

	}

}
