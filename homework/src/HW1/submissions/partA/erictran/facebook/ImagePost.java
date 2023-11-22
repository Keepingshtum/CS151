package HW1.submissions.partA.erictran.facebook;

public class ImagePost extends Post {
    private String imageUrl;

    public ImagePost(String text, String imageUrl) {
        super(text);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.print("Image post: ");
        System.out.println(imageUrl);
    }
}