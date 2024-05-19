import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {
		System.out.println("Welcome To My Pizza Shop!!!!");
		System.out.println("Here are the Types of Pizzas,Select Your Choices: ");
		int choice;
		float total=0,p=1;
		do {
		System.out.println("1:THE 4 CHEESE PIZZA  2:PEPPY PANEER  3:MEXICAN GREEN WAVE  4:DELUX VEGGIE  5:CHEESE N CORN 0:Exit" );
		Scanner s1 = new Scanner(System.in);
		choice=s1.nextInt();
	
		
		switch (choice) {
		case 1:
			System.out.println("You have Choosen THE 4 CHEESE PIZZA ... ");
			total+=p*400;
			break;
		case 2:
			System.out.println("You have Choosen PEPPY PANEER ... ");
			total+=p*459;
			break;
		case 3:
			System.out.println("You have Choosen MEXICAN GREEN WAVE ... ");
			total+=p*459;
			break;
		case 4:
			System.out.println("You have Choosen DELUX VEGGIE ... ");
			total+=p*400;
			break;
		case 5:
			System.out.println("You have Choosen CHEESE N CORN ... ");
			total+=p*379;
			break;

		default:
			break;
		}
		}while(choice!=0);
		System.out.println("Your billing amount is "+total);
		System.out.println("Thank You For Visiting the shop!! Enjoy Shopping!!Eat Pizza & NJoy Life..");
		System.out.println("Have a Nice Day!! Visit Again..");
	}
}


