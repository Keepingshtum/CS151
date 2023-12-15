package HW1.submissions.partA.vincentsaw.facebook;

public class Main {
    public static void main(String[] args) {
        PostText  pt = new PostText();
        PostImage pi = new PostImage();
        PostVideo pv = new PostVideo();

        pt.setText("Poop post");
        pi.setImageUrl("https://tenor.com/view/happy-cat-happy-happy-cat-happy-happy-happy-cat-happy-happy-happy-cat-meme-gif-10674288337814969177");
        pv.setVideoUrl("https://www.youtube.com/watch?v=8Go6dHuylyM");

        Post p;
        p = pt;
        p.display();

        p = pi;
        p.display();

        p = pv;
        p.display();

    }
}
