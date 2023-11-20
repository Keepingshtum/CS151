### (1) Violated SOLID Principles
This company violates the **Liskov Substitution Principle**. This is because we can't use the child (DiscountedHotel) where we've used the parent (Hotel) without unexpected/unforeseen behavior, such as in the case where someone may not have visibility to both calculateTotalPrice() implementations.

This company may also violate the **Single Responsibility Principle** because Hotel carries responsibilities (calculateTotalPrice) expected to be carried by some other class such as BookingService. In this context, Hotel should intuitively serve as representation for the Hotel itself rather than its booking implementation.

### (2) Violation Fixes
To fix the **Liskov Substitution Principle** violation, we can create an interface class so that both Hotel and DiscountedHotel can compose a common interface.

To fix the **Single Responsibility Principle** violation, we can use a separate class to handle price calculations rather than leaving this responsibility to Hotel or DiscountedHotel