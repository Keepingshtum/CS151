# 'DoorDash' Violation of SOLID

This code violates the "I" in SOLID, which stands for Interface Segregation Principle.
<br />
<br />
It officially states that "Clients should not be forced to depend on methods they do not use."
Examining the "FoodDeliveryAndTrackingService" class, it has two responsibilities, one
being delivering food and the other being tracking packages.
Though, clients that only need to deliver food do not need to depend on the trackPackage() method.
<br />
<br />
A better design approach is to split the "FoodDeliveryAndTrackingService" class into two.
For example, we can split the code into "FoodDeliveryService" and "PackageTrackingService."
<br />
<br />
We need to alter 'DeliveryService' interface so that it focuses on Food Delivery only:
```
package doordash;

public interface DeliveryService {
    void deliverFood(Restaurant restaurant, Customer customer);
}
```
We create a new 'FoodDeliveryService' class that focuses on Food Delivery only:
```
package doordash;

public class FoodDeliveryService implements DeliveryService {
    @Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }
}
```
We create a new 'TrackingService' interface so that it focuses on Package Tracking only:
```
package doordash;

public interface TrackingService {
    void trackPackage(String trackingNumber);
}
```
We create a new 'PackageTrackingService' class that focuses on Package Tracking only:
```
package doordash;

public class PackageTrackingService implements TrackingService {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
```
After making the following changes, the code now adheres to the Interface Segregation Principle.
of SOLID.
<br />
<br />
We have a Main class to test the new code. It should produce the following output:
```
Food delivered from Chick-fil-a to Bobby
Package with tracking number 123456789 is being tracked.
```