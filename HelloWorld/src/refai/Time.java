package refai;
import java.util.Scanner;
	import java.text.DecimalFormat;

	/*Time.java
			 * This program displays the amount of time someone spends on a program. 
			 * Oct/11/16
			 * Emira Refai
			 */
	
	public class Time {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			 Scanner scan=new Scanner(System.in);
			 DecimalFormat df = new DecimalFormat ("0.00");

			 double design;
			 double coding;
			 double debugging;
			 double testing;
			 
	
			 System.out.println("Enter amount of time spent on design");
			 design=scan.nextDouble();
			 
			 System.out.println("Enter amount of time spent coding");
			 coding=scan.nextDouble();
			 
			 System.out.println("Enter amount of time spent debugging");
			 debugging=scan.nextDouble();
			 
			 System.out.println("Enter amount of time spent testing");
			 testing=scan.nextDouble();
			 
			 System.out.format("%10s%10s","Task","%Time\n");
			 
			
			 System.out.format("%15s","Designing:" + df.format (design/(design+coding+debugging+testing)*100));
			 
			 System.out.format("\n");
			 
			 System.out.format("Coding:" +  df.format (coding/(design+coding+debugging+testing)*100));
			
			 System.out.format("\n");
			 
			 System.out.format("Debugging:" +  df.format (debugging/(design+coding+debugging+testing)*100));
			
			 System.out.format("\n");
			 
			 System.out.format("Testing:" +  df.format (testing/(design+coding+debugging+testing)*100));
			 
			 
			 
			 
			 
			 
		
		
		}
	
	}
	
