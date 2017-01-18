package refai;

import java.util.Scanner;


/*Chaostheory.java
 * This program is a chaos theory that produces a new x 50 times.
 * Nov/24/16
 * Emira Refai
 */

public class Chaostheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);


		for (int x=1; x<=50; x++)
		{

			x=2*x*1 - x;

			System.out.println(x);
		}


	}

}
