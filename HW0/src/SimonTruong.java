import java.util.*;

public class SimonTruong {

    public static void main(String[] args) {
        System.out.println("How was your day today?");
        System.out.println("I have had quite the week.");
        System.out.println("Here's something a bit simple, a loop counter.");
        System.out.print("Input an integer: ");

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        for (int i = 1; i <= value; i++) {
            System.out.println("This message has been looped " + i + " times.");

        }
 
        System.out.println("\nI hope everything has been going well for you, have a great day :)");
    } 
}
