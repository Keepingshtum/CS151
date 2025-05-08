package facebook;

//This was the original post class, that was implemented for our "Facebook".

class Post1 implements Post {
    private String text;

    public Post1(String text)
    {
    	this.text = text;
    }
    
    public void setText(String text)
    {
    	this.text = text;
    }
    
    public String getText()
    {
    	return text;
    }
    // Constructor, getters, and setters for text

    public void display() {
        System.out.println(text);
        // Code for displaying text post
    }
}