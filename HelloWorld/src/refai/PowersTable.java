package refai;
import java.util.Scanner;
import java.text.DecimalFormat;

/*PowersTable.java
 * This program is a powers table.
 * Nov/22/16
 * Emira Refai
 */



public final class PowersTable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);


		System.out.println("x^1 x^2 x^3 x^4 x^5");

		for (int i=1; i<=6; i++) 
		{


			System.out.println((int)(Math.pow(i, 1))+ " " +((int)(Math.pow(i, 2))+" " + ((int)(Math.pow(i, 3))+ " " + ((int)(Math.pow(i, 4))+" "+ (int)(Math.pow(i, 5))))));


		}







	}
}