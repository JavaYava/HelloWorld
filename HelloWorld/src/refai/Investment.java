package refai;
import java.text.DecimalFormat;
import java.util.Scanner;


/*Investment.java
		 * takes an integer as input,then tests it to see if it is positive or negative, and also tests it to see if it is divisible by 7. 
		 * Nov/15/16
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


