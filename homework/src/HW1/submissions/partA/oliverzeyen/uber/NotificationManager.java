package HW1.violations.uber;

public class NotificationManager {
	void sendNotification(User user, String message) {
		// Code for sending notifications to the user
		System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
	}
}