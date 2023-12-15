package HW1.submissions.partA.mikechau.facebook;

public class TextPost implements DisplayPost{
    private String text;

    public TextPost(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String textString) {
        this.text = textString;
    }

    @Override
    public void display() {
        System.out.println(text);
    }
}
