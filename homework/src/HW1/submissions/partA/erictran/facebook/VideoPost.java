package HW1.submissions.partA.erictran.facebook;

public class VideoPost extends Post {
    private String videoUrl;

    public VideoPost(String text, String videoUrl) {
        super(text);
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.print("Video post: ");
        System.out.println(videoUrl);
    }
}