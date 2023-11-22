package HW1.submissions.partA.uber;

public class RideNotificationManager{
    public void sendNotification(User user, String message){
        System.out.println("Notification sent to user: "+user.getUsername()+" - "+message);
    }
}
