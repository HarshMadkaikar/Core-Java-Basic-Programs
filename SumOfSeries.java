//12:Sum of series :
//	1+2+3+….+n

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		
		int num,i,sum=0;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num=s1.nextInt();
		
		for (i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of numbers till "+num+" is "+sum);

	}

}
