## 1.  Which SOLID principle(s) is this company violating?

DoorDash violates the Single Responsibility Principle and the Interface Segregation Principle

The FoodDeliveryAndTrackingService class has two responsibilites in delivering food and tracking the packages. This violates the SRP.

The DeliveryService interface has two methods and a method I added called cancelOrder. Not every customer will cancel their order though, so the interface violates the ISP.


## 2.  Your approach to making changes to fix the violation.

Split the DeliveryService interface into three separate interfaces: CancelService, DeliveryService, and PackageTrackerService

Split the FoodDeliveryAndTrackingService into three separate classes: CancelDelivery, FoodDeliveryService, and PackageTrackingService


