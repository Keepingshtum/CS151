package HW1.submissions.partA.bennyngo.facebook;

public class PostText implements Post {
    private String text;

    public PostText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println(text);
    }
}
