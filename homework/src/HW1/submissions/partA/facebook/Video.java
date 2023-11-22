package HW1.submissions.partA.facebook;

public class Video {
    private String videoUrl;
    private boolean isVideo;

    public Video(String videoUrl){
        this.videoUrl = videoUrl;
        this.isVideo = true;
    }
    public String getVideoUrl(){return videoUrl;}
    public boolean isVideo(){return isVideo;}
}
