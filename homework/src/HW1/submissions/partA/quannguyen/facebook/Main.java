package facebook;

public class Main {
	public static void main(String[] args) {
        Post2 textPost = new Post2(new TextPost("This is a text post."));
        Post2 imagePost = new Post2(new ImagePost("https://example.com/image.jpg"));
        Post2 videoPost = new Post2(new VideoPost("https://example.com/video.mp4"));
        Post2 audioPost = new Post2(new AudioPost("https://example.com/audio.mp3"));
        
        textPost.display();
        imagePost.display();
        videoPost.display();
        audioPost.display();
    }
}
