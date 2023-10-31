package HW0;

import java.util.Scanner;
public class BennyNgo {
    public static void main(String[] args) {
        addNumbers add = new addNumbers();
        add.add2Numbers();
    }
}

class addNumbers {
    int a, b;

    addNumbers() {
        a = 0;
        b = 0;
    }

    void add2Numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Sum is: " + (a+b));
    }
}