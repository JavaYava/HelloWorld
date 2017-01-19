package refai;
import hsa_new.Console;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Blackjack {
	//GLOBAL VARIABLES
	static int[] Card = new int [12] ;
	static BufferedImage[] pics = new BufferedImage[14];
	


	static int Card1;
	static int Card2;

	int[] Counter;
	public static void main(String[] args) {
		
		//CARD IMAGE
					try {
						pics[0]=ImageIO.read(new File("pics/TITLE PAGE.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		
		
		
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
		 Console c = new Console(); 

		//pics[0]=ImageIO.read(new File("pics/king.jpg"));// (ADD PICTURES ON MONDAY)

		int direction;
		
		//1. DISPLAY TITLE PAGE

		c.drawImage(pics[0], 100, 100, null);
		
		c.println("Welcome to Black Jack type 1 to begin.");
		direction=c.readInt();

		c.clear();

		//2. Instructions pic

		c.println("Type 1 to continue");

		c.clear();
		
		getRandom();
		
		Cards();
		c.println(Card1+Card2);
				

		// prints card method	



	}
	public static void getRandom(){ // GETS RANDOM CARD ARRAY VAULE [1-12]
		
		//PLAYERS CARDS 
		
	
	
		  Card1=(Card[(int)Math.random()*12]);
		  Card2=(Card[(int)Math.random()*12]);
		  
		  
		
	
		

		
		
	}



	public static void Cards(){ //cards method
		
		
		
  
		


	}

}//class
















		
		
	
	
	
		
	
