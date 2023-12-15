package partA.jaydevpatel.facebook;


class TextPost implements Displayable {
    private String text;

    public TextPost(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Text Post: " + text);
    }
}


