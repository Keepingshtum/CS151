package HW1.submissions.partA.mikechau.facebook;

public class Main {
    public static void main(String[] args) {
        // Test cases for AudioPost
        System.out.println("Testing AudioPost:");
        AudioPost audioPost = new AudioPost("http://example.com/audio.mp3", true);
        audioPost.display();

        // Test cases for ImagePost
        System.out.println("\nTesting ImagePost:");
        ImagePost imagePost = new ImagePost("http://example.com/image.jpg", true);
        imagePost.display();

        // Test cases for TextPost
        System.out.println("\nTesting TextPost:");
        TextPost textPost = new TextPost("Hello, this is a text post!");
        textPost.display();

        // Test cases for VideoPost
        System.out.println("\nTesting VideoPost:");
        VideoPost videoPost = new VideoPost("http://example.com/video.mp4", true);
        videoPost.display();
    }
}
