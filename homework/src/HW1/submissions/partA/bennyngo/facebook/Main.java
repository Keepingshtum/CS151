package HW1.submissions.partA.bennyngo.facebook;

public class Main {
    public static void main(String[] args) {
        Post post = new PostText("Hello World!");
        post.display();

        Post post2 = new PostImage("Image.png", true);
        post2.display();

        Post post3 = new PostVideo("Video.mp4", true);
        post3.display();

        Post post4 = new PostGIF("GIF.gif", true);
        post4.display();

    }
}
