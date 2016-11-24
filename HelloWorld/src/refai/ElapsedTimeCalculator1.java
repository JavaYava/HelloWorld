package refai;
import java.util.Scanner;


/*ElapsedTimeCalculator.java
 * This program is a updated verison of the number guessing game played between the user and the computer but in this verison you cna guess as many times until you win.
 * Nov/22/16
 * Emira Refai
 */

public class ElapsedTimeCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int time;  int elapsedtime;


		final String amorpm;



		System.out.println("Enter the starting hour:");
		time=scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter am or pm:");
		amorpm=scan.nextLine();


		System.out.println("Enter the number of elapsed hours:");
		elapsedtime=scan.nextInt();




		if 	(time<12)	
		{

			time=time+elapsedtime-12;


			System.out.println("The time is:" + time + "am");


		}
		else if (time>12)
		{	 

			time=time+elapsedtime+12;


			System.out.println("The time is:" + time + "pm");

		}

		
		


	}

}
