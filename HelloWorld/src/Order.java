import java.util.Scanner;
import java.text.DecimalFormat;
/*className.java
		 * Order
		 * Oct/26/16
		 * Emira Refai
		 */
public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner scan=new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat ("0.00");
		 
		 double burger;
		  double fries; 
		  double soda;
		  double tax;
		  double amount;
		
		
		 tax=0.065;

		 
		 
		 System.out.println("Enter the number of burgers:"); 
		burger=scan.nextDouble();
		
		
		System.out.println("Enter the number of fries:");
		fries=scan.nextDouble();
		
		System.out.println("Enter the number of sodas:");
		soda=scan.nextDouble();
		
		
		System.out.format("Total before tax:" +(burger*1.69+soda*0.99+fries*1.09));

		System.out.format("\n");
		System.out.format("\n");
		
		System.out.format("Tax: $0.065");

		System.out.format("\n");	
		System.out.format("\n");
		
		System.out.format("Final total:" +((burger*1.69+soda*0.99+fries*1.09)+tax));
		
		System.out.format("\n");
		System.out.format("\n");
		
		System.out.println("Enter the amount tendered:");
		amount=scan.nextDouble();
		System.out.format("\n");
		
		System.out.println("Change:" + (amount-burger*1.69-soda*0.99-fries*1.09-tax));



		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
				
	
		
	}
	
}