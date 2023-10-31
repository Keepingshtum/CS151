package HW0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KenDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the length of the box:");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the box:");
            double width = scanner.nextDouble();

            System.out.println("Enter the height of the box:");
            double height = scanner.nextDouble();

            double surfaceArea = 2 * (length * width + length * height + width * height);

            System.out.println("\nBox Dimensions:");
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Surface Area: " + surfaceArea);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}