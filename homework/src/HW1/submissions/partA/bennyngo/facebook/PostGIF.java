package HW1.submissions.partA.bennyngo.facebook;

public class PostGIF implements Post {
    private String gifUrl;
    private boolean isGif;

    public PostGIF(String gifUrl, boolean isGif) {
        this.gifUrl = gifUrl;
        this.isGif = isGif;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }

    public boolean isGif() {
        return isGif;
    }

    public void setGif(boolean gif) {
        isGif = gif;
    }

    @Override
    public void display() {
        System.out.println(gifUrl);
    }

}
