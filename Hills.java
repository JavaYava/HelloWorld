

import hsa_new.Console;      

public class Hills 
{

	public static void main(String[] args)
	{


		Console c = new Console(); 



		// *** variables
		String direction; // stores the user's answer when a direction is required
		String answer;    // stores the user's answer when a yes no question is asked

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
		if (direction.equalsIgnoreCase("Hills")){



			c.clear();

			c.println("The trail through the hills takes you up a steep path the deeper you venture into the hills the soft grass has long since turned into hard gravel as the  it crunches beneath your feet. It was a rather peaceful walk but"
					+ "you couldnt shake the cold feeling of being watched."); 

			answer=c.readLine();

			if (answer.equalsIgnoreCase("lemon")){


				c.println("correct he lets you pass");

				if(answer.equalsIgnoreCase("turtleneck")){
					c.println("Troll DIE/END");
				}




				if(answer.equalsIgnoreCase("Apple")){
					c.println("Troll DIE/END");
				}
				
				c.clear();


				c.println("Come across mountains and cave see sleeping dragon "
						+ "do you try to sneak attack or rush in and attack it ");

				c.println("1.Sneak Attack");
				c.println("2.Attack");

				direction = c.readLine();

				if (direction.equalsIgnoreCase("Sneak Attack")){
					c.clear();

					if(dice1<dice2)	
						c.println("DIE/END");


					if (dice1>dice2)
						c.println("You Win");

					if(dice1==dice2)
						c.println("You Win");
				}
				else if (direction.equalsIgnoreCase("Attack")){
					
					c.clear();



					c.println("You take your sword and with with a mighty heave you slash into the dragon."
							+ "howls in agnony and raises its claw to slash at you do you attack again or dodge?");
					c.println("1.Attack");
					c.println("2.Dodge");
				}


				direction = c.readLine();
				if(direction.equalsIgnoreCase("Dodge")){

					if (dice1<dice2)
						c.println("You seemed to have tripped on nothing, the dragons claw connects with your body DIE/END");

					if(dice1>dice2)
						c.println("You dive under his claw barely escaping do you attack or dodge again?");
					c.println("1.Attack");
					c.println("2.Dodge");
					direction= c.readLine(); 


					if(direction.equalsIgnoreCase("Attack")){
						if (dice1>dice2)
							c.println("You charge in and stab it again YOU WIN");


						if (dice1<dice2)
							c.println("You missed would like to attack again?");
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

					c.println("The dragon swipes at you mid swing and sends you flying into the air killing you instantly  DIE/END");

				}




			}
		}

		if(direction.equalsIgnoreCase("Forest")){

			c.clear();

			c.println("Deeper into the forest do you go left or right");

			direction = c.readLine();

			if(direction.equalsIgnoreCase("Right")){
				c.clear();
				c.println("Cave");
				c.println("Do you go in or out");
				direction = c.readLine();
				
				if (direction .equalsIgnoreCase("In")){
					
					c.clear();
					
					c.println("You see a bear sleeping do you attack or sneak around ?");
					c.println("1.Attack");
					c.println("2.Sneak Around It");
					
				if (direction.equalsIgnoreCase("Attack")){
					
					c.clear();
					
					c.println("You ");
					if (direction.equalsIgnoreCase("Sneak around it")){
						
						c.clear();
						
						if (dice1>dice2)
							c.println("Succefully get around it ");
						
						if (dice1<dice2);
						  c.println("you fail");
						  
						  if (dice1==dice2);
						  
						  c.println("You Win");
						  
					}
					
				}
				direction = c.readLine();

			}


			if(direction.equalsIgnoreCase("Left")){

				c.clear();
				c.println("You come across a river");
				c.println("Do you attempt to cross the river or go around to find another way across?");
				c.println("1.Cross");
				c.println("2.Go Around");
				direction = c.readLine();

				if(direction.equalsIgnoreCase("cross")){

					c.clear();
					c.println("You drown");

				}
				if(direction.equalsIgnoreCase("go around")){
					c.clear();
					c.println("You go around the river and find bridge and cross");
					c.println("Come across mountains and cave see sleeping dragon"
							+ " do you try to sneak attack or rush in and attack it ");

					direction = c.readLine();

					if(direction.equalsIgnoreCase("sneak attack")){

						if(dice1>dice2)
							c.clear();
						c.println("You win ");  




						if(dice1<dice2)
							c.clear();
						c.println("dragon kills you DIE/END");
					}

					if(direction.equalsIgnoreCase("Attack")){
				

							c.println("You take your sword and with with a mighty heave you slash into the dragon."
									+ "howls in agnony and raises its claw to slash at you do you attack again or dodge?");
							c.println("1.Attack");
							c.println("2.Dodge");
					}


					direction = c.readLine();
					if(direction.equalsIgnoreCase("Dodge")){

						if (dice1<dice2)
							c.println("You seemed to have tripped on nothing, the dragons claw connects with your body DIE/END");

						if(dice1>dice2)
							c.println("You dive under his claw barely escaping do you attack or dodge again?");
						c.println("1.Attack");
						c.println("2.Dodge");
						direction= c.readLine(); 


						if(direction.equalsIgnoreCase("Attack")){
							if (dice1>dice2)
								c.println("You charge in and stab it again YOU WIN");


							if (dice1<dice2)
								c.println("You missed would like to attack again?");
							direction= c.readLine();

							if(direction.equalsIgnoreCase("Attack"))

								if(dice1<dice2)	
									c.println("DIE/END");


							if (dice1>dice2)

								c.println("You Win");	

							if (dice1==dice2)
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





	}}







					 
						
					
					

			
