package refai;
import hsa_new.Console;
import java.awt.Color;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Functions {

	public static void main(String[] args){



		Console c = new Console(40,90); 
		c.setTextColor(Color.white);
		c.setTextBackgroundColor(Color.black);
		
		//Displays title page
		try {
			c.drawImage(ImageIO.read(new File("pics/TITLEPAGE1.jpg")), 40, 90, 660,600,null);
		
		} catch (IOException e) {
			c.println("Sorry there was an error loading the picture type anything to continue"); // Displays text if there is an error.
		}

		c.getChar();
		c.clear();
		
		//Displays Equations description
		c.print("This program explains how the constant values can have a effect on Sinusodial Functions ");
		c.print("Press any key to continue");

		
		try {
			c.drawImage(ImageIO.read(new File("pics/THIS.jpg")), 40, 90, 650,600, null);
		
		} catch (IOException e) {
			c.println("Sorry there was an error"); //TYPE INSTRUCTIONS FOR ERROR
		}
		
		c.getChar();
		c.clear();
		
		try {
			c.drawImage(ImageIO.read(new File("pics/REFLECTION.jpg")), 40, 90, 650,600, null); //EDIT PICTURE PUT GRAPH IN IT
		} catch (IOException e) {
			c.println("Sorry there was an error"); //TYPE INSTRUCTIONS FOR ERROR
		}
		
		c.getChar();
		c.clear();
		
		// REFLECTION IN X - AXIS GRAPH
		
		try{
			c.drawImage(ImageIO.read(new File("pics/-A_GRAPH2.jpg")), 40, 90, 650,600, null);
		}catch(IOException e){
			c.println("ERROR");
		}
		c.getChar();
		c.clear();
		
		//
		
		try {
			c.drawImage(ImageIO.read(new File("pics/Vertical.jpg")), 40, 90, 650,600, null);
		}catch(IOException e){
			c.println("Sorry there was an error displaying this picture");
		}
		
		c.getChar();
		c.clear();
		
		//COMPRESSED AND STRETCHED GRAPH
		
		try {
			c.drawImage(ImageIO.read(new File("pics/COMPRESSEDA.jpg")), 40, 90, 650,600, null);
		}catch(IOException e){
			c.println("Sorry there was an error displaying this picture");
		}
		
		c.getChar();
		c.clear();
		
		try {
			c.drawImage(ImageIO.read(new File("pics/STRETCHEDA.jpg")), 40, 90, 650,600, null);
		}catch(IOException e){
			c.println("Sorry there was an error displaying this picture");
		}
		
		c.getChar();
		c.clear();
		
		//
		
		try{
			c.drawImage(ImageIO.read(new File("pics/REFLECTION_IN_Y_.jpg")), 40, 90, 650, 600, null);
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		//
		try{
			c.drawImage(ImageIO.read(new File("pics/-K Graph.jpg")), 40, 90, 650, 600, null);
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		//
	
		
		try{
			c.drawImage(ImageIO.read(new File("pics/K_EQAUTION.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();

		//
		try{
			c.drawImage(ImageIO.read(new File("pics/-2 KGraph.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		//
		try{
			c.drawImage(ImageIO.read(new File("pics/2_KGraph2.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		//
		try{
			c.drawImage(ImageIO.read(new File("pics/D_EQUATION.jpg")), 40, 90, 650, 600, null);
		}catch(IOException e){
			c.println("Sorry there was an error");
		}
		c.getChar();
		c.clear();
		//
		try{
			c.drawImage(ImageIO.read(new File("pics/D + GRAPH.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		
		try{
			c.drawImage(ImageIO.read(new File("pics/D - GRAPH.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		//
		try{
			c.drawImage(ImageIO.read(new File("pics/C_EQUATION.jpg")), 40, 90 , 650, 600, null); 
		}catch(IOException e){
			c.print("Sorry there was an error");

		}	
		c.getChar();
		c.clear();
		try{
			c.drawImage(ImageIO.read(new File("pics/C + GRAPH.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		try{
			c.drawImage(ImageIO.read(new File("pics/C - GRAPH.jpg")), 40, 90, 650, 600, null);
		
		}catch (IOException e){
			c.println("Sorry there was an error");
		}
		
		c.getChar();
		c.clear();
		}
	}


