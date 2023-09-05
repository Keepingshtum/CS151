/* Alyssa Richie
 * 9/4/2023
 * Hw 0
 */
public class AlyssaRichie {

	public static void main(String[] args) {
		//Creates & prints out the binary number to console
		int[] binary = {1,0,1,1,0};
		System.out.print("The binary number: ");
		for(int index=0; index < binary.length; index++)
			System.out.print(binary[index]);
		
		//The running total and "value" of the binary position 1, 2, 4, etc
		int total = 0;
		int placeMultiplier = 1;
		
		//Grabs the back of the array and works it's way up to index 0
		//Increasing the value of the binary position's value each time by 2
		for(int index=(binary.length-1); index >= 0; index--) {
			total += (binary[index] * placeMultiplier);
			placeMultiplier *= 2;
		}
		System.out.println("\nThe corresponding value in base 10: " + total);	
	}
}

