package HW1.violations.facebook;

//This was the original post class, that was implemented for our "Facebook".

class VideoPost extends TextPost{
    private boolean isVideo;
    private String videoUrl;

    void display() {
        System.out.println(text);
        // Code for displaying text post
    }

    // Constructor, getters, and setters for text

    public VideoPost(text, isVideo, videoUrl) {
    	super(text);
    	this.isVideo = isVideo;
    	this.videoUrl = videoUrl;
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
    
    
}
