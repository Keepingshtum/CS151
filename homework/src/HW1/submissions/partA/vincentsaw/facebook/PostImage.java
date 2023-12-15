package HW1.submissions.partA.vincentsaw.facebook;


//This is the new post class, that was implemented for our "Facebook" to help support images and videos.

public class PostImage implements Post {
    
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.println("(PostImage) Displaying image from image URL: " + getImageUrl());
    }
}
