//14:Write a  program to find sum of all even and odd numbers between 1 to n. 

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		int num,i,j;
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter number: ");
		num=s1.nextInt();
		int sumeven=0,sumodd=0;
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sumeven+=i;
			}
			else
			{
				sumodd+=i;
			}
			
		}
		System.out.println("The sum of all even numbers bertween 1 to "+num+" is "+sumeven);
		System.out.println("The sum of all odd numbers between 1 to "+num+" is "+sumodd);
	}

}
