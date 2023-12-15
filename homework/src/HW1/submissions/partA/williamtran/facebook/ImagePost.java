package HW1.submissions.partA.williamtran.facebook;

public class ImagePost implements Post{
    private String imageUrl;

    // Constructor, getters, and setters for image

    @Override
    public void display() {
        System.out.println(imageUrl);
        // Code for displaying image post
    }
}
