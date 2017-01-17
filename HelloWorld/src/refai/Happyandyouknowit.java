package refai;
public class Happyandyouknowit {

	/*Happyandyouknowit.java
	 * This program prints out the lyrics to "if your happy and you know it".
	 * Jan/17/17
	 * Emira Refai
	 */

	public static void main(String[] args) {
		String[] verse = new String[10];
		verse[0] = "do a dance";
		verse[1] = "slap your knee";
		verse[2] = "poke someone";
		verse[3] = "do a flip";
		verse[4] = "do a clap your feet";
		verse[5] = "rub your tummy";
		verse[6] = "crack your knuckles";
		verse[7] = "bite your nails";
		verse[8] = "do the dab";
		verse[9] = "do the whip";
		verse[10] = "do the nay nay";


		for(int a=0; a<10;a++){

			for(int b=0; b<2; b++){
				System.out.println("if your happy know it" + verse[a]);
			}

			System.out.println("If your happy and you know and you really wanna show it ");
			System.out.println("if your happy know it" + verse[a]);
		}

	}

}
