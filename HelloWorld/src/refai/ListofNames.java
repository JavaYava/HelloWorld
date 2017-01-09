package refai;

import java.util.Scanner;

/*RemoveString.java
 * This program removes a part of the sentence the user types in.
 * Nov/30/16
 * Emira Refai
 */
public class ListofNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that reads in a list of names from the keyboard, 
		//then output the list twice, first in the order that it was input, and then in reverse order.
		//The user should get to pick how many names will be in the list.



		//Ask how many they want
		//make array
		//loop

		Scanner scan = new Scanner(System.in);

		String[] name;





		System.out.println("How many names would you like to type in?");

		name=new String[scan.nextInt()];

		

for(int a= 0; a<name.length; a++){

			System.out.println("Type in your names");
			
			name[a]=scan.nextLine();

		
		}
		
		System.out.print(name);


		
		11
		
		

		
	
          
	

	
		
	
		
		
		
	}

}
