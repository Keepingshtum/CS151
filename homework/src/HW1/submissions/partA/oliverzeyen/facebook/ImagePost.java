package HW1.violations.facebook;

class ImagePost extends TextPost {
    private String imageUrl;
    private boolean isImage;
   
    @Override
    public void display() {
        super.display();
        System.out.println("Now displaying image: " + this.getImageUrl());
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
