**SOLID Principles the company is violating**:

- **Dependency Inversion Principle** - PaymentProcessor depends on PayPalGateway. Higher classes
should depend on an abstraction of a class.

**Approaches to fix the violation**:
- To resolve the Dependency Inversion violation for this package, a PaymentGateway interface was
created for PayPalGateway to implement. Instead of depending on PayPalGateway, it will now depend
on PaymentGateway, which is an abstraction of it. If more gateways are created, they can then 
implement the PaymentGateway Interface and it will abide by the Dependency Inversion principle.


