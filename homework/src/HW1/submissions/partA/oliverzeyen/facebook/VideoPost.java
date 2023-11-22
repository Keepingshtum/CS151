package HW1.violations.facebook;

class VideoPost extends TextPost{
    private boolean isVideo;
    private String videoUrl;

    @Override
    public void display() {
    	super.display();
        System.out.println("Now watching: " + this.getVideoUrl());
    }

    // Constructor, getters, and setters for text

    public VideoPost(String text, boolean isVideo, String videoUrl) {
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
