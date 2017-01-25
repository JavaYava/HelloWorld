package refai;
import hsa_new.Console;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/*Blackjack.java
 * This program runs a two player game of blackjack.
 * Jan/24/17
 * Emira Refai
 */
public class Blackjack{
	//GLOBAL VARIABLES
	static int[] card = new int [13];
	static Console c = new Console(); 
	static String restart;
	/**
	 * Main method.
	 */
	public static void main(String[] args) {

		c.setTextColor(Color.white);
		c.setTextBackgroundColor(Color.black);

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

		//Displays the title page.
		try {
			c.drawImage(ImageIO.read(new File("pics/TITLEPAGE1.jpg")), 0, 0, 600,500,null);
		} catch (IOException e) {
			c.println("Sorry there was an error press any key to start");
		}

		c.getChar();
		c.clear();
		
		//Displays  Instructions .
		try {
			c.drawImage(ImageIO.read(new File("pics/instructions.jpg")), 0, 0, 600,500, null);
		} catch (IOException e) {
			c.println("Sorry there was an error"); //TYPE INSTRUCTIONS FOR ERROR
		}
		c.println("Press any key to start");
		c.getChar();
		c.clear();



		//GETS CARD PICTURE BASED ON RANDOM NUMBER
		int card1=getRandomCard();
		int card2=getRandomCard();
		drawCard(card1,100,200); 
		drawCard(card2,100,300);

		int total=getCardTotal(card[card1],card[card2]); // GETS CARD VALUES 
		c.println(total);

		c.println("Would you like to hit or stay?");
		action=c.readLine();

		while(total<21 && action.equalsIgnoreCase("Hit")){ //HIT 

			int cardhit=getRandomCard();
			drawCard(card1,100,200);
			drawCard(card2,100,300);
			drawCard(cardhit,100,400);
			total=getCardTotal(total,card[cardhit]);
			c.println(total);

			c.println("Would you like to hit or stay");
			action=c.readLine();
			c.clear();
		}

		c.println(total); // When player one stops playing.

		if(total>21){
			
			c.clear();
			c.println("BUST PLAYER 2 WINS");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}


		}
		if(total==21){
			c.clear();
			c.println("BLACK JACK");
			c.println("PLAYER 1 WINS");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}



		}



		//Player 2 
		c.clear();
		String action2;
		c.println("Player 2 Press any key to start");
		c.getChar();
		c.clear();

		//gets card picture depending on the number and displays it.
		int card3=getRandomCard();
		int card4=getRandomCard();
		drawCard(card3,100,200); 
		drawCard(card4,100,300);
		
		
		
		//Gets card values.
		int total2=getCardTotal(card[card3],card[card4]);
		c.println(total2);

		c.println("Would you like to hit or stay?");
		action2=c.readLine();
		
		//Loops player 2 to either draw another card or stop.

		while(total2<21 && action2.equalsIgnoreCase("Hit")){ //HIT 
			c.clear();
			int cardhit=getRandomCard();
			drawCard(card3,100,200); 
			drawCard(card4,100,300);
			drawCard(cardhit,100,400);
			total2=getCardTotal(total2,card[cardhit]);
			c.println(total2);

			c.println("Would you like to hit or stay");

			action2=c.readLine();

			if(total>21){

				c.println("Bust!");
				c.println("Player 2 Wins!");
				c.println("Would you like to play again?");
				restart=c.readLine();

				if(restart.equalsIgnoreCase("yes")){
					c.getChar();
					restart();	
				}
				if(restart.equalsIgnoreCase("no")){
					c.close();	
				}

			}
			if(total==21){
				c.println("21 BLACK JACK");
				c.println("PLAYER 1 WINS!");
				c.println("Would you like to play again?");
				restart=c.readLine();

				if(restart.equalsIgnoreCase("yes")){
					c.getChar();
					restart();	
				}
				if(restart.equalsIgnoreCase("no")){
					c.close();	
				}

			}
		}

		c.println(total2); // WHEN PLAYER2 STOPS HITTING.
		{
			if (total2==21){
				c.clear();
				c.println("BLACK JACK");
				c.println("PLAYER 2 WINS");
				c.println("Would you like to play again?");
				restart=c.readLine();

				if(restart.equalsIgnoreCase("yes")){
					c.getChar();
					restart();	
				}
				if(restart.equalsIgnoreCase("no")){
					c.close();	
				}


			}


		}
		if (total>total2 && total<21){
			c.clear();
			c.println("PLAYER 1 WINS");
			c.println("Would you like to play again?");
			c.getChar();
			restart();
		}
		if(total<total2 && total2 <21){
			c.clear();
			c.println("PLAYER 2 WINS");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}


		}
		if(total==total2){
			c.clear();
			c.println("Tie");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}


		}


	}
	/**
	 * Gets player 2's value.
	 */
	public static int getCardTotal2(int card3, int card4){
		return card3+card4;

	}
	/**
	 * Restarts the program
	 */
	public static void restart(){

		c.setTextColor(Color.white);
		c.setTextBackgroundColor(Color.black);

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
			c.drawImage(ImageIO.read(new File("pics/TITLEPAGE1.jpg")), 0, 0, 600,500,null);
		} catch (IOException e) {
			c.println("WHOOPS");
		}


		c.getChar();

		c.clear();
		//2. Instructions 

		try {
			c.drawImage(ImageIO.read(new File("pics/instructions.jpg")), 0, 0, 600,500, null);
		} catch (IOException e) {
			c.println("Sorry there was an error"); //TYPE INSTRUCTIONS FOR ERROR
		}
		c.println("Press any key to start");
		c.getChar();
		c.clear();



		//GETS CARD PICTURE BASED ON RANDOM NUMBER
		int card1=getRandomCard();
		int card2=getRandomCard();
		drawCard(card1,100,200); 
		drawCard(card2,100,300);

		int total=getCardTotal(card[card1],card[card2]); // GETS CARD VALUES 
		c.println(total);

		c.println("Would you like to hit or stay?");
		action=c.readLine();

		while(total<21 && action.equalsIgnoreCase("Hit")){ //HIT 

			int cardhit=getRandomCard();
			drawCard(cardhit,100,200);
			total=getCardTotal(total,card[cardhit]);
			c.println(total);

			c.println("Would you like to hit or stay");
			action=c.readLine();
			c.clear();
		}

		c.println(total); // WHEN PLAYER 1 STOPS HITTING.

		if(total>21){
			c.clear();
			c.println("BUST PLAYER 2 WINS");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}


		}
		if(total==21){
			c.clear();
			c.println("BLACK JACK");
			c.println("PLAYER 1 WINS");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}



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
		drawCard(card3,100,200); 
		drawCard(card4,100,300);

		int total2=getCardTotal(card[card3],card[card4]); // GETS CARD VALUES 
		c.println(total2);

		c.println("Would you like to hit or stay?");
		action2=c.readLine();

		while(total2<21 && action2.equalsIgnoreCase("Hit")){ //HIT 
			c.clear();

			int cardhit=getRandomCard();
			drawCard(cardhit,100,200);
			total2=getCardTotal(total2,card[cardhit]);
			c.println(total2);

			c.println("Would you like to hit or stay");

			action2=c.readLine();

			if(total>21){

				c.println("Bust!");
				c.println("Player 2 Wins!");
				c.println("Would you like to play again?");
				restart=c.readLine();

				if(restart.equalsIgnoreCase("yes")){
					c.getChar();
					restart();	
				}
				if(restart.equalsIgnoreCase("no")){
					c.close();	
				}

			}
			if(total==21){
				c.println("21 BLACK JACK");
				c.println("PLAYER 1 WINS!");
				c.println("Would you like to play again?");
				restart=c.readLine();

				if(restart.equalsIgnoreCase("yes")){
					c.getChar();
					restart();	
				}
				if(restart.equalsIgnoreCase("no")){
					c.close();	
				}

			}
		}

		c.println(total2); // WHEN PLAYER2 STOPS HITTING.
		{
			if (total2==21){
				c.clear();
				c.println("BLACK JACK");
				c.println("PLAYER 2 WINS");
				c.println("Would you like to play again?");
				restart=c.readLine();

				if(restart.equalsIgnoreCase("yes")){
					c.getChar();
					restart();	
				}
				if(restart.equalsIgnoreCase("no")){
					c.close();	
				}


			}


		}
		if (total>total2 && total<21){
			c.clear();
			c.println("PLAYER 1 WINS");
			c.println("Would you like to play again?");
			c.getChar();
			restart();
		}
		if(total<total2 && total2 <21){
			c.clear();
			c.println("PLAYER 2 WINS");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}


		}
		if(total==total2){
			c.clear();
			c.println("Tie");
			c.println("Would you like to play again?");
			restart=c.readLine();

			if(restart.equalsIgnoreCase("yes")){
				c.getChar();
				restart();	
			}
			if(restart.equalsIgnoreCase("no")){
				c.close();	
			}


		}


	}


	/**
	 * Draws a random card for cards.
	 */
	public static int getCardTotal(int card1, int card2){ // DRAWS A RANDOM CARD FOR CARDS
		return card1+card2;

	}
	/**
	 * Gets a random card value and returns it to the main method.
	 */
	public static int getRandomCard(){
		return (int)(Math.random()*13);
	}
	/**
	 * Gets a picture for the card value.
	 * @param 
	 */

	//DRAW CARD METHOD
	public static void drawCard(int card, int x,int y){ 

		BufferedImage[] pics = new BufferedImage[13];
		//Imports pictures
		try {

			pics[0]=ImageIO.read(new File("pics/1 card.png"));
			pics[1]=ImageIO.read(new File("pics/2 card.png"));
			pics[2]=ImageIO.read(new File("pics/3 card.png"));
			pics[3]=ImageIO.read(new File("pics/4 card.jpg"));
			pics[4]=ImageIO.read(new File("pics/5 card.png"));
			pics[5]=ImageIO.read(new File("pics/6 card.png"));
			pics[6]=ImageIO.read(new File("pics/7 card.png"));
			pics[7]=ImageIO.read(new File("pics/8 card.png"));
			pics[8]=ImageIO.read(new File("pics/9 card.png"));
			pics[9]=ImageIO.read(new File("pics/10 card.jpg"));
			pics[10]=ImageIO.read(new File("pics/jack card.png"));
			pics[11]=ImageIO.read(new File("pics/queen card.jpg"));
			pics[12]=ImageIO.read(new File("pics/king card.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			c.println("Sorry There Was An Error");
			e.printStackTrace();
		}
		//CARD IMAGE
		c.drawImage(pics[card], x,y,150,150,c);
	}

}//class
