public class EricTran {
    private String name;
    private int age;

    public EricTran(String theName, int theAge) {
        name = theName;
        age = theAge;
    }
    public void printName() {
        System.out.println("The name of your Teddy Bear is: " + name);
    }
    public void printAge() {
        System.out.println("The age of your Teddy Bear is: " + age + " years old");
    }

    public static void main(String[] args) {
        EricTran myTeddyBear = new EricTran("Blue", 5);
        myTeddyBear.printName();
        myTeddyBear.printAge();
    }
}
