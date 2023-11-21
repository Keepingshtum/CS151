package facebook;

class Post2 {
    private PostDisplay postContent;

    public Post2(PostDisplay postContent) {
        this.postContent = postContent;
    }

    public void display() {
        postContent.display();
    }
}