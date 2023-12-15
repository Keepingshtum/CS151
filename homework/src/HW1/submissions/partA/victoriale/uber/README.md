**SOLID Principles the company is violating**:

**Single Responsibility Principle** - Classes should have a single purpose. The RideManager class deals
with two: calculating the fares and sending notifications.

**Approaches to fix the violation**:
- Added another class called NotificationManager to focus on sending notifications
- RideManager now only deals with calculating the fare