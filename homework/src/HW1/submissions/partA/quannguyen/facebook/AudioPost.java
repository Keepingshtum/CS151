package facebook;

public class AudioPost implements PostDisplay {
    private String audioUrl;

    public AudioPost(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @Override
    public void display() {
        System.out.println("Audio Post: " + audioUrl);
    }
}