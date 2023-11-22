package HW1.submissions.partA.facebook;

public class Main {
    public static void main(String[] args){
        Post post1 = new Post(new Text("text-only post"));
        Post post2 = new Post(new Text("text and image post"), new Image("...some image url..."));
        Post post3 = new Post(new Text("text and video post"), new Video("...some video url..."));
        Post post4 = new Post(new Text("text, image, and video post"), new Image("...some image url..."), new Video("...some video url..."));

        System.out.println(post1);
        System.out.println(post2);
        System.out.println(post3);
        System.out.println(post4);
    }
}
