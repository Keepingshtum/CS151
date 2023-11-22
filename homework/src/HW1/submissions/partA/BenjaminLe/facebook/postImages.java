package facebook;

public class postImages implements Post1{

	 private String imageUrl;
	 
	 private boolean isImage;
	 
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

	 public postImages(String imageUrl, boolean isImage) {
	        if(isImage) {
	            this.imageUrl = imageUrl;
	            this.isImage = true;
	        }
	    }
	 
	 public void display() {
	        System.out.println(imageUrl);
	    }

}
