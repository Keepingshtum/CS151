package partA.jaydevpatel.facebook;

class ImagePost implements Displayable {
    private String imageUrl;

    public ImagePost(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.println("Image Post: " + imageUrl);
    }
}