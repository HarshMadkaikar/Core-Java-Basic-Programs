//10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		int n,m,i;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number: ");
		m=s1.nextInt();
		System.out.println("Enter the power: ");
		n=s1.nextInt();
		System.out.println(Math.pow(m, n)); 
	}

}
