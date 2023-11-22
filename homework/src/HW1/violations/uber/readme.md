In the RideManager class, the method calculateRideFare directly calculates the ride fare based on distance and time. 
If you want to introduce new types of fares or modify the existing fare calculation logic, 
you would need to modify the calculateRideFare method, violating the Open/Closed Principle.
To address the Open/Closed Principle violation in the provided code, I applied the strategy pattern by 
introducing a FareCalculator interface and a concrete implementation named StandardFareCalculator. 
This interface defines a method calculateRideFare that takes a Ride object and returns the calculated fare. 
The RideManager class now holds a reference to a FareCalculator instance, allowing for flexibility in swapping different 
fare calculation strategies. The calculateRideFare method in RideManager delegates the fare calculation to the injected 
FareCalculator. This design adheres to the Open/Closed Principle by allowing the system to be extended with new fare calculation 
strategies without modifying the existing code in the RideManager class. Future enhancements or variations in fare calculation 
can be accommodated by creating new classes implementing the FareCalculator interface, promoting a more modular and maintainable system.