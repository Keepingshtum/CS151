package HW1.submissions.partA.vincentsaw.facebook;


//This is the new post class, that was implemented for our "Facebook" to help support images and videos.

public class PostVideo implements Post {
    
    private String videoUrl;

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.println("(PostVideo) Displaying video from video URL: " + getVideoUrl());
    }
}
