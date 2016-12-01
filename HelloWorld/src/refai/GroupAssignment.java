package refai;
import java.util.Scanner;


/*Group Assignment.java
 * This program sorts the user into a group depending on what letter their last name starts with.
 * Dec/1/16
 * Emira Refai
 */
public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		String lastname; String name; 

		System.out.println("Enter your first name:");

		name=scan.nextLine();

		//name.equalsIgnoreCase(name);

		System.out.println("Enter your last name:");

		lastname=scan.nextLine();

		//lastname.equalsIgnoreCase(lastname);



		//A b c d e f g h I, J k l m n o p q r s T, u v w x y Z//



		if 
		(lastname.startsWith("A") || lastname.startsWith("B") || lastname.startsWith("C")
				|| lastname.startsWith("D")|| lastname.startsWith("E")|| lastname.startsWith("F")
				|| lastname.startsWith("G")|| lastname.startsWith("H")|| lastname.startsWith("I"))
		{		
			System.out.println(name+" "+lastname + " "+"is assigned to Group 1");
		}
		else if (lastname.startsWith("J")|| lastname.startsWith("K")|| lastname.startsWith("L")
				|| lastname.startsWith("M")|| lastname.startsWith("N")|| lastname.startsWith("O")
				|| lastname.startsWith("P")|| lastname.startsWith("Q")|| lastname.startsWith("R")
				|| lastname.startsWith("S")) 
		{			

			System.out.println(name+" "+lastname + " "+"is assigned to Group 2");
		}

		else if (lastname.startsWith("T")|| lastname.startsWith("U")|| lastname.startsWith("V")
				|| lastname.startsWith("W")|| lastname.startsWith("X")|| lastname.startsWith("Y")
				|| lastname.startsWith("Z"))
		{

			System.out.println(name+" "+lastname+ " "+"is assigned to Group 3");
		}

	}

}