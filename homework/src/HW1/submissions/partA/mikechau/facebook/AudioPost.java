package HW1.submissions.partA.mikechau.facebook;

public class AudioPost implements DisplayPost{
    private String audioUrl;
    private boolean isAudio;

    public AudioPost(String audioUrl, boolean isAudio) {
        this.audioUrl = audioUrl;
        this.isAudio = isAudio;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setImageUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public boolean isAudio() {
        return isAudio;
    }

    public void setImage(boolean audio) {
        isAudio = audio;
    }

    @Override
    public void display() {
        System.out.println(audioUrl);
    }
}
