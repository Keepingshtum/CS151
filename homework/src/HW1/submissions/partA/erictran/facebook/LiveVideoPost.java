package HW1.submissions.partA.erictran.facebook;

public class LiveVideoPost extends Post {
    private String liveVideoUrl;

    public LiveVideoPost(String text, String liveVideoUrl) {
        super(text);
        this.liveVideoUrl = liveVideoUrl;
    }

    public String getLiveVideoUrl() {
        return liveVideoUrl;
    }

    public void setLiveVideoUrl(String videoUrl) {
        this.liveVideoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.print("Video post: ");
        System.out.println(liveVideoUrl);
    }
}