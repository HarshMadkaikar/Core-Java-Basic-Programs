//21. Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the 
//corresponding operation and displays the result.
import java.util.Scanner;

public class TwoNumOneOperat {

	public static void main(String[] args) {
		int num1,num2;
		char c;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		num1=s1.nextInt();
		System.out.println("Enter The Second Number: ");
		num2=s1.nextInt();
		System.out.println("Enter the any of the characters to perform that pericular operation(+,-,*,/): ");
		c=s1.next().charAt(0);
		
		switch (c) {
		case '+':
			System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
			break;
		case '-':
			System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
			break;
		case '/':
			System.out.println("Division of "+num1+" by "+num2+" is "+(num1/num2));
			break;

		default:
			break;
		}
		

	}

}
