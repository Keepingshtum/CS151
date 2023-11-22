package HW1.submissions.partA.victoriale.facebook;

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

    public void displayPost() {
        System.out.println(text);
    }
}
