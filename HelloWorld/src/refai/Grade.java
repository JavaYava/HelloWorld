
package refai;
import java.util.Scanner;
	import java.text.DecimalFormat;

	/*Grade.java
			 * This program displays what letter grade you get. 
			 * Nov/2/16
			 * Emira Refai
			 */
	
	public class Grade {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			 Scanner scan=new Scanner(System.in);
			 
			 int testscore;
			 char grade;
			 
			 System.out.println("Enter your testscore");
			 testscore=scan.nextInt();
			 
			 if (testscore >=90)
				 grade ='A';
		
			 else if (testscore>=80)
				 grade = 'B';
			 
			 else if (testscore>=70)
				 grade = 'C';
			 
			 else if (testscore>=60)
				 grade = 'D';
			 
			 else
				 grade = 'F';
			 
			 System.out.println("The corresponding letter grade is: " + grade);

			 
			 
			 
			 
		
		
		
		
		}
		
	}