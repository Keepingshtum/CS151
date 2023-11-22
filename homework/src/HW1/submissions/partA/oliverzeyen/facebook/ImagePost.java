package HW1.violations.facebook;

//This was the original post class, that was implemented for our "Facebook".

class ImagePost extends TextPost {
    private String imageUrl;
    private boolean isImage;

    void display() {
        System.out.println(text);
        // Code for displaying text post
    }
    // Constructor, getters, and setters for text
    
    public ImagePost(String text, String imageUrl, boolean isImage) {
    	super(text);
    	this.imageUrl = imageUrl;
    	this.isImage = isImage;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }
}
