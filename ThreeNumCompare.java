//18:Write a program to find greatest of three numbers using nested if-else.

import java.util.Scanner;

public class ThreeNumCompare {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		num1=s1.nextInt();
		System.out.println("Enter The Second Number: ");
		num2=s1.nextInt();
		System.out.println("Enter The Third Number: ");
		num3=s1.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("The number "+num1+" is greatest among "+num1+" and "+num2+" and "+num3);
		}else if(num2>num1 && num2>num3)
		{
			System.out.println("The number "+num2+" is greatest among "+num1+" and "+num2+" and "+num3);
		}
		else
		{
			System.out.println("The number "+num3+" is greatest among "+num1+" and "+num2+" and "+num3);
		}
		
	}

}
