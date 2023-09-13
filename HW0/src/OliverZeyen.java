//Oliver Zeyen
import java.util.Scanner;
public class OliverZeyen {
	public static String getSecretName(String agentName) {
		return agentName.charAt(0)+Integer.toString(agentName.length()*100);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Good evening agent, what's your name?");
		String nameInput = input.nextLine();
		System.out.println("Good evening agent " + nameInput + ", please insert a password.");
		String pwInput = input.nextLine();
		String cInput = " ";
		while (!cInput.equals("3")) {
			System.out.println("What would you like to do?\n1. Change Agent Name\n2. Receive Agent Code Name\n3. Logout");
			cInput = input.nextLine();
			if (cInput.equals("1")) {
				System.out.println("Please input your password, agent " + nameInput);
				if (!pwInput.equals(input.nextLine())) {
					System.err.println("YOU HAVE ENTERED THE WRONG PASSWORD. FOR SAFETY PURPOSES, THIS DEVICE WILL NOW EXPLODE IN 10 SECONDS.");
					cInput = "3";
				}
				else {
					System.out.println("Please enter your new desired name:");
					nameInput = input.nextLine();
				}
			}
			else if (cInput.equals("2")) {
				System.out.println("Good evening agent " + nameInput + ", by request your code name will be created.\nLOADING...\nGood evening agent, your code name will be " + getSecretName(nameInput));
			}
		}
		System.out.println("Goodbye and good luck agent " + nameInput + "!");
		input.close();
	}
}
