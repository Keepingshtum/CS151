package HW1.submissions.partA.erictran.facebook;

abstract class Post {
    protected String text;

    public Post(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void display() {
        System.out.println(text);
    }
}