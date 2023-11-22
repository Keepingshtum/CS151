I introduced a PaymentGateway interface to abstract the payment processing functionality.
The PayPalGateway class implements the PaymentGateway interface.
The PaymentProcessor class now depends on the PaymentGateway interface 
instead of the concrete PayPalGateway class, adhering more closely to the 
Dependency Inversion Principle. This allows for easier extension with other 
payment gateways in the future.