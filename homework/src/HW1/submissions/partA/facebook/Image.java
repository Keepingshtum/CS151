package HW1.submissions.partA.facebook;

public class Image {
    private String imageUrl;
    private boolean isImage;

    public Image(String imageUrl){
        this.imageUrl = imageUrl;
        this.isImage = true;
    }
    public String getImageUrl(){return imageUrl;}
    public boolean isImage(){return isImage;}
}
