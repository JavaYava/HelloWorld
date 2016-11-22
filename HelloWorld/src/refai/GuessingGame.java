package refai;
import java.util.Scanner;


/*GuessingGame.java
		 * This program is a updated verison of the number guessing game played between the user and the computer but in this verison you cna guess as many times until you win.
		 * Nov/22/16
		 * Emira Refai
		 */


	
public final class GuessingGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		int a; int b;
		
		
		do{
		
			
		System.out.println("Enter a number between 1 and 20:");
	
	   	a=scan.nextInt();
		b= (int) (Math.random()*20)+1;
		
		
		
		
			
			
		
	   	
	   	
	   	
	   	System.out.println( a);
	   	
	   	if (a<b)
	   		
	   		System.out.println("Better luck next time.");
	   	
	   	
	   	
	   	
	  else if (a==b)
	   		
	   		System.out.println("You won!");
	 
	  else if (a>b)
		  
		  System.out.println("Better luck next time.");
	   
		
		}while (a<b || a>b);
	   	
		
	   	
	   	
	   	
	   	
	   		
	   				
	   	
	   	
	   			
	     	
	     	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	

}
