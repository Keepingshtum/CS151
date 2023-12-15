package HW1.submissions.partA.victoriale.facebook;

public class Main {
    public static void main(String[] args){
        TextPost tp = new TextPost("This is a text post.");
        tp.displayPost();

        ImagePost ip = new ImagePost("testimageurl", true);
        ip.displayPost();

        VideoPost vp = new VideoPost("testvideourl", false, true);
        vp.displayPost();

    }
}
