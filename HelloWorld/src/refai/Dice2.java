package refai;
import java.util.Scanner;


/*Dice2.java
 * dice rolling program to continue until the user wants the game to end.
 * Nov/22/16
 * Emira Refai
 */
public class Dice2 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);



		int dice1;  
		int dice2;
		int yes;




		do{ 



			dice1=(int)(Math.random()*11)+2;

			dice2=(int)(Math.random()*11)+2;

			if (dice1>dice2)


				System.out.println("You Won");


			else  if (dice1<dice2)


				System.out.println("You Lost");



			else if (dice1==dice2)

				System.out.println("It was a Tie");



			dice1=(int)(Math.random()*11)+2;

			dice2=(int)(Math.random()*11)+2;

			System.out.println("Type 1 to play again.");
			yes=scan.nextInt();

		}while (yes==1);

	}
}


