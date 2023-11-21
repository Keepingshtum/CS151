Doordash
1. Which SOLID principle(s) is this company violating?
- In the Doorash company, two SOLID principles this company violates are Single Responsibility Principle and Interface Segregation Principle.
- The ‘FoodDeliveryAndTrackingService’ class has multiple responsibilities. It handles both delivering food and tracking packages. It violates SRP
- The ‘DeliveryService’ interface has two methods and one new method I add is notification of the delivery, but not all classes that implement this interface may need both methods. It violates ISP.
2. Your approach to making changes to fix the violation.
- After adding a new function call notification in ‘DeliveryService’, I will split it into separate interfaces for delivering food, tracking packages, and notification. 
- Split the 'FoodDeliveryAndTrackingService' class into three separate classes: one for delivering food, another for tracking packages, and one for notification when the food is delivered.
- Modify the ‘FoodDelivery’ class to use the ‘NotificationService’ for notifying the customer
