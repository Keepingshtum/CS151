package HW1.submissions.partA.erictran.facebook;

public class Main {
    public static void main(String[] args) {
        TextPost textPost = new TextPost("This is a text post.");
        ImagePost imagePost = new ImagePost("Check out this image!", "https://example.com/image.jpg");
        VideoPost videoPost = new VideoPost("Watch this video!", "https://example.com/video.mp4");
        LiveVideoPost liveVideoPost = new LiveVideoPost("Join my stream!", "rtmp://facebook.com/live");

        System.out.println("Text Post Test:");
        textPost.display();
        System.out.println("\nImage Post Test:");
        imagePost.display();
        System.out.println("\nVideo Post Test:");
        videoPost.display();
        System.out.println("\nLive Video Post Test:");
        liveVideoPost.display();

        textPost.setText("Updated text post.");
        System.out.println("\nUpdated Text Post:");
        textPost.display();
        imagePost.setImageUrl("https://example.com/image2.jpg");
        System.out.println("\nUpdated Image Post:");
        imagePost.display();
        videoPost.setVideoUrl("https://example.com/video2.mp4");
        System.out.println("\nUpdated Video Post:");
        videoPost.display();
        liveVideoPost.setLiveVideoUrl("rtmp://facebook.com/live2");
        System.out.println("\nUpdated Live Video Post:");
        liveVideoPost.display();
    }
}