package refai;

import java.util.Scanner;

/*ListofNames.java
 * This program prompts the user for names and displays them.
 * Jan/17/17
 * Emira Refai
 */
public class ListofNames {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] names;





		System.out.println("How many names would you like to type in?");

		names=new String[scan.nextInt()];



		for(int a= 0; a<names.length; a++){

			System.out.println("Type in your names");
			names[a]=scan.nextLine();
			
			for(int b=0; b<2; b++){
				System.out.println(names[a]);
			
			}



		}

	








		
	
          
	

	
		
	
		
		
		
	}

}
