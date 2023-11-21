package HW1.submissions.partA.vincentsaw.facebook;

//This was the original post class, that was implemented for our "Facebook".

class PostText implements Post {
    private String text;

    // Constructor, getters, and setters for text
    public void setText(String t) {
        text = t;
    }
    public String getText() {
        return text;
    }

    @Override
    public void display() {
        System.out.println("(PostText) " + getText());
    }
}
