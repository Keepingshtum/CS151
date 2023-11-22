package HW1.submissions.partA.williamtran.facebook;

public class VideoPost implements Post{
    private String videoUrl;

    // Constructor, getters, and setters for video

    @Override
    public void display() {
        System.out.println(videoUrl);
        // Code for displaying video post
    }
}
