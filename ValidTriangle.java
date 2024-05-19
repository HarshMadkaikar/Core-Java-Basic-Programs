//8. Write a Java program to input angles of a triangle and check whether triangle is valid or not.

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		float ang1,ang2,ang3,sum;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the measure of first angle: ");
		ang1=s1.nextFloat();
		System.out.println("Enter the measure of first angle: ");
		ang2=s1.nextFloat();
		System.out.println("Enter the measure of first angle: ");
		ang3=s1.nextFloat();
		
		sum=ang1+ang2+ang3;
		
		if (sum==180)
		{
			System.out.println("The triangle is Valid.");
		}
		else
		{
			System.out.println("The triangle is NOT valid.");
		}
	}

}
