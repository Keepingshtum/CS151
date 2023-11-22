package HW1.violations.facebook;

//This was the original post class, that was implemented for our "Facebook".

class VotePost extends TextPost {
    private String text;
    private String prompt;
    private int voteYes;
    private int voteNo;
    
    
    // Constructor, getters, and setters for text
    
    public VotePost(String text, String prompt) {
    	super(text);
    	this.prompt = prompt;
    	voteYes = 0;
    	voteNo = 0;
    }
    
    public void votedYes() {
    	voteYes++;
    }
    
    public void votedNo() {
    	votedNo++;
    }
    
    void display() {
        System.out.println(text);
        // Code for displaying text post
    }
}
