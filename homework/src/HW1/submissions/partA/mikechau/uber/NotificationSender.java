package HW1.submissions.partA.mikechau.uber;

public class NotificationSender implements NotificationSenderService{
    @Override
    public void sendNotification(UserImpl user, String message) {
        // Code for sending notifications to the user
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
    }
}
