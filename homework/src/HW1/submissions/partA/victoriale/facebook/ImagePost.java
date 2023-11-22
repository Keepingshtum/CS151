package HW1.submissions.partA.victoriale.facebook;

public class ImagePost implements Post{
    private String imageUrl;
    private boolean isImage;

    public boolean isImage() {
        return isImage;
    }
    public void setImage(boolean image) {
        isImage = image;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ImagePost(String imageUrl, boolean isImage) {
        if(isImage) {
            this.imageUrl = imageUrl;
            this.isImage = true;
        }
    }

    public void displayPost(){
        // methods to display image
        System.out.println("Displaying image: " + imageUrl); //for testing
    }
}
