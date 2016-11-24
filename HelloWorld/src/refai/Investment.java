package refai;
import java.text.DecimalFormat;
import java.util.Scanner;


/*Investment.java
 * This program is supposed to display how many years it would take for an investment of $2500 to reach $5000.
 * Nov/22/16
 * Emira Refai
 */
public class Investment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);	
		DecimalFormat df = new DecimalFormat ("0.00");

		int investment= 2500;

		int year=1;


		while (investment<=5000){


			investment=investment*1075;
			year=year+1;


		}

		System.out.println("it will take you" +(int)year+ "years");




	}		 



}


