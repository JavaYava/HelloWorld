

import java.util.Scanner;

import hsa_new.Console;      

public class Hills 
{

	public static void main(String[] args)
	{
	
	
		Console c = new Console(); 
Console myConsole= Console(14."My console");

 c.setTextBackgroundColor(black color);
		
		Scanner scan=new Scanner(System.in);
		// *** variables
		String direction; // stores the user's answer when a direction is required
		int Answer;    // stores the user's answer when a yes no question is asked

		int dice1 ; int dice2; 

		dice1=(int)(Math.random()*11)+2;
		dice2=(int)(Math.random()*11)+2; // Random
		// *** the game
		

		
		
		c.println("You awaken under a pile of rubble in a cold sweat, your vision blurry, head pounding as the memories flow back to you of what happened last night"
				+"as you look around at the ashed remains of your village. With the smoke of the still burning houses and the sounds of screaming ringing in your ears as the scene won't stop replaying."
				+ " You choke back a sob as it was just last night you lost everything in a wave of fire. You lay your eyes on a sword plunged into the ground, you step forward and grab the hilt as you pull the sword out stare into the "
				+ "glistening sliver steel blade as you come to your decision venegence. ");
		
		c.println (" Do you take the Forest or the Hills?");
		
		
		c.clear();

		c.println("Do you take the Forest or the Hills?");

		direction = c.readLine();
		if (direction.equalsIgnoreCase("Hills")) 
		{
			
			c.clear();
			
			c.println("You come across a large bridge overlooking a cliff you take a step to cross but a Troll  "
					);

			Answer =  c.readInt();

			if (Answer == 44)
				c.println("correct he lets you pass");
		
		 if (Answer !=44)
			
			c.clear();
		
		c.println("TROLL DIE/END");
		{
	
			c.println("Come across mountains and cave see sleeping dragon do you try to sneak attack or rush in and attack it ");

			direction = c.readLine();
}
			if (direction.equalsIgnoreCase("Sneak Attack"))
			  
			c.clear();
				
		if(dice1<dice2)	
					
			c.println("DIE/END");
	
		{
			if (dice1>dice2)
	         

	
			c.println("You Win");

		}
		}}}
		
			
