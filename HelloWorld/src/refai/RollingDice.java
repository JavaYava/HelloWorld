package refai;

import java.util.Scanner;

/*RemoveString.java
 * This program removes a part of the sentence the user types in.
 * Nov/30/16
 * Emira Refai
 */

	
		
public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
	
		//Write a program that simulates rolling two six sided dice 10000 times. 
		//Each time the dice are rolled add up the two numbers, 
		//use an array (size 12) to keep track of the number of times each sum comes up. 
		//After 10000 rolls, you should print out how many times each number came up, like this:

		//Total              Number of Times this Happened

		//2                     1

		//3                     3
		
		


		int dice1;  
		int dice2;
	

System.out.println("Total ");

System.out.println("Number of Times this Happened");


int[] x = new int [12];

	
	
dice1=(int)(Math.random()*11)+2;

dice2=(int)(Math.random()*11)+2;


System.out.print(dice1+dice2);

























	



	
	
	


}
}
