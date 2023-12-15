package HW1.submissions.partA.bennyngo.uber;

public class NotiSend implements NotificationSender {
    @Override
    public void sendNotification(UserImpl user, String message) {
        // Code for sending notifications to the user
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
    }
}
