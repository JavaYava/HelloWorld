package refai;
import hsa_new.Console;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Blackjack2 {
	//GLOBAL VARIABLES
	static int[] card = new int [13] ;
	static Console c = new Console(1000,1000); 

	public static void main(String[] args) {


		//CARD VALUES!
		card[0] = 1; 
		card[1] = 2;
		card[2] = 3;
		card[3] = 4;
		card[4] = 5;
		card[5] = 6;
		card[6] = 7;
		card[7] = 8;
		card[8] = 9;
		card[9] = 10;
		card[10] = 10;
		card[11] = 10;
		card[12] = 10;

		int direction; String action;

		//1. DISPLAY TITLE PAGE
		try {
			c.drawImage(ImageIO.read(new File("pics/TITLE PAGE.jpg")), 100, 100,400,400, null);
		} catch (IOException e) {
			c.println("WHOOPS");
		}

		c.println("Welcome to Black Jack type 1 to begin.");
		direction=c.readInt();

		c.clear();
		//2. Instructions 
		try {
			c.drawImage(ImageIO.read(new File("pics/INSTRUCTIONS.jpg")), 100, 100, 400,400, null);
		} catch (IOException e) {
			c.println(""); //TYPE INSTRUCTIONS FOR ERROR
		}
		c.println("Type 1 to continue");
		c.getChar();
		c.clear();

		//GETS CARD PICTURE BASED ON RANDOM NUMBER
		int card1=getRandomCard();
		int card2=getRandomCard();
		drawCard(card1,100,100); 
		drawCard(card2,200,200);

		int total=getCardTotal(card[card1],card[card2]); // GETS CARD VALUES 
		c.println(total);

		c.println("Would you like to hit or stay?");
		action=c.readLine();

		while(action.equalsIgnoreCase("Hit")){ //HIT 

			int cardhit=getRandomCard();
			drawCard(cardhit,300,300);
			total=getCardTotal(total,card[cardhit]);
			c.println(total);

			c.println("Would you like to hit or stay");
			action=c.readLine();
		}

		c.println(total);

		//
		//			if(total< ComputerTotal){ //COMPUTER HAS HIGHER VAULE
		//
		//				c.println("You Lose");
		//
		//			}
		//			if(total>ComputerTotal){
		//				c.print(ComputerTotal);
		//				c.println("YOU WON");
		//
		//
		//			}
	}



	public static int getCardTotal(int card1, int card2){ // DRAWS A RANDOM CARD FOR CARDS
		return card1+card2;
	}


	public static int getRandomCard(){
		return (int)(Math.random()*13);
	}


	public static void drawCard(int card, int x,int y){ //cards method

		BufferedImage[] pics = new BufferedImage[14];
		//CARD IMAGE
		

		if(card==1 ){
			c.drawImage(pics[0], x,y,null);
		}
		if(card==2 ){
			c.drawImage(pics[1], x,y,null);
		}
		if(card==3){
			c.drawImage(pics[2],x,y,null);
		}
		if(card==4 ){
			c.drawImage(pics[3],x,y,null);
		}
		if(card==5 ){
			c.drawImage(pics[4],x,y,null);
		}
		if(card==6){
			c.drawImage(pics[5],x,y,null);
		}
		if(card==7 ){
			c.drawImage(pics[6],x,y,null);
		}
		if(card==8 ){
			c.drawImage(pics[7],x,y,null);
		}
	}

}//class