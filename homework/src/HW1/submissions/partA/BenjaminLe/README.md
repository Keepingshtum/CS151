# Problem: Airbnb

## pt.1 What SOLID(s) principle is being violated?

- Liskov Substitution Principle: Discounted Hotel is unable to replace Hotel because it uses the super. method and if the Hotel class is gone then super. won't have anything to inherit thus it no longer works
- Open Closed Principle: I have to extend and modify the hotel class every time I want to add a different house to the airbnb. 

## pt.2 How do you fix the identified issues above?

Change super.calculateTotalPrice(numberOfNights) to numberOfNights * 100. This way even if Hotel disappears we still have

Create an interface that holds the calculateTotalPrice() function so that different hotel types can implement it. This way the prices of different hotels can still be customized (open) while the original code cannot be modified (closed). 

## pt.3 Additional Functionality

Allows users to see how much the total bill is with California tax and a tip amount of their choice.


# Problem: DoorDash

## pt.1 What SOLID(s) principle is being violated?

Interface Separation Principle: We only need to deliver food and not track packages so it's necessary to force users to implement a trackPackage function
Single Responsibility Principle: FoodDeliveryAndTrackingService class has 2 different responsibilities: food delivery and tracking packages


## pt.2 How do you fix the identified issues above?

Move the “track package” function from the DeliveryService interface into a different interface
Split the FoodDeliveryAndTrackingService into 2 different classes with 1 responsibility each: Class FoodDelivery and Class Tracking Service

## pt.3 Additional Functionality
Allows users to see what orders still need to be delivered to a specific address of the customer.


# Problem: Facebook

## pt.1 What SOLID(s) principle is being violated?

Single Responsibility Principle: Post2 has too many responsibilities working with images, videos, text, etc


## pt.2 How do you fix the identified issues above?

Split the Post2 class into 3 different classes: images, text, videos

## pt.3 Additional Functionality

Turned Post1 into an interface to ensure that if we want to create different posts in the future like posting figs then we can easily implement it. Along with that I added a “display()” function for each class that just displays the url of each image/video. This is to set up for future functionality when we have the code to import and display the actual image/video.


# Problem: PayPal

## pt.1 What SOLID(s) principle is being violated?

Dependency Inversion Principle: PayPalProcessor is a high level module that's dependent on PayPalGateway which is a low level module

- PaymentProcessor is a high-level module because it orchestrates the payment processing logic and is more abstract

- PayPalGateway is a lower-level module because it handles the specific implementation details of processing payments via PayPal.


## pt.2 How do you fix the identified issues above?

To align with the Dependency Inversion Principle the high-level module class should be dependent on an interface or an abstract class rather than a concrete lower level module class like PayPalGateway. To fix this I created an interface called PayPalBarrier for both of them to implement.

## pt.3 Additional Functionality

You can now request a refund of a specific amount from a specific account


# Problem: Uber

## pt.1 What SOLID(s) principle is being violated?

Open-Closed Principle: the RideManager class only calculates the rideFare for a normal Ride class. If I wanted to ride in a deluxe uber then it might cost more. However, in order to calculate the ride fare I would have to modify the RideManager class directly which violates the Open-Closed principle.


## pt.2 How do you fix the identified issues above?
I created an interface to hold the calculateRideFare function. This way if I want to find out the cost of a different kind of uber like a deluxe uber then I can easily implement it without having to modify the initial RideManager class.

## pt.3 Additional Functionality

There’s a new RideManagerDeluxe class that allows you to calculate the ride fare of what a deluxe uber would cost with the same distance in miles and duration in minutes.



