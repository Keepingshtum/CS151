package HW1.submissions.partA.williamtran.facebook;


//This is the new post class, that was implemented for our "Facebook" to help support images and videos.

public class Post2 {

    private String text;
    private String imageUrl;

    private String videoUrl;
    private boolean isImage;

    private boolean isVideo;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public Post2(String text) {
        this.text = text;
    }

    public Post2(String imageUrl, boolean isImage) {
        if(isImage) {
            this.imageUrl = imageUrl;
            this.isImage = true;
        }
    }

    public Post2(String videoUrl, boolean isImage, boolean isVideo){
        if(isVideo && !isImage) {
            this.videoUrl = videoUrl;
            this.isImage = false;
            this.isVideo = true;
        }
    }


    void displayText() {
        System.out.println(text);
    }
}
