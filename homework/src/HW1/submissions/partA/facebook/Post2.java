package HW1.submissions.partA.facebook;


//This is the new post class, that was implemented for our "Facebook" to help support images and videos.

public class Post2 {

    private TextManager textManager;
    private VideoManager videoManager;
    private ImageManager imageManager;

    private boolean isImage;
    private boolean isVideo;

    public Post2(String text) {
        textManager.setText(text);
    }

    public Post2(String imageUrl, boolean isImage) {
        if(isImage) {
            imageManager.setImageUrl(imageUrl);
            this.isImage = true;
        }
    }

    public Post2(String videoUrl, boolean isImage, boolean isVideo){
        if(isVideo && !isImage) {
            videoManager.setVideoUrl(videoUrl);
            this.isImage = false;
            this.isVideo = true;
        }
    }


    void displayText() {
        System.out.println(textManager.getText());
    }
}
