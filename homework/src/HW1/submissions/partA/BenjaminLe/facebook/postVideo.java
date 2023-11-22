package facebook;

public class postVideo implements Post1 {

    private String videoUrl;

    private boolean isVideo;
    
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
    

    public postVideo(String videoUrl,  boolean isVideo){
        if(isVideo) {
            this.videoUrl = videoUrl;
            this.isVideo = true;
        }
    }

    public void display() {
        System.out.println(videoUrl);
    }

}
