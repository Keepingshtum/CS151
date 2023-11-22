package HW1.violations.facebook;

public interface Post {
    private String text; //there should always be the option to add some sort of text to your post, so this is the bare minimum
    
    void display() {
        System.out.println(text);
        // Code for displaying text post
    }
}
