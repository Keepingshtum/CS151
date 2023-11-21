package partA.jaydevpatel.facebook;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Displayable textPost = new TextPost("Hello, this is a text post.");
        textPost.display();

        Displayable imagePost = new ImagePost("https://example.com/image.jpg");
        imagePost.display();

        Displayable videoPost = new VideoPost("https://example.com/video.mp4");
        videoPost.display();
    }
}
