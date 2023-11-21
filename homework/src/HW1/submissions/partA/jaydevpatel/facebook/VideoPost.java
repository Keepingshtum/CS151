package partA.jaydevpatel.facebook;

class VideoPost implements Displayable {
    private String videoUrl;

    public VideoPost(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.println("Video Post: " + videoUrl);
    }
}
