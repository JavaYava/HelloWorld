package refai;
import java.util.Scanner;

/*arithmeticExpressions.java
		 * This program displays how to type arithmetic expressions in Java.
		 * Sept/26/16
		 * Emira Refai
		 */
public class Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner scan=new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
		
System.out.format("Please type in 5 numbers");

num1=scan.nextInt();
num2=scan.nextInt();
num3=scan.nextInt();
num4=scan.nextInt();
num5=scan.nextInt();


System.out.println("The sum of all five numbers"+ (num1+num2+num3+num4+num5));
System.out.println("The result after subtracting the second number from the third"+ (num2-num3));
System.out.println("The product of the first and fifth numbers"+ (num1*num5));
System.out.println("The quotient of the fourth number divided by the second" +(num4/num2));
System.out.println("The remainder when dividing the fourth number by the second" +(num4%num2));
System.out.println("The first number raised to the power of the third number" + Math.pow(num1,num3));
System.out.println("The square root of the fifth number" + Math.sqrt(num5));










}
}
