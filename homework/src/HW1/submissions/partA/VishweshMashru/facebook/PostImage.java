package HW1.violations.facebook;

public class PostImage implements Post {
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(imageUrl);
    }

}
