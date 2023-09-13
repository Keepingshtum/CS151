public class QuanNguyen {

    public static void main(String[] args) {
        System.out.println("Hello Everyone,");
        Person quan = new Person("Quan Nguyen", "Computer Science", "Basketball and Video games");
        quan.introduce();
    }

    static class Person {
        private String name;
        private String major;
        private String hobby;

        public Person(String name, String major, String hobby) {
            this.name = name;
            this.major = major;
            this.hobby = hobby;
        }

        public void introduce() {
            System.out.printf("My name is %s. My major is %s. My hobby is playing %s.", name, major, hobby);
        }
    }
}