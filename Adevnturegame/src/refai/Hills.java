package refai;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.Color;

import hsa_new.Console;      

public class Hills 
{
	public static void main(String[] args)
	{


		Console c = new Console(); 
		BufferedImage[] pic = new BufferedImage[7];
		try {
			pic[0]=ImageIO.read(new File("pics/village.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pic[1]=ImageIO.read(new File("pics/brigde.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pic[2]=ImageIO.read(new File("pics/caveinwoods.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pic[3]=ImageIO.read(new File("pics/forest.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		try {
			pic[4]=ImageIO.read(new File("pics/dragoncave.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pic[5]=ImageIO.read(new File("pics/cave.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pic[6]=ImageIO.read(new File("pics/river.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		// *** variables
		String direction; // stores the user's answer when a direction is required
		String answer;    // stores the user's answer when a yes no question is asked

		int dice1 ; int dice2;  int[] anArray; int restart;
		int counter;

		dice1=(int)(Math.random()*11)+2;
		dice2=(int)(Math.random()*11)+2; // Random
		// *** the game
		anArray = new int[2];
		anArray[0] = 100;
		anArray[1]=30;

		c.setTextColor(Color.white);
		c.setTextBackgroundColor(Color.black);
		c.clear();

		do{
			c.drawImage(pic[0], 0, 100, null);
			
			c.println("You awaken under a pile of rubble in a cold sweat, your vision blurry, head \npounding as the memories flow back to you of what happened last night"
					+"as you look around at the ashed remains of your village. With the smoke of the still burning houses and the sounds of screaming ringing in your ears as the scene won't stop replaying."
					+ " You choke back a sob as it was just last night you lost everything in a wave of fire. You lay your eyes on a sword plunged into the ground, you \nstep forward and grab the hilt as you pull the sword out stare into the "
					+ "glistening sliver steel blade as you come to your decision venegence. "
					+ "You dust off your \nclothes and look off in the direction of the "
					+ "burnt path to the forest and start \nyour adventure.");
			

			c.println("\nDo you take the Forest or the Hills?");
			direction=c.readLine();

			if(direction.equalsIgnoreCase("Hills")){
				
				
				
				
				c.println("The trail through the hills takes you up a steeper path the deeper you venture into the hills, the soft grass of forest has long since turned into hard gravel as it crunches beneath your feet. It was a rather peaceful walk but"
						+ "you couldnt shake the feeling of being watched. The path leads you to a wooden bridge that streatches up into the mountains, you attempt to take a step on the bridge a man appears before as you cant believe your eyes. You take a step"
						+ "back as the man strides over to on a stump by the bridge he dusts off his jacket and clears his throat as he begans to speak");
				c.println("Man: Stop you must pay a toll to cross this bridge, but judging from the looks \nof you, you're poor so let's play a game, if you anwser my riddle correctly I'll let you pass. But if you anwser incorrectly it'll cost you your life ");
				c.println("\n1.Yes");
				c.println("\n2.No");
				answer=c.readLine();
				if(answer.equalsIgnoreCase("No")){
					c.clear();
					c.println("It wasn't a yes or no question. The man pulls a dagger out of his pocket and \nstabs you right in the gut and leaves you on the ground to bleed out. ");
					c.println("You died");
				}else if (answer.equalsIgnoreCase("Yes")){
					c.clear();
					counter = 0;
					do{
						c.println("You can swallow me, but I can consume you too. What am I?");
						c.println("1.Wisdom");
						c.println("2.Pride");
						c.println("3.Pain");
						answer=c.readLine();

						if(answer.equalsIgnoreCase("Pain") || answer.equalsIgnoreCase("Wisdom")){
							c.clear();
							c.println("Wrong!");
							counter++;	
						}
					}while(counter<2 && !answer.equalsIgnoreCase("Pride"));


					if(answer.equalsIgnoreCase("Pride")){

						c.clear();
						
						c.drawImage(pic[1], 0, 100, null);
					
						
						c.println("Correct. The man sighs and lets you cross the bridge. You come across th mountains and see a cave you enter a cave inside you see a"
								+ " sleeping dragon."
								+ "do you try to sneak attack or rush in and attack it ");
						c.drawImage(pic[4], 0, 100, null);
						
						c.println("1.Sneak Attack");
						c.println("2.Attack");

						direction = c.readLine();

						if (direction.equalsIgnoreCase("Sneak Attack")){

							c.clear();

							dice1 = (int)(Math.random() *11+2);
							dice2= (int)(Math.random()*11+2);

							if(dice1<dice2)	{
								c.println("You sucessfully sneak up on the dragon, your heart pounding in your ears as your finally face to face with the monster that destoryed your village and everyone and everything you've ever cared about "
										+ "along with it. You raise your sword above your head and take a deep breathe and let the weight of the sword in your hands guide you to victory. You slash down and miss the dragon entirely despite it being less than a foot away."
										+ "A loud clang of steel hitting"
										+ "stone echos in the cave. The dragon awakens you peer into the eyes of the beast,  and stand frozen in fear. You accept your fate as the dragon snaps its jaws open and shallows you whole ");

							}else if (dice1>dice2){
								c.println("You sucessfully sneak up on the dragon, you heave the sword and kill it.");

							}else if(dice1==dice2){
								c.println("You Win");

							}
						}else if (direction.equalsIgnoreCase("Attack")){

							c.clear();

							c.println("You take your sword and with with a mighty heave you slash into the dragon."
									+ "It howls in agnony and raises its claw to slash at you do you attack again or dodge?");
							c.println("1.Attack");
							c.println("2.Dodge");
							direction = c.readLine();

							if(direction.equalsIgnoreCase("Dodge")){
								c.clear();
								
								dice1=(int)(Math.random()*11)+2;
								dice2=(int)(Math.random()*11)+2;
								
								if (dice1<dice2){
									c.println("You seemed to have tripped on nothing, the dragons claw connects with your body and rips you apart");
									c.println("You have died");
								}else if(dice1>dice2){
									c.println("You roll under his claw barely escaping getting hit by the claw would"
											+ "of surely killed you, the winds up to attack again");
									c.println("What do you do?");
									c.println("1.Attack");
									c.println("2.Dodge");
									direction= c.readLine();

									if(direction.equalsIgnoreCase("Dodge")){
										c.println("The dragon expected you would try to roll out of the way again and breathes fire instead"
												+ "burning you to a crisp.");
										c.println("You died.");
									}else if(direction.equalsIgnoreCase("Attack")){
										dice1=(int)(Math.random()*11)+2;
										dice2=(int)(Math.random()*11)+2;
										if (dice1>dice2){

											c.clear();

											c.println("You charge in and pierce it through the heart,"
													+ " the dragon lets out one last howl in agnoy as it"
													+ "falls limp to the ground.");

											c.println("You have successfully slayed the beast, and avenged your village. You dust your pants"
													+ "and search around the cave and see a chest");

											c.println("Would you like to open the chest?");
											c.println("1.Yes");
											c.println("2.No");
											direction = c.readLine();

											if(direction.equalsIgnoreCase("Yes")){
												c.println("You give into curiousity and peak inside the chest inside you "
														+ "find "+ anArray[0] +" "+ "gold pieces and" + anArray[1] + " "+"silver pieces");
											}
											if(direction.equalsIgnoreCase("No")){
								
													c.println("You choose to not look in the chest and instead you cut out the dragons heart as a more greater prize for your bravely and walk out of the dragons lair victorious. ");
													c.println("You Win");
												
											}

										}else if (dice1<dice2){
											c.println("You missed the dragon and fell on your own sword. The steel cuts through you like paper"
													+ "and you killed yourself.");
											c.println("You died.");	
										}
									}
								}
							}else if(direction.equalsIgnoreCase("Attack")){
								c.println("The dragon swipes at you mid swing and sends you flying into the air killing you instantly");
								c.println("You died.");
							}

						}
					}
				}
			}else if(direction.equalsIgnoreCase("Forest")){
				c.clear();
				c.drawImage(pic[3], 0, 0, null);

				c.println("You venture deeper into the forest you hum to the sound of the birds as you walk along the peaceful trail ");
				c.println("You come to a fork in the trail do you go left or right?");
				c.println("1.Right");
				c.println("2.Left");

				direction = c.readLine();

				if(direction.equalsIgnoreCase("Left")){
					c.clear();
					c.drawImage(pic[6], 0, 0, null);

					c.println("The path leads you to a rushing a river, the trail continues on the other side ");
					c.println("Do you attempt to cross the river on foot or try and find another way across?");
					c.println("1.Cross");
					c.println("2.Go Around");
					direction = c.readLine();

					if(direction.equalsIgnoreCase("cross")){

						c.clear();
						c.println("The river was alot deeper then you thought it would be, you become sumbmerged "
								+ "under the water. You straggle as you try to swim back to the top but the current /nof the river is too strong as it bangs you against rocks.");

						c.println("You died");

					}
					if(direction.equalsIgnoreCase("go around")){
						c.clear();
						c.println("You go around the river and try to look for a way to cross. Leading you further and further away from your original path as you get lost in the forest, never to be heard from again.");
						c.println("You died.");
					}

				}



				}
			
				if(direction.equalsIgnoreCase("Right")){
					c.clear();
					c.drawImage(pic[2], 0, 100, null);
					c.println("The path on the right leads you to a cave.");
					c.println("Do you risk adventuring inside?");
					c.println("1.In");
					c.println("2.Stay out");

					direction = c.readLine();
					

					if(direction.equalsIgnoreCase("Stay Out")){
						c.drawImage(pic[3], 0, 100, null);
						c.println("You decide to not go into the cave and continue walking. You get tired and \ndecide to take seat by a tree to rest, you close your eyes and drift off too sleep. \nYou awaken an hour later face to face"
								+ "with a bear, the last moments of your life \nwere spent screaming in shock, as the bear bites into you throat.");
						c.println("You died");
					}
					if (direction .equalsIgnoreCase("In")){
						c.clear();
					
						c.drawImage(pic[5], 0, 100, null);


						c.println("You muster your courage and walk into the cave, you try to avoid making any noise by side shuffling around to not"
								+ " step on any of the animal bones that are littered around the floor,  as you reach towards the end of the cave you see it"
								+ " a \nsleeping bear blocking you from the exit.");
						c.println("What do you do?");
						c.println("1.Attack");
						c.println("2.Sneak Around It");

						direction=c.readLine();

						if (direction.equalsIgnoreCase("Attack")){


							c.clear();

							c.println("You charge in at the bear and pierce it right in the shoulder it roars in pain, you try to pull your sword out planning to finish it in one final blow. The sword doesn't come loose the beasr notices"
									+ "your struggle and snaps its powerful jaws around your neck and kills you.");
							c.println("You died.");

						}
						if (direction.equalsIgnoreCase("Sneak around it")){
							c.clear();
							dice1 = (int)(Math.random() *11+2);
							dice2= (int)(Math.random()*11+2);



							if (dice1<dice2){
								c.clear();
								c.println("You trip over your own two feet and fall onto the bear, it jolts awake and tears you to shreds."); 
								c.println("You died.");
							}





							else if (dice1==dice2 || dice1>dice2){
								c.clear();
								c.drawImage(pic[3], 0, 0, null);

								c.println("You sucessfully managed to sneak around the bear without waking it, "
										+ "you go up the stone stairs and continue your journey.");
								c.clear();
								c.drawImage(pic[6], 0, 0, null);

								c.println("The path leads you to a rushing a river, the trail continues on the other side ");
								c.println("Do you attempt to cross the river on foot or try and find another way across?");
								c.println("1.Cross");
								c.println("2.Go Around");
								direction = c.readLine();

								if(direction.equalsIgnoreCase("cross")){

									
									
									counter = 0;
									do{
										
										c.println("The river was alot deeper then you thought it would, you become sumbmerged "
												+ "under the water. ");
									
										
										c.println("Do you try to escape?");
										c.println("1.Escape");
										
										answer=c.readLine();

										if(answer.equalsIgnoreCase("escape")){
											c.clear();
											c.println("You try to stand up but fall back down.");
											counter++;	
										}
									}while(counter<2);


										
									c.println("The current of the river is too strong and you've lost the strenght to swim back to the top.");
									c.println("You died");

								}
								if(direction.equalsIgnoreCase("go around")){
									c.clear();
									c.println("You go around the river and try to look for a way to cross. Leading you further and further away from your original path as you get lost in the forest, never to be heard from again.");
									c.println("You died.");
								}

							}













						}
					}








				}
				c.println("\n");
		
			c.println("Type 1 to play again");
			restart=c.readInt();
			c.clear();
			}while(restart==1);

			
		}

	}
