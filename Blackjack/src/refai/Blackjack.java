package refai;
import hsa_new.Console;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class BlackJack {
	//GLOBAL VARIABLES
	static int[] Card = new int [13] ;
	static BufferedImage[] pics = new BufferedImage[14];


	static Console c = new Console(); 
	static int Card1=(Card[(int)Math.random()*12+0]);
	static int Card2=(Card[(int)Math.random()*12+0]);
	static int Total;

	static int[] Counter;
	public static void main(String[] args) {

		//CARD IMAGE
		//try {
		//	pics[0]=ImageIO.read(new File("pics/TITLE PAGE.png"));
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}




		//CARD VALUES!
		Card[0] = 1; 
		Card[1] = 2;
		Card[2] = 3;
		Card[3] = 4;
		Card[4] = 5;
		Card[5] = 6;
		Card[6] = 7;
		Card[7] = 8;
		Card[8] = 9;
		Card[9] = 10;
		Card[10] = 10;
		Card[11] = 10;
		Card[12] = 10;
		

		

		//pics[0]=ImageIO.read(new File("pics/king.jpg"));// (ADD PICTURES ON MONDAY)

		int direction; String Action;

		//1. DISPLAY TITLE PAGE

		//c.drawImage(pics[0], 100, 100, null);

		c.println("Welcome to Black Jack type 1 to begin.");
		direction=c.readInt();

		c.clear();

		//c.drawImage(pics[1], 100, 100, null);//2. Instructions 

		c.println("Type 1 to continue");

		c.clear();

		 getRandomCards(Card1,Card2); // GETS CARD VALUES 
		 

		Cards(); //GETS CARD PICTURE BASED ON RANDOM NUMBER
		
		c.println(Total);
		
		
			
			c.println("Would you like to hit or stay?");
			
			
			Action=c.readLine();

			if(Action.equalsIgnoreCase("Hit")){
				getRandomCard1();
					Cards();

					if(Card1+Card2>21){
						
						c.println(Card1+Card2);

						c.println("BUST");
						c.println("YOU LOSE");
						if(Card1+Card2<21){
							
							c.println(Card1+Card2);
							
							
						}


						if(Action.equalsIgnoreCase("Stay")){


						}

					}

				}


		// prints card method	



	}

	public static void getRandomCards(int Card1, int Card2){ // DRAWS A RANDOM CARD FOR CARDS
		

		Card1=(Card[(int)Math.random()*12]);
		Card2=(Card[(int)Math.random()*12]);
		
		 Total=Card1+Card2;
	}
	public static void getRandomCard2(){ //DRAWS A CARD FOR CARD2 SLOT 
		
	
		Card2=(Card[(int)Math.random()*12+0]);
	}

	public static void getRandomCard1(){
		
		Card1=(Card[(int)Math.random()*12+2]);
	}


	public static void Cards(){ //cards method


		if(Card1==1 || Card2==1){

			//c.drawImage(pics[2], 100,100,null);
			

		}

		if(Card1==2 || Card2==2){

			//c.drawImage(pics[2], 100,100,null);
		}
		if(Card1==3 || Card2==3){
			//c.drawImage(pics[2],100,100,null);
		}
		if(Card1==4 || Card2==4){
			
			//
		}
	}

}//class
