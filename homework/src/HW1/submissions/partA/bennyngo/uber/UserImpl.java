package HW1.submissions.partA.bennyngo.uber;


public class UserImpl implements User {
    // User details
    private String username;

    public UserImpl (String username){
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }


}


