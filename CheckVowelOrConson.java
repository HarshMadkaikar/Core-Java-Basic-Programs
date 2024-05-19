//7. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)

import java.util.Scanner;

public class CheckVowelOrConson {

	public static void main(String[] args) {
		char c;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the lower case character: ");
		c=s1.next().charAt(0);
		
		if ( c =='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("The entered character is vowel..");
		}
		else
		{
			System.out.println("The entered character is consonent");
		}
	}

}
