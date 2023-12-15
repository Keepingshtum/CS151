### (1) Violated SOLID Principles
This company violates the **Dependency Inversion Principle**. This is because the higher-level PaymentProcessor depends on the lower-level PayPalGateway, where they should not in order to satisfy this principle.

### (2) Violation Fixes
To fix this principle's violation, you could loosen PaymentProcessor's dependency on PayPalGateway by altering the way in which PayPalGateway is fed to PaymentProcessor to allow for greater substitution flexibility.