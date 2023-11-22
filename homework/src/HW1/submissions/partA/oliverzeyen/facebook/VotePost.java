package HW1.violations.facebook;

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
    	voteNo++;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Prompt: " + this.prompt + "\nYes votes: " + voteYes + "\nNo votes:" + voteNo);
    }
}
