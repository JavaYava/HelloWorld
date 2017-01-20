package refai;
import hsa_new.Console;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Blackjack2 {
	//GLOBAL VARIABLES
	static int[] Card = new int [13] ;
	static BufferedImage[] pics = new BufferedImage[14];


	static Console c = new Console(); 
	static int Card1;
	static int Card2;
	static int Total;
	static int ComputerTotal;
	static int Computer;
	static int Random1=((int)Math.random()*13);
	static int Random2=((int)Math.random()*13);

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


		Card1=Card[Random1];
		Card2=Card[Random2];

		//pics[0]=ImageIO.read(new File("pics/king.jpg"));// (ADD PICTURES ON MONDAY)

		int direction; String Action;

		//1. DISPLAY TITLE PAGE

		c.drawImage(pics[0], 100, 100, null);

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

		if(Action.equalsIgnoreCase("Hit")){ //HIT 1

			c.println(Total+Card1);

			c.println("Would you like to hit or stay");
			Action=c.readLine();

			if(Action.equalsIgnoreCase("Hit")){ //HIT2

				c.clear();

				getRandomCard2();
				Cards();

				c.println(Total+Card2);

				if(Total+Card2<21);

				c.clear();

				c.println("Would you like to hit or stay");
				Action=c.readLine();

				if(Action.equalsIgnoreCase("hit")){

					c.println(Total+Card1);
				}



			}
			getRandomCard1();
			Cards();

			c.println(Card1+Total);

			if(Card1+Card2<21){






				if(Card1+Card2<21){

					c.println(Card1+Card2);


				}
				else if (Card1+Card2<21){

					c.println(Card1+Card2);




				}


				if(Action.equalsIgnoreCase("Stay")){ //PLAYER STOPS DRAWING COMPUTERS TURN TO PLAY
					
					c.println(Total);
					
				
				
					if(Total< ComputerTotal){ //COMPUTER HAS HIGHER VAULE
						
						c.println("You Lose");
					
					}
					if(Total>ComputerTotal){
						c.print(ComputerTotal);
						c.println("YOU WON");
						
						
					}
					





				}

			}

		}


		// prints card method	




	}
	public static int ComputersTotal(int ComputerCard1,int ComputerCard2){
		
		ComputerTotal=Card1+Card2;
		return ComputerTotal;
		
	}

	public static void ComputersTurn(){
		c.println(Card1+Card2);
	
		
		
	}
	public static void Hit(){
		
		Total=Total+Card1;

	}
	public static int getRandomCards(int Card1, int Card2){ // DRAWS A RANDOM CARD FOR CARDS

		Total=Card1+Card2;

		return Total;
	}
	public static void getRandomCard2(){ //DRAWS A CARD FOR CARD2 SLOT 


		Card2=(Card[Random2]);
	}

	public static void getRandomCard1(){

		Card1=(Card[Random1]);
	}


	public static void Cards(){ //cards method


		if(Card1==1 || Card2==1){

			c.drawImage(pics[0], 50,50,null);


		}

		if(Card1==2 || Card2==2){

			c.drawImage(pics[1], 100,100,null);
		}
		if(Card1==3 || Card2==3){
			c.drawImage(pics[2],100,100,null);
		}
		if(Card1==4 || Card2==4){
			c.drawImage(pics[3],100,100,null);

			//
		}
		if(Card1==5 || Card2==5){
			c.drawImage(pics[4],100,100,null);
		}
		if(Card1==6 || Card2==6){
			c.drawImage(pics[5],100,100,null);
		}
		if(Card1==7 || Card2==7){
			c.drawImage(pics[6],100,100,null);
		}
		if(Card1==8 || Card2==8){
			c.drawImage(pics[7],100,100,null);
		}
	}

}//class