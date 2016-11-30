package refai;
import java.util.Scanner;


/*Random1.java
 * This program is a dice game between the user and the computer, whoever rolls the higher dice number wins the game.
 * Nov/9/16
 * Emira Refai
 */
public class RemoveString {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		int index ;
		
		int index2; 
		
		int index3;
		
		int index4;
		
		String sentence;

		String string2;

		System.out.println("Enter a sentence:");
		
		sentence = scan.nextLine();
		
		System.out.println("Enter a string");
		
		string2 = scan.nextLine();
		
		index =(sentence.indexOf(string2));
		index2=(sentence.indexOf(sentence));
		
		
		
		index3=(sentence.length()); 
		index4 =(string2.length());
		
		
		System.out.println(sentence.substring (0,index) +sentence.substring(index3,index4));
 


		
		
		
		
		
 


	}

	
	}
