package refai;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Printing.java
		 * Prints the price for the amount of papers you want to print. 
		 * Oct/31/16
		 * Emira Refai
		 */
public class Printing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);		
		 DecimalFormat df = new DecimalFormat ("0.00");
		 
		 int number; 
	
		 System.out.println("Enter the number of copies to be printed: ");
  number=scan.nextInt();
  
   if(number >=99){
 
	   System.out.println("Price per copy is: $0.30");
   System.out.println("total cost is: " +df.format (number*0.30));
   }
	  else if (number >=499){
	  
		  System.out.println("Price per copy is: $0.28");
		  System.out.println("total cost is: " +df.format (number*0.28));
	  }
   
	  else if(number >=749){
	 
		  System.out.println("Price per copy is: $0.27");
		  System.out.println("total cost is:"+df.format (number*0.27));
	  }
	  else if(number >=1000){
	  
		  System.out.println("Price per copy is: $0.26");
		  System.out.println("total cost is:" +df.format (number*0.26));
	  }
	  else if(number >=1000){
	
     
   System.out.println("Total cost is:" +number);
   System.out.println("total cost is:" +df.format (number*0.25));
	  
	}
	
	
	}
}