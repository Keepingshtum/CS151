# Refactoring Airbnb Booking System

## SOLID Principles Violations and Refactoring Approach

### Single Responsibility Principle (SRP)

**Violation:**
- The `DiscountedHotel` class violates SRP by inheriting from `Hotel` and also incorporating discount logic.

**Refactoring Approach:**
- Separate the discount logic into a separate class, adhering to the Single Responsibility Principle.

### Open/Closed Principle (OCP)

**Violation:**
- The `calculateTotalPrice` method in the `DiscountedHotel` class directly modifies the behavior of the inherited method.

**Refactoring Approach:**
- Use a strategy pattern or a decorator pattern to allow for extension without modification of existing code.

### Liskov Substitution Principle (LSP)

**No Violation:**
- The `DiscountedHotel` class correctly inherits from `Hotel`.

### Interface Segregation Principle (ISP)

**No Violation:**
- All classes seem to be implementing the `BookingService` interface.

### Dependency Inversion Principle (DIP)

**Violation:**
- The `Main` class depends on concrete implementations (`Hotel`, `DiscountedHotel`, `BookingServiceImpl`).

**Refactoring Approach:**
- Introduce dependency injection to pass abstractions (interfaces) to the `Main` class instead of concrete implementations.

### Additional Function: Total Price with Tax

**New Functionality:**
- Added a function to calculate the total price including taxes.

**Refactoring Approach:**
- Introduced a `TaxService` interface for tax calculations.
- Created a `TaxableHotel` class that implements the `Hotel` interface and includes tax calculations.
- Modified the `BookingService` interface and implementation to accommodate the new functionality.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Refactoring PayPal

This project initially violated some of the SOLID principles, and the following changes were made to address these violations:

## Single Responsibility Principle (SRP)

### Violation:
- The `PaymentProcessor` class was responsible for both managing the PayPalGateway and processing payments.

### Fix:
- Separated concerns into two classes:
  - `PaymentProcessorService` for payment processing logic.
  - `PayPalGateway` for managing the PayPal gateway.

## Open/Closed Principle (OCP)

### Violation:
- While the code didn't explicitly violate OCP, it wasn't easily extensible for adding new payment gateways.

### Potential Improvement:
- Introduced an interface, `PaymentGateway`, to provide a foundation for adding new payment gateways in the future.

## Liskov Substitution Principle (LSP)

### Compliance:
- The code didn't involve inheritance or overriding, so LSP wasn't directly applicable.

## Interface Segregation Principle (ISP)

### Compliance:
- The code didn't explicitly use interfaces, so there was no violation or compliance with ISP.

## Dependency Inversion Principle (DIP)

### Violation:
- The `PaymentProcessor` class depended directly on `PayPalGateway`, making it less adaptable to different payment gateways.

### Fix:
- Introduced an abstraction, `PaymentGateway`, and made both `PayPalGateway` and `PaymentProcessorService` implement it.
- Modified `PaymentProcessor` to depend on the `PaymentGateway` abstraction, allowing for easier adaptation to different payment gateways.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Refactoring doordash

## SOLID Principle Violations and Fixes

### 1. Single Responsibility Principle (SRP)

**Violation:**
The `FoodDeliveryAndTrackingService` class handles both food delivery and package tracking.

**Approach to Fix:**
Separate the responsibilities into distinct classes. Create interfaces or classes for delivery and tracking.

### 2. Open/Closed Principle (OCP)

**Violation:**
The system may require modification when introducing new delivery methods or tracking systems.

**Approach to Fix:**
Make the code open for extension by introducing interfaces or abstract classes. Allow for easy addition of new features without modifying existing code.

### 3. Liskov Substitution Principle (LSP)

**Violation:**
Ensure that subclasses can be used interchangeably with their base class.

**Approach to Fix:**
Review subclasses to ensure they adhere to the Liskov Substitution Principle. Subclasses should not violate the behavior expected from their base class.

### 4. Interface Segregation Principle (ISP)

**Violation:**
The `DeliveryService` interface includes methods for both delivery and tracking, which may not be relevant for all implementations.

**Approach to Fix:**
Split the interface into smaller, more focused interfaces, so that classes can implement only the methods they need.

### 5. Dependency Inversion Principle (DIP)

**Violation:**
High-level modules might depend directly on low-level modules.

**Approach to Fix:**
Introduce abstractions (interfaces or abstract classes) to invert the dependencies. High-level modules should depend on abstractions, not concrete implementations.

## Refactored Code

### New Interfaces:

1. `PackageTracker`: Defines the method to track packages.

### Refactored Classes:

1. `FoodPackageTracker`: Implements `PackageTracker` for package tracking.

2. `DeliveryService`: Separates delivery responsibilities. Includes methods for food delivery and delivery confirmation.

3. `FoodDeliveryService`: Implements the new `DeliveryService` interface for food delivery.



----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Refactoring Uber

## SOLID Principles Violations and Refactoring Guide

### Single Responsibility Principle (SRP)

**Violation:**
- The `Main` class is responsible for creating instances of `Ride`, `User`, interacting with `RideManager`, and initiating notifications.

**Approach to Fix:**
- Separate responsibilities into specialized classes.
  - Create a `RideFactory` for creating rides.
  - Create a `UserManager` for managing user-related operations.
  - Create a `NotificationManager` for handling notifications.
  - Move ride-related operations to a `RideManager` class.

### Open/Closed Principle (OCP)

**Violation:**
- No apparent violation

**No specific action needed for OCP.**

### Liskov Substitution Principle (LSP)

**Violation:**
- No evident violation 

**No specific action needed for LSP.**

### Interface Segregation Principle (ISP)

**Violation:**
- No interfaces are present 


### Dependency Inversion Principle (DIP)

**Violation:**
- No clear violation


## Refactored Code

The refactored code separates responsibilities into distinct classes, adhering to the Single Responsibility Principle. It introduces a `RideFactory`, `UserManager`, `NotificationManager`, and refines the existing `RideManager` class.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# SOLID Principles Violations and Refactoring

## Single Responsibility Principle (SRP) Violation:

### Violation in Code:
Both `Post1` and `Post2` classes exhibit potential violations of the Single Responsibility Principle.

- `Post1` handles the responsibility of storing and displaying text posts.
- `Post2` class handles different types of posts (text, image, video) and includes display functionality.

### Approach to Fix Violation:
Separate concerns to adhere to the Single Responsibility Principle. Each class or method should have a single reason to change.

## Refactoring for SRP:

### Text Post:

