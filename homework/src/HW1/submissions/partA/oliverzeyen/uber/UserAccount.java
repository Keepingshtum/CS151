package HW1.violations.uber;

public class UserAccount implements User{
    // User details
    private String username;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }
}