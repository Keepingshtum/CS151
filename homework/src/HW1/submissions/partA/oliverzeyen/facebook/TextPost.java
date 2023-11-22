package HW1.violations.facebook;

public class TextPost implements Post{
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

    public void display() {
        System.out.println(text);
    }
}
