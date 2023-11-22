package HW1.violations.facebook;


//This is the new post class, that was implemented for our "Facebook" to help support images and videos.

public class TextPost {
    private String text;

    public TextPost(String text) {
    	this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void displayText() {
        System.out.println(text);
    }
}
