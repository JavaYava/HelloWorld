package refai;
import java.util.Scanner;


/*GuessingGame2.java
 *
 * Dec/6/16
 * Emira Refai
 */

//Write a program that plays a guessing game with the user.
//It should have an array with at least 20 different items, and then should start randomly guess from the list
//(make sure it's random) until it gets it right.

public final class GuessingGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);


		int A;


		String[] Objects= {"Sam","Car","Turtle","Lemon","Cheese","Lime","Ladybug","Tulip","Rose","Snail","Icecream"
				,"Keyboard", "Lipstick","Maple Leaf","Neck","Garry","Pancake","Clock","Vault","Rock","Cake","Jake"};



	System.out.println("Guess the object by typing in a number from 1-20");

			A=scan.nextInt();

		do{

			
			System.out.println(Objects[(int) (Math.random()*20)+1]);


			if ( A != Objects)

				System.out.println("Guess the object by typing in a number from 1-20");
		
			A=scan.nextInt();

			System.out.println(Objects[(int) (Math.random()*20)+1]);

			System.out.println("Wrong, Try again");


			

			 if (A == Objects)

			System.out.println("You Win");
		
			{
				



		}while (A != Objects[(int)])

			
			
		}
	
