# 'Facebook' Violation of SOLID

This code violates the "O" in SOLID, which stands for Open-Closed Principle.
<br />
<br />
It officially states that "Classes should be open for extension, but closed for modification."
That means we should be able to add new functionality to a class without having to alter its existing code.
In this case, the second iteration of the 'Post' class has been extended to handle text, images, and videos
from pure text posts in the first iteration of the 'Post' class. However, the modification was done directly
in the 'Post' class rather than through some extension mechanism.
<br />
<br />
A better design approach is to use inheritance, creating separate classes for different types of posts like
'TextPost,' 'ImagePost,' and 'VideoPost,' each extending from the base 'Post' class.
<br />
<br />
Lets recall that the original 'Post' class looks like the following. We will make it an abstract class instead:
```
abstract class Post {
    protected String text;

    public Post(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void display() {
        System.out.println(text);
    }
}
```
Now, we can write our 'TextPost' class that extends from the base 'Post' class:
```
public class TextPost extends Post {
    public TextPost(String text) {
        super(text);
    }
}
```
Now, we can write our 'ImagePost' class that extends from the base 'Post' class:
```
public class ImagePost extends Post {
    private String imageUrl;

    public ImagePost(String text, String imageUrl) {
        super(text);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.print("Image post: ");
        System.out.println(imageUrl);
    }
}
```
Now, we can write our 'VideoPost' class that extends from the base 'Post' class:
```
public class VideoPost extends Post {
    private String videoUrl;

    public VideoPost(String text, String videoUrl) {
        super(text);
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.print("Video post: ");
        System.out.println(videoUrl);
    }
}
```
After making the following changes, the code now adheres to the Open-Closed Principle of SOLID.
<br />
<br />
We have a Main class to test the new code. It should produce the following output:
```
Text Post Test:
This is a text post.

Image Post Test:
Image post: https://example.com/image.jpg

Video Post Test:
Video post: https://example.com/video.mp4

Updated Text Post:
Updated text post.

Updated Image Post:
Image post: https://example.com/image2.jpg

Updated Video Post:
Video post: https://example.com/video2.mp4
```