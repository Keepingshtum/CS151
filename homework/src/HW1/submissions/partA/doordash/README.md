1) which SOLID principle(s) is this company violating?  
This company violates Single Responsibility Principle and Interface Segregation Principle.


2) Your approach to making changes to fix the violation
ISP is satisfied by breaking down the interface DeliveryService into more client-specific interfaces Deliverable and Trackable.
Consequently, the class FoodDeliveryAndTrackingService is also broken down into class FoodDeliveryService and class FoodTrackingService
with each correspondingly implementing Deliverable interface and Trackable interface, thus making SRP satisfied. While not violating yet, based on the recent
capabilities, using Restaurant class my potentially violate LSP since items beyond food can be ordered on DoorDash, so I created an interface Seller
with the class Restaurant implementing it for future expansions. I also made use of instanceof operator and 'that' keyword to verify 
this recent version supports only the restaurant orders for now.