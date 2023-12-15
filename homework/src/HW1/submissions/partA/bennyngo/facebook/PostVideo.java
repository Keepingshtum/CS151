package HW1.submissions.partA.bennyngo.facebook;

public class PostVideo implements Post {

    private String text;
    private String videoUrl;
    private boolean isVideo;

    public PostVideo(String videoUrl, boolean isVideo) {
        this.videoUrl = videoUrl;
        this.isVideo = isVideo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    @Override
    public void display() {
        System.out.println(videoUrl);
    }
}
