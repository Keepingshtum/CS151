package HW0;

public class EricTran {
    public static void main(String[] args) {
        TeddyBear myTeddyBear = new TeddyBear("Blue", 2);
        System.out.println("Someone: So tell me about your teddy bear.");
        System.out.println("You:");
        myTeddyBear.printName();
        myTeddyBear.printAge();
    }
}

class TeddyBear {
    // Declare two instance variables
    private String name;
    private int age;

    // Teddy Bear constructor
    public TeddyBear(String theName, int theAge) {
        name = theName;
        age = theAge;
    }

    // Prints the name of the Teddy Bear
    public void printName() {
        System.out.println("The name of my Teddy Bear is: " + name);
    }

    // Prints the age of the Teddy Bear
    public void printAge() {
        System.out.println("The age of my Teddy Bear is: " + age + " years old");
    }
}