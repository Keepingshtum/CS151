package alyssarichie.Facebook;

public class images {
    private static boolean isImage;
    private static String imageUrl;

    private static boolean isValidURL;

    public String getImageUrl() {
        return imageUrl;
    }

    public static void setImageUrl(String newimageUrl) {

        imageUrl = checkURL(newimageUrl);
    }
    //New method - checks if the url is valid before setting image url it's a helper method for setImageURL
    private static String checkURL(String newImageURL) {
        if (newImageURL == null) {
            return null;
        }
        return newImageURL;
    }

    public boolean isImage() {
        return isImage;
    }

    public static void setImage(boolean image) {
        isImage = image;
    }
}
