package refai;

import java.util.Scanner;

public class listofNames1 {

	/*Happyandyouknowit.java
	 * This program prints out the lyrics to "if your happy and you know it".
	 * Jan/17/17
	 * Emira Refai
	 */

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);



		System.out.println("How many names would you like to use?");

		int number = scan.nextInt();  // gets array number
		int[] namenum = new int[number]; // stores number of how many names
		String[] nameers= new String[number];
		String names;// gets names


		for(int a=0; a < number;a++)
		{
			System.out.println("Type in the names");

			String name1 =scan.nextLine();
			
			
			System.out.println(name1);
		}

				




	}

}



