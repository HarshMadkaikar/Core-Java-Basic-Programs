//15: Write a  program to enter a number and print its reverse.

import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int originalNumber = number;
	        int reverseNumber = 0;
	        
	        while(number != 0) {
	            int digit = number % 10;
	            reverseNumber = reverseNumber * 10 + digit;
	            number /= 10;
	        }
	        System.out.println("The original number is "+originalNumber+" and the reversed Number is "+reverseNumber);
	}

}
