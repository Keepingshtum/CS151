public class EricTran {
    // Declare two instance variables
    private String name;
    private int age;

    // Teddy Bear constructor
    public EricTran(String theName, int theAge) {
        name = theName;
        age = theAge;
    }
    // Prints the name of the Teddy Bear
    public void printName() {
        System.out.println("The name of your Teddy Bear is: " + name);
    }
    // Prints the age of the Teddy Bear
    public void printAge() {
        System.out.println("The age of your Teddy Bear is: " + age + " years old");
    }

    public static void main(String[] args) {
        EricTran myTeddyBear = new EricTran("Blue", 5);
        myTeddyBear.printName();
        myTeddyBear.printAge();
    }
}
