package uber;

public class NotificationService implements Notifier {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
    }
}