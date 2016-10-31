package refai;
import java.util.Scanner;
import java.text.DecimalFormat;

/*statementExercise.java
		 * takes an integer as input,then tests it to see if it is positive or negative, and also tests it to see if it is divisible by 7. 
		 * Oct/31/16
		 * Emira Refai
		 */
public class StatementExercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);		
	
		 int number;
		
		System.out.println("Type in a number");
        
		number=scan.nextInt();
		
		if(number >0)
		{
			System.out.println("Your number is positive");
		}
			else
			{
			System.out.println("Your number is negative");
			}
			if(number %7==0)
		 
			{
		  System.out.println("Your number is divisble by 7");
			}
		  else
		  {
		    System.out.println("Your number is not divisble by 7");
		  }
		
		
		
		
		
        
        
        
        
        
	
	
	
	
	
	
	
	}
	
	
	
	
}
