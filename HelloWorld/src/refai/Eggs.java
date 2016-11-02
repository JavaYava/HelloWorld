package refai;
import java.text.DecimalFormat;
import java.util.Scanner;

/*eggs.java
		 * The program displays how many dozens of eggs your buying and the total price.
		 * Nov/1/16
		 * Emira Refai
		 */
public class Eggs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);		
		 DecimalFormat df = new DecimalFormat ("0.00");
		 
		 int dozen;
		 int eggs; 
	
		 System.out.println("Enter the Amount dozen of eggs: ");
  System.out.println("Enter the amount of extra eggs");
		 dozen=scan.nextInt();
         eggs=scan.nextInt();
   
         if(dozen >=4){
 
	   System.out.println("4 price per dozen is: $0.50");
   System.out.println("total cost is: " +df.format (dozen*0.50+eggs*0.0416666667));
   }
	  else if (dozen >=6){
	  
		  System.out.println("6 price per dozen is: $0.45");
		  System.out.println("total cost is: " +df.format (dozen*0.45+eggs*0.0375));
	  }
   
	  else if(dozen >=11){
	 
		  System.out.println("11 price per dozen is: $0.40");
		  System.out.println("total cost is:"+df.format (dozen*0.40+eggs*0.03333333));
	  }
	  else if(dozen >=11){
	  
		  System.out.println("11 or more price per dozen is: $0.35");
		  System.out.println("total cost is:" +df.format (dozen*0.35+eggs*0.0291666667));
	
		
	  }
   

	
	}
}