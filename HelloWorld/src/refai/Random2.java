package refai;
import java.util.Scanner;


	/*Random1.java
	 * This program is a dice game between the user and the computer, whoever rolls the higher dice number wins the game.
	 * Nov/9/16
	 * Emira Refai
	 */
public class Random2 {	
public static void main(String[] args) {
			// TODO Auto-generated method stub
	
	Scanner scan=new Scanner(System.in);
	
	int dice1;  
	int dice2;
	
	dice1=(int)(Math.random()+6)+1;
	
	dice2=(int)(Math.random()+6)+1;
	
	if (dice1>dice2)
		
		System.out.println("You Won");
	
	else if (dice1<dice2)
			
			System.out.println("You Lost");
	
	else if (dice1==dice2)
	
	System.out.println("It was a Tie");
	
	
			
			
	
	


	

	
	
	
}
}