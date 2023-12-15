**SOLID Principles the company is violating**:

- **Interface Segregation Principle** - The DeliveryService interface has two methods that should be
split into two different interfaces.

**Approaches to fix the violation and additional changes**:
- Made separate interfaces for FoodDelivery and TrackingService
- Added another interface called GroceriesDelivery and GroceriesDeliveryService to demonstrate the 
significance of the Interface Segregation Principle
- Added Market class for grocery delivery services

The DeliveryService interface would cause issues if we were to introduce a new service for 
delivering groceries. If we had all the methods in one interface, it would cause issues since 
the food and grocery delivery service classes would need to implement all three methods.
GroceriesDeliveryService does not handle food deliveries and FoodDeliveryService does not handle
grocery deliveries, but both need to track the packages. If all the methods are split into separate
"fine-grained and client specific" interfaces, it is easier for the classes to use them independently.