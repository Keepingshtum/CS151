package facebook;

public class ImagePost implements PostDisplay{
	private String imageUrl;

    public ImagePost(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.println("Image Post: " + imageUrl);
    }
}