### (1) Violated SOLID Principles
This company violates the **Single Responsibility Principle**. This is because RideManager handles both fare calculations and also notifications.

### (2) Violation Fixes
To fix this principle's violation, we can split the responsibility of RideManager up.

Not strictly related to the Single Responsibility Principle, but we can also split the Ride and User classes into different files to allow for greater modularity in terms of access levels.