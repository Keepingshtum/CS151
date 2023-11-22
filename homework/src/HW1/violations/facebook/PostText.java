package HW1.violations.facebook;

public class PostText implements Post {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(text);
    }

}
