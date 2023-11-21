package partA.jaydevpatel.uber;

public class UserManager {
    public static User createUser(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }
}