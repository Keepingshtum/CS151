## 1.  Which SOLID principle(s) is this company violating?

PayPal is violating the Dependency Inversion Principle and the Open-Closed Principle.

The class PaymentProcessor is depending on the concrete class PaymentGateway to process payments. This violates DIP. Multiple classes is also depending on the concrete class Account, which violates DIP.

If I were to add a new function such as a request payment for example, I would have to modify the existing classes as the current classes aren't easily extendable for supporting more functions without modifying the existing code. This violates OCP.


## 2.  Your approach to making changes to fix the violation.

Added an interface PaymentForPayPal so that the PaymentProcessor class depends on the PaymentforPayPal interface.

Adding the interface also allows for the classes to be easily extended without changing the current classes.

Renamed the Account class to AccountImpl and made an interface Account so that the classes can depend on the Account interface.