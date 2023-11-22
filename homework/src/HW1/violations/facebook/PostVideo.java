package HW1.violations.facebook;

public class PostVideo implements Post {
    private String videoUrl;

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void display() {
        // TODO Auto-generated method stub
        System.out.print(videoUrl);
    }
}
