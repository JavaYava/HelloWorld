package refai;

import hsa_new.Console;      

public class Hills 
{

	public static void main(String[] args)
	{


		Console c = new Console(); 


		
		// *** variables
		String direction; // stores the user's answer when a direction is required
		int answer;    // stores the user's answer when a yes no question is asked

		int dice1 ; int dice2; 

		dice1=(int)(Math.random()*11)+2;
		dice2=(int)(Math.random()*11)+2; // Random
		// *** the game
		int restart;
		
		restart=1;





		c.println("You awaken under a pile of rubble in a cold sweat, your vision blurry, head pounding as the memories flow back to you of what happened last night"
				+"as you look around at the ashed remains of your village. With the smoke of the still burning houses and the sounds of screaming ringing in your ears as the scene won't stop replaying."
				+ " You choke back a sob as it was just last night you lost everything in a wave of fire. You lay your eyes on a sword plunged into the ground, you step forward and grab the hilt as you pull the sword out stare into the "
				+ "glistening sliver steel blade as you come to your decision venegence. "
				+ "You dust off your clothes and look off in the direction of the "
				+ "burnt path to the forest and start your adventure");

		c.println("Do you take the Forest or the Hills?");

		direction = c.readLine();
		if (direction.equalsIgnoreCase("Hills")) 
		{

			c.clear();

			c.println("You come across a large bridge overlooking a cliff you take a step to cross the bridge but a troll amerges from the shadows and"
					+ "blocks your path." + "Anwser my riddle correctly and youmay pass"); 


			answer =  c.readInt();

			if (answer == 44){
				c.println("correct he lets you pass");
				
				if(answer !=44) 
					c.println("Troll DIE/END");
				
				c.println("Come across mountains and cave see sleeping dragon do you try to sneak attack or rush in and attack it ");

				direction = c.readLine();

				if (direction.equalsIgnoreCase("Sneak Attack")){
					c.clear();

					if(dice1<dice2)	
						c.println("DIE/END");


					if (dice1>dice2)
						c.println("You Win");
				}
				else if (direction.equalsIgnoreCase("Attack")){
			         c.clear();
				
					if (dice1>dice2)
						
						c.println("You take your sword and with with a mighty heave you slash into the dragon."
								+ "howls in agnony and raises its claw to slash at you do you attack again or dodge?");
				}
				
					
					direction = c.readLine();
					if(direction.equalsIgnoreCase("Dodge")){
						
						if (dice1<dice2)
							c.println("You seemed to have tripped on nothing, the dragons claw connects with your body DIE/END");
					
					 if(dice1>dice2)
							c.println("You dive under his claw barely escaping do you attack or dodge again?");
					direction= c.readLine(); 
					
					
					if(direction.equalsIgnoreCase("Attack")){
						 if (dice1>dice2)
							 c.println("You charge in and stab it again YOU WIN");
							  
							 
							 if (dice1<dice2)
								 c.println("You missed would like to dodge or attack again?");
							 direction= c.readLine();
					
							 if(direction.equalsIgnoreCase("Attack"))
								 
									if(dice1<dice2)	
										c.println("DIE/END");


									if (dice1>dice2)
										c.println("You Win");	
					}
						
								if(direction.equalsIgnoreCase("Dodge")){
									c.println("The dragon breathes fire DIE/END");
									
								}
									
							 
							 
					 }
					 else if(direction.equalsIgnoreCase("Attack")){
						 
						 c.println("The dragon kills you DIE/END");
						 
					 }
					
							 
							 
						 
					}
					}
				}
			
		}


					 
						
					
					
