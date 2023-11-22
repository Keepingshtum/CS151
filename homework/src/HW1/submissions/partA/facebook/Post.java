package HW1.submissions.partA.facebook;

public class Post {
    private Text text;
    private Image image;
    private Video video;

    public Post(Text text){
        this.text = text;
    }
    public Post(Text text, Image image){
        this.text = text;
        this.image = image;
    }
    public Post(Text text, Video video){
        this.text = text;
        this.video = video;
    }
    public Post(Text text, Image image, Video video){
        this.text = text;
        this.image = image;
        this.video = video;
    }

    public void displayText(){
        System.out.println(text.getText());
    }

    @Override
    public String toString(){
        return "Post: " + text.getText() + "\n" +
               "Image: " + (image != null ? image.getImageUrl() : "NO image url provided") + "\n" +
               "Video: " + (video != null ? video.getVideoUrl() : "NO video url provided") + "\n";
    }
}
