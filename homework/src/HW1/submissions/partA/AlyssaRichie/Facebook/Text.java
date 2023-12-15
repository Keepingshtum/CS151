package alyssarichie.Facebook;


//Supports Text

public class Text {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Text(String text) {
        this.text = text;
    }

    public Text(String imageUrl, boolean isImage) {
        if(isImage) {
            images.setImageUrl(imageUrl);
            images.setImage(true);
        }
    }

    public Text(String videoUrl, boolean isImage, boolean isVideo){
        if(isVideo && !isImage) {
            videos.setVideoUrl(videoUrl);
            images.setImage(false);
            videos.setVideo(true);
        }
    }


    void displayText() {
        System.out.println(text);
    }
}
