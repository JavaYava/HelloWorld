package refai;
import java.util.Scanner;
/*MathFun.java
 * This program is a 4 system calculator.
 * Jan/13/17
 * Emira Refai
 */
public class Mathfun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in two numbers you would like to use");
		int anwser;
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("What would you like to do?");
		System.out.println("Type 1, Addition");
		System.out.println("Type 2, Subtraction");
		System.out.println("Type 3, Divison");
		System.out.println("Type 4, Multiply");
		anwser=scan.nextInt();
		if(anwser==1){

			printAddition(num1, num2); 
			//call method 1(Addition)
			printRestart();
		}
		else if(anwser==2){

			printSubtraction(num1,num2);
			//call method 2(Subtraction)
			printRestart();
		}
		else if(anwser==3){
			printDivison(num1,num2);
			//call method 3(Division)
			printRestart();
		}
		else if (anwser==4){
			printMultiply(num1,num2);
			//call method 4(Multiply)
			printRestart();

		}

	}
	/**
	 * Does Addition
	 */
	//(method 1)

	public static void printAddition(int num1,int num2){

		System.out.println(num1+num2);

	}
	/**
	 * Does Subtraction
	 */
	//(method 2)
	public static void printSubtraction(int num1, int num2){
		System.out.println(num1-num2);
	}
	/**
	 * Does Division
	 */
	//(method 3)
	public static void printDivison(int num1,int num2){
		System.out.println(num1/num2);
	}
	/**
	 * Does Multiplication
	 */
	//(method 4)
	public static void printMultiply(int num1, int num2){
		System.out.println(num1*num2);
	}
	/**
	 * Restarts the program
	 */
	public static void printRestart(){
		Scanner scan=new Scanner(System.in);

		System.out.println("Type '1' to restart");
		int restart=scan.nextInt();
		do{

			System.out.println("Type in two numbers you would like to use");
			int anwser;
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			System.out.println("What would you like to do?");
			System.out.println("Type 1, Addition");
			System.out.println("Type 2, Subtraction");
			System.out.println("Type 3, Divison");
			System.out.println("Type 4, Multiply");
			anwser=scan.nextInt();
			if(anwser==1){

				printAddition(num1, num2); 
				//call method 1(Addition)
			}
			else if(anwser==2){

				printSubtraction(num1,num2);
				//call method 2(Subtraction)
			}
			else if(anwser==3){
				printDivison(num1,num2);
				//call method 3(Division)
			}
			else if (anwser==4){
				printMultiply(num1,num2);
				//call method 4(Multiply)

			}

		}while (restart==1);

	}

}
