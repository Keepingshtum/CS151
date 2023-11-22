# What SOLID principle is being violated?
Dependency Inversion is violated because 
PaymentProcessor relies directly on PayPalGateway
when it doesn't need to
# What is your solution?
Change Gateway to an interface so it is replaceable
if needed