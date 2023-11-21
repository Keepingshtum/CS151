package facebook;

public class TextPost implements PostDisplay {
	private String text;

    public TextPost(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Text Post: " + text);
    }
}
