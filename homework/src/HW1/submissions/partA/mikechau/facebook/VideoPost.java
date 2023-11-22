package HW1.submissions.partA.mikechau.facebook;

public class VideoPost implements DisplayPost{
    private String videoUrl;
    private boolean isVideo;

    public VideoPost(String videoUrl, boolean isVideo) {
        this.videoUrl = videoUrl;
        this.isVideo = isVideo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setImageUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setImage(boolean video) {
        isVideo = video;
    }

    @Override
    public void display() {
        System.out.println(videoUrl);
    }
}
