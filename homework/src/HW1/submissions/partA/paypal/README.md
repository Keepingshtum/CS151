1) which SOLID principle(s) is this company violating?
This company violates dependency inversion principle because the high-level module, PaymentProcessor, depends on low-leel module, PayPalGateway. Both these modules should depend on such an abstraction as an interface.

2) Your approach to making changes to fix the violation
An interface PaymentProcessorService was created, which is implemented by classes PaymentProcessor and PayPalGateway so that details can be implemented in low-level classes while guidelines can be designed within the interface.
In addition, class PayEntity was also added with method process(...) to process payment through any class implementing PaymentProcessorService interface.
Finally, in the Main class, the code is cleaned out by using only an object of PayEntity class to process payment through objects of multiple classes implementing PaymentProcessorService interface.