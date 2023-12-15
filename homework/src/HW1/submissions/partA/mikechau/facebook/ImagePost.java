package HW1.submissions.partA.mikechau.facebook;

public class ImagePost implements DisplayPost {
    private String imageUrl;
    private boolean isImage;

    public ImagePost(String imageUrl, boolean isImage) {
        this.imageUrl = imageUrl;
        this.isImage = isImage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }

    @Override
    public void display() {
        System.out.println(imageUrl);
    }
}
