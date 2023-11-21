package facebook;

public class VideoPost implements PostDisplay{
	private String videoUrl;

    public VideoPost(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.println("Video Post: " + videoUrl);
    }
}