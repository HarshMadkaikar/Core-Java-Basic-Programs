//11:Check if number is a prime number or not.: 

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num,j;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The number: ");
		num=s1.nextInt();
		boolean status=false;
		for( j=2; j < num;j++)
		{
			if(num%j==0)
			{
				status=false;
				break;
			}
			else
			{
				status=true;
				
			}
		}
		if(num==2) {
			System.out.println("The Entered number is prime number. ");
		}
		else
		if(status==true)
		{
			System.out.println("The Entered number is prime number.");
		}
		else
		{
			System.out.println("The Entered number is not Prime number.");
		}
		
	}

}
