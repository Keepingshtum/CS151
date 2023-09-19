public class VincentSaw {
    public static void main(String[] args) {
        VincentsPerson vincent = new VincentsPerson("Vincent", 21, "Golf and Racing");
        vincent.introduce_self();
    }
}

class VincentsPerson {
    String name;
    int age;
    String hobbies;

    VincentsPerson() {
        name = "N/A";
        age = -1;
        hobbies = "N/A";
    }

    VincentsPerson(String n, int a, String h) {
        name = n;
        age = a;
        hobbies = h;
    }

    void introduce_self() {
        System.out.printf("Hello, my name is %s.\nI am %d years old.\nFor hobbies, I like %s!\n", name, age, hobbies);
    }

}