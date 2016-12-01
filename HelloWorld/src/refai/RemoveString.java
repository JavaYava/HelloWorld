package refai;
import java.util.Scanner;


/*RemoveString.java
 * This program removes a part of the sentence the user types in.
 * Nov/30/16
 * Emira Refai
 */
public class RemoveString {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		int index ;

		int index2; 



		String sentence;

		String string2;

		System.out.println("Enter a sentence:");

		sentence = scan.nextLine();

		System.out.println("Enter a string");

		string2 = scan.nextLine();

		index =(sentence.indexOf(string2));

		index2 =(string2.length());


		System.out.println(sentence.substring (0,index) +sentence.substring(index2+index));











	}


}
