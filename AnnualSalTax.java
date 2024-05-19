//6. Write a program, which accepts annual basic salary of an employee and calculates and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30% 

import java.util.Scanner;

public class AnnualSalTax {

	public static void main(String[] args) {
		double sal,tax;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the annual Salary: ");
		sal=s1.nextDouble();
		if(sal < 150000)
		{
			tax=0;
			System.out.println("You don't have to pay the tax...");
		}
		else if(sal>=150000 && sal<=300000)
		{
			tax=sal*0.2;
			System.out.println("You have to pay "+tax+" tax amount.");
		}
		else
		{
			tax=sal*0.3;
			System.out.println("You have to pay "+tax+" tax amount.");
		}
	}

}
