//16:Write a  program to print all Prime numbers between 1 to n.
import java.util.Scanner;

public class PrimeOrNotBetN {

    public static void main(String[] args) {
        try {
			int num,i,n;
			System.out.println("Enter the nummber: ");
	        Scanner s1 = new Scanner(System.in);
	        n=s1.nextInt();
			for (num = 2; num <= n; num++) {
			    boolean status = true;

			    for (i = 2; i <num; i++) {
			        if (num % i == 0) {
			            status = false;
			            break;
			        }
			    }

			  
			    if (status) {
			        System.out.print(num + " ");
			    }
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

