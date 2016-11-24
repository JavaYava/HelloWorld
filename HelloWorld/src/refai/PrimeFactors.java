package refai;

import java.util.Scanner;


/*PrimeFactor
 * This program is a number guessing game played between the user and the computer.
 * Nov/11/16
 * Emira Refai
 */

public class PrimeFactors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		int userInput = scan.nextInt();
		int counter=2;

		while (userInput <=counter){

			if (userInput% counter == 0)
			{
				System.out.println(counter + (userInput/counter));
				userInput=scan.nextInt();

			}
			else 
			{
				System.out.println(counter = counter+1);

			}

		}
	}
}





















































