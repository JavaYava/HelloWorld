package refai;
import hsa_new.Console;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class BlackJack{
	//GLOBAL VARIABLES
	static int[] card = new int [13];
	static Console c = new Console(); 
	static String restart;
	public static void main(String[] args) {
		c.setTextColor(Color.white);
		c.setTextBackgroundColor(Color.black);
		do{
			c.clear();

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

			String action;

			//1. DISPLAY TITLE PAGE
			try {
				c.drawImage(ImageIO.read(new File("pics/TITLEPAGE.jpg")), 0, 0, 600,500,null);
			} catch (IOException e) {
				c.println("WHOOPS");
			}


			c.getChar();

			c.clear();
			//2. Instructions 
			try {
				c.drawImage(ImageIO.read(new File("pics/INSTRUCTIONS.jpg")), 100, 100, 400,400, null);
			} catch (IOException e) {
				c.println(""); //TYPE INSTRUCTIONS FOR ERROR
			}
			c.println("Press any key to start");
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

			while(total<21 && action.equalsIgnoreCase("Hit")){ //HIT 

				int cardhit=getRandomCard();
				drawCard(cardhit,300,300);
				total=getCardTotal(total,card[cardhit]);
				c.println(total);

				c.println("Would you like to hit or stay");
				action=c.readLine();
			}

			c.println(total); // WHEN PLAYER 1 STOPS HITTING.

			if(total>21){
				c.clear();
				c.println("BUST PLAYER 2 WINS");
				c.println("Would you like to play again?");
				restart=c.readLine();
			}
			if(total==21){
				c.clear();
				c.println("BLACK JACK");
				c.println("PLAYER 1 WINS");
				c.println("Would you like to play again?");
				restart=c.readLine();
			}



			//ADD PLAYER 2 HERE
			c.clear();
			String action2;
			c.println("Player 2 Press any key to start");
			c.getChar();
			c.clear();

			//GETS CARD PICTURE BASED ON RANDOM NUMBER
			int card3=getRandomCard();
			int card4=getRandomCard();
			drawCard(card3,100,100); 
			drawCard(card4,200,200);

			int total2=getCardTotal(card[card3],card[card4]); // GETS CARD VALUES 
			c.println(total2);

			c.println("Would you like to hit or stay?");
			action2=c.readLine();

			while(total2<21 && action2.equalsIgnoreCase("Hit")){ //HIT 

				int cardhit=getRandomCard();
				drawCard(cardhit,300,300);
				total2=getCardTotal(total2,card[cardhit]);
				c.println(total2);

				c.println("Would you like to hit or stay");
				action2=c.readLine();
			}

			c.println(total2); // WHEN PLAYER2 STOPS HITTING.
			{
				if (total2==21){
					c.clear();
					c.println("BLACK JACK");
					c.println("PLAYER 2 WINS");
					c.println("Would you like to play again?");
					restart=c.readLine();
				}


			}
			if (total>total2 && total<21){
				c.clear();
				c.println("PLAYER 1 WINS");
				c.println("Would you like to play again?");
				restart=c.readLine();
			}
			if(total<total2 && total2 <21){
				c.clear();
				c.println("PLAYER 2 WINS");
				c.println("Would you like to play again?");
				restart=c.readLine();
			}
			if(total==total2){
				c.clear();
				c.println("Tie");
				c.println("Would you like to play again?");
				restart=c.readLine();
			}
		}while(restart.equalsIgnoreCase("yes"));
	}
	public static int getCardTotal2(int card3, int card4){
		return card3+card4;
	}

	public static void restart(){


	}



	public static int getCardTotal(int card1, int card2){ // DRAWS A RANDOM CARD FOR CARDS
		return card1+card2;
	}


	public static int getRandomCard(){
		return (int)(Math.random()*13);
	}


	public static void drawCard(int card, int x,int y){ //DRAW CARD METHOD

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
		if (card==9){
			c.drawImage(pics[8], x, y, null);
		}
		if (card==10){
			c.drawImage(pics[9], x, y, null);
		}
		if (card==11){
			c.drawImage(pics[10], x, y, null);
		}
		if (card==12){
			c.drawImage(pics[11], x, y, null);
			
		
		}
	
	}

}//class
