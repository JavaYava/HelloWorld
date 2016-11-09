
package refai;
import java.util.Scanner;


	/*Random1.java
	 * It takes your name and tells you if its your favorite name or not?
	 * Nov/9/16
	 * Emira Refai
	 */
public class Random1 {	
public static void main(String[] args) {
			// TODO Auto-generated method stub


	 Scanner scan=new Scanner(System.in);
	
			int x;
			

			

	System.out.print("What is your name?");
    String n=scan.nextLine();
 
  x= (int) (Math.random() *100+1);

  if 

(x<=29)
	
	System.out.println(n + "That is not your favourite name");
  

else if
	
	(x>=30)
	
	System.out.println(n + "That is your favourite name");









		}
}
