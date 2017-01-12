package refai;

//Write a program to spell out MISSISSIPPI using block letters like the following:

//HINT: Use one method for each letter.


//Mississippi

public class Mississippi {

	public static void main(String[] args){
		printM();
		printSpace();
		printI();
		printSpace();
		printS();
		printSpace();
		printS();
		printSpace();
		printI();
		printSpace();
		printS();
		printSpace();
		printS();
		printSpace();
		printI();
		printSpace();
		printP();
		printSpace();
		printP();
		printSpace();
		printI();
	}
	/**
	 * Draws a M 
	 */
	public static void  printM(){
		System.out.println("M     M");
		System.out.println("MM   MM" );
		System.out.println("M M M M");
		System.out.println("M  M  M");
		System.out.println("M     M");
		System.out.println("M     M");
	}
	/**
	 * Draws a I
	 */
	public static void printI(){
		System.out.println("IIIII");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("IIIII");
	}
	/**
	 * Draws a S
	 */
	public static void printS(){
		System.out.println(" SSSSS");
		System.out.println("S     S");
		System.out.println("S");
		System.out.println(" SSSSS");
		System.out.println("      S");
		System.out.println("S     S");
		System.out.println(" SSSSS");
	}
	/**
	 * Draws a P
	 */
	public static void printP(){
		System.out.println("PPPPP ");
		System.out.println("P    P");
		System.out.println("P    P");
		System.out.println("PPPPP");
		System.out.println("P");
		System.out.println("P");
		System.out.println("P");

	}
	/**
	 * Draws a space
	 */
	public static void printSpace(){
		System.out.println();
	}

}

