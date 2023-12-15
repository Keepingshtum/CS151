package HW1.submissions.partA.victoriale.facebook;

public class VideoPost implements Post{
    private String videoUrl;
    private boolean isVideo;
    private boolean isImage;

    public boolean isVideo() {
        return isVideo;
    }
    public void setVideo(boolean video) {
        isVideo = video;
    }
    public String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public VideoPost(String videoUrl, boolean isImage, boolean isVideo) {
        if(isVideo && !isImage) {
            this.videoUrl = videoUrl;
            this.isImage = false;
            this.isVideo = true;
        }
    }

    public void displayPost(){
        // methods to display video
        System.out.println("Displaying video: " + videoUrl); //for testing
    }
}
