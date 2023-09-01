public class Main {
    public static void main(String[] args) {
        Person vincent = new Person("Vincent", 21, "Golf and Racing");
        vincent.introduce_self();
    }
}

class Person {
    String name;
    int age;
    String hobbies;

    Person() {
        name = "N/A";
        age = -1;
        hobbies = "N/A";
    }

    Person(String n, int a, String h) {
        name = n;
        age = a;
        hobbies = h;
    }

    void introduce_self() {
        System.out.printf("Hello, my name is %s.\nI am %d years old.\nFor hobbies, I like %s!\n", name, age, hobbies);
    }

}