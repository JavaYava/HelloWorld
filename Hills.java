

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

			c.println("The trail through the hills takes you up a steep path the deeper you venture into the hills the soft grass has long since turned into hard gravel as it crunches beneath your feet. It was a rather peaceful walk but"
					+ "you couldnt shake the feeling of being watched. The path leads you to a wooden bridge that streatches up into the mountains, you attempt to take a step on the bridge a man appears before as you cant believe your eyes. You take a step"
					+ "back as the man strides over to on a stump by the bridge he dusts off his jacket and clears his throat as he begans to speak");

			c.println("Man: Stop you must pay a toll to cross this bridge, but judging from the looks of you, your poor so lets play game, if you anwser my riddle correctly ill let you pass. But if you anwser incorrectly it'll cost you your life ");
			c.println("1.Yes");
			c.println("2.No");


			answer=c.readLine();

			if(answer.equalsIgnoreCase("No")){

				c.clear();
				c.println("It wasn't a yes or no question. The man pulls a dagger out of his pocket and stabs you right in the gut and leaves you on the ground to bleed out. ");

			}


			if (answer.equalsIgnoreCase("Yes")){
				c.clear();
				c.println("You can swallow me, but I can consume you too. What am I?");
				c.println("1.Wisdom");
				c.println("2.Pride");
				c.println("3.Pain");
				answer=c.readLine();


				if(answer.equalsIgnoreCase("Wisdom")){
					c.println("Wrong. You don't have time to react as a flash of sliver and blood collide as you fall to the floor, for the man has already slit your throat.");

					if(answer.equalsIgnoreCase("Pain")){
						c.println("Correct. The man moves out of the way and allows you access to the bridge. You take a step on the bridge but fall to your knees as a sharp pain irradiates from your back, you hear the man chuckle behind you as"
								+ "as the light fades from your eyes");

						c.println("You have died");




					}
				}


				c.clear();
				//  bridge no man

				c.println("Correct. The man sighs and fades from Come across mountains and cave see sleeping dragon "
						+ "do you try to sneak attack or rush in and attack it ");

				c.println("1.Sneak Attack");
				c.println("2.Attack");

				direction = c.readLine();

				if (direction.equalsIgnoreCase("Sneak Attack")){
					c.clear();

					if(dice1<dice2)	
						c.println("You sucessfully sneak up on the dragon, your heart pounding in your ears as your finally face to face with the monster that destoryed your village and everyone and everything you've ever cared about "
								+ "along with it. You raise your sword above your head and take a deep breathe and let the weight of the sword in your hands guide you to victory. You slash down and miss the dragon entirely despite it being less than a foot away."
								+ "A loud clang of steel hitting"
								+ "stone echos in the cave. The dragon awakens you peer into the eyes of the beast,  and stand frozen in fear. You accept your fate as the dragon snaps its jaws open and shallows you whole ");
					
					c.println("You have died");
					

					
//FINISH DRAGON SCENE

					if (dice1>dice2)
						c.println("You sucessfully sneak up on the dragon, you heave the sword  ");

					

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

					c.clear();

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
						c.println("Type 1 to play again");
			

					}



				}
				else if(direction.equalsIgnoreCase("Attack")){

					c.println("The dragon swipes at you mid swing and sends you flying into the air killing you instantly  DIE/END");
				
					

				}




			}
		}

		if(direction.equalsIgnoreCase("Forest")){

			c.clear();

			c.println("You venture deeper into the forest you hum to the sound of the birds as you walk along the peaceful trail ");
			c.println("You come to a fork in the trail do you go left or right?");
			c.println("1.Right");
			c.println("2.Left");

			direction = c.readLine();

			if(direction.equalsIgnoreCase("Right")){
				c.clear();
				c.println("The path on the right leads you to a cave.");
				c.println("Do you risk adventuring inside?");
				c.println("1.In");
				c.println("2.Stay out");

				direction = c.readLine();

				if (direction .equalsIgnoreCase("In")){

					c.clear();

					c.println("You muster your courage and walk into the cave, you try to avoid making any noise by side shuffling around to not"
							+ " step on any of the animal bones that are littered around the floor you get into the rythm of stepping around the bones, as you reach towards the end of the cave you see it"
							+ " a sleeping bear blocking you from the exit.    ");
					c.println("What do you do?");
					c.println("1.Attack");
					c.println("2.Sneak Around It");

					if (direction.equalsIgnoreCase("Attack")){

						c.clear();

						c.println("You charge in at the bear and pierce it right in the shoulder it roars in pain, you try to pull your sword out planning to finish it in one final blow. The sword doesn't come loose the beasr notices"
								+ "your struggle and snaps its powerful jaws around your neck and kills you.");
						if (direction.equalsIgnoreCase("Sneak around it")){

							c.clear();

							if (dice1>dice2)
								c.println("You sucessfully managed to sneak around the bear without waking it, you go up the stone stairs and continue your journey.  ");

							if (dice1<dice2);
							c.println("You trip over your own two feet and fall onto the bear, it jolts awake and tears your face off."); //fix death scene
							
							

							if (dice1==dice2);

							c.println("You sucessfully managed to sneak around the bear without waking it, you go up the stone stairs and continue your journey.  ");


						
							if (direction .equalsIgnoreCase("Stay out")){

							
						
							}
						}

					}
					direction = c.readLine();

				}


				if(direction.equalsIgnoreCase("Left")){

					c.clear();
					c.println("The path on the left leads you to a rushing a river, the trail continues on the other side ");
					c.println("Do you attempt to cross the river on foot or try and find another way across?");
					c.println("1.Cross");
					c.println("2.Go Around");
					direction = c.readLine();

					if(direction.equalsIgnoreCase("cross")){

						c.clear();
						c.println("The first few step");

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
							c.println("Type 1 to play again");
						




							if(dice1<dice2)
								c.clear();
							c.println("dragon kills you DIE/END");
							c.println("Type 1 to play again");
							
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
								c.println("Type 1 to play again");
								


								if (dice1<dice2)
									c.println("You missed would like to attack again?");
								direction= c.readLine();

								if(direction.equalsIgnoreCase("Attack"))

									if(dice1<dice2)	
										c.println("DIE/END");
								c.println("Type 1 to play again");
								


								if (dice1>dice2)

									c.println("You Win");
								c.println("Type 1 to play again");
							

								if (dice1==dice2)
									c.println("You Win");
								c.println("Type 1 to play again");
							
							}

							if(direction.equalsIgnoreCase("Dodge")){
								c.println("The dragon breathes fire DIE/END");
					
								

							}



						}
						else if(direction.equalsIgnoreCase("Attack")){

							c.println("The dragon kills you DIE/END");
							c.println("Type 1 to play again");
					

						}


					}

				}


			}
		}
















	}


}







					 
						
					
					

			
