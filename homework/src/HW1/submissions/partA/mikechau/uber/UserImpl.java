package HW1.submissions.partA.mikechau.uber;

public class UserImpl implements User {
    private String username;

    public UserImpl(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
