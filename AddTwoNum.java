//2:Write a program to adddition of two numbers .
import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1,num2;
		num1=s1.nextInt();
		System.out.println("Enter the second number: ");
		num2=s1.nextInt();
		System.out.println("The addition of "+num1+" and "+num2+" is "+(num1+num2));
		
	}

}
