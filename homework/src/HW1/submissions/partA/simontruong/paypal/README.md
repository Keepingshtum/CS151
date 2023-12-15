Violatons:
Dependency Inversion Principle

Fixes:
-Created interface Processable.java to handle possible other gateways that may link other than just from PayPalGateway.java,
removes dependability on PayPalGateway as a concrete class.
