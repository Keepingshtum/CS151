Paypal
1. Which SOLID principle(s) is this company violating?
- In the Paypal company, two SOLID principles this company violates are Single Responsibility Principle and Dependency Inversion Principle
- In the ‘PaymentProcessor’ class, it has to do two jobs, one is managing the PayPal gateway and another job is processing payments. It violates SRP
- The 'PaymentProcessor' class directly depends on the ‘PayPalGateway’ class, making it hard to extend or replace the payment gateway in the future. It violates DIP 
2. Your approach to making changes to fix the violation.
- Created an interface ‘PaymentGateway’ to adhere to the Dependency Inversion Principle.
- Created a separate ‘PayPalProcessor’ class implementing the PaymentProcessor interface.
- Added a new method for refund in the ‘PaymentGateway’ and implemented it in the ‘PayPalGateway’.
