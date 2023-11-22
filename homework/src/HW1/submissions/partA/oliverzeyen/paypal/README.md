paypal

violates DIP (D)
PaymentProcessor has a direct dependency on the PayPalGateway class. This violates DIP because high-level modules like PaymentProcessor should not depend on low-level modules like PayPalGateway. Both should depend on abstractions.


changes:

PaymentProcessor now depends on the interface of PayPalGateway to define the functionality.
Added a feature to request money, since you will typically want to also have some sort of communication feature between two accounts.