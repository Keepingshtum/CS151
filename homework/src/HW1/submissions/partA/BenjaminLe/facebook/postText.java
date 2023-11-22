package facebook;


//This is the new post class, that was implemented for our "Facebook" to help support images and videos.

public class postText implements Post1 {

    private String text;
   


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

   
  

    public postText(String text) {
        this.text = text;
    }


    void displayText() {
        System.out.println(text);
    }
    
    public void display() {
        System.out.println(text);
    }
}
