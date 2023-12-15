
1) Uber violates the Single Responsibility Principle of the SOLID principles. It does so because of its two methods, which are calculateRideFare() and sendNotification(). The calculateRideFate() method involves accessing the Ride class and making a calculation based off of that. The sendNotification() method accesses and intends to make modifications to the
User class. Since two different classes are being directly altered by the RideManagerClass, it violates the Single Responsiblity Principle.

2) I fixed this SOLID violation by creating the classes RideCalculator and NotificationSender, and having them handle the calculateRideFare() and sendNotifcation() methods respectively.
I placed a constructor for the RideCalculator class that takes in the amounts for minute_rate, mile_rate, and base_rate. The class then uses those values to calculate the fare value of
the given ride in its calculateRideFare() method. I also added message stack in the User class to contain all the messages. I added methods to initialize, add to, and read from the messages
stack. I then had the sendNotifcation() method in NotificationSender call the given User's addMessage() method to add the given message. It then prints out the given line it was initially
supposed to print. In the RideManager class, I initialized a RideCalculator object and a NotifcationSende object. For its calculateRideFare() method, it calls the calculateRideFare() method
for its RideCalculator object returns that value. That is how I added functionality to the RideManager class and fixed its violations. I also modified the main class. 
