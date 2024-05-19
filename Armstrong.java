//17:Write a program to check entered number is Armstrong number or not.

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,n1,tempnum,sum=0,r;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s1.nextInt();
		tempnum=num;
		while(num>0)
		{
			r=num%10;
			sum+=r*r*r;
			num=num/10;
		}
		if(tempnum==sum)
		{
			System.out.println("The number "+tempnum+" is an Armstrong Number.");
		}
		else
		{
			System.out.println("The number "+tempnum+" is not an Armstrong Number.");
		}
	}

}
