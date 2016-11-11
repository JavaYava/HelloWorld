
package refai;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Random1.java
 * This program is a random generator that implements the linear congruential method to display 10 random numbers.
 * Nov/11/16
 * Emira Refai
 */

public class RandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		
	
		
   final int a = 123446;
		final int c = 204320;
		final int m = 50425;
		final int Seed=1255342;
		
		
		 int X;
		
		 int x2;
		
		 int x3;
		
		 int x4;
		
		int x5;
		
		 int x6;
		
		 int x7;
		
		 int x8;
		
	 int x9;
		
		 int x10;
         
		 
		
		
		
		
		
		System.out.println(X=(a*Seed+c%m));
	        
	
		
		
	     System.out.println(x2=((a*X+c)%m));
		
		
		
		
	System.out.println(x3=((a*x2+c)%m));
        
		
		
		
		System.out.println(x4=((a*x3+c)%m));
        
	
		
		
		System.out.println (x5=((a*x4+c)%m));
        
	
		
		
	System.out.println(x6=((a*x5+c)%m));
        

		
		
		System.out.println(x7=((a*x6+c)%m));
        
	
		
		
	System.out.println(x8=((a*x7+c)%m));
        

		
		
	System.out.println(x9=((a*x8+c)%m));
        
	
		
		System.out.println(x10=((a*x9+c)%m));
		
	
		
       
        
        
		
		

		
		
		
	
		

		

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
