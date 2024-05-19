//20:Accept a single digit from the user and display it in words. 
//For example, if digit entered is 9, display Nine.

import java.util.Scanner;

public class SimpleSwitch {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any Number from 0 to 9.");
		Scanner s1 = new Scanner(System.in);
		num=s1.nextInt();
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;

		default:
			break;
		}
		
	}

}
