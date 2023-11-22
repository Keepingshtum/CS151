# 'PayPal' Violation of SOLID

This code violates the "D" in SOLID, which stands for Dependency Inversion Principle.
<br />
<br />
It officially states that "High-level modules should not depend on low-level modules. Both should depend on abstractions."
In this case, the 'PaymentProcessor' class depends directly on the 'PayPalGateway' class.
Hence, it makes it difficult to test the 'PaymentProcessor' class just by itself and update the 'PaypalGateway' class in the future.
<br />
<br />
A better design approach for this is to introduce abstraction for the 'PaypalGateway' class.
<br />
<br />
Lets start off by creating an interface called 'PaymentGateway' and define a single method called 'processPayment()':
```
public interface PaymentGateway {
    public void processPayment(Account account, double amount);
}
```
Now, lets update the 'PaymentProcessor' class to depend on the 'PaymentGateway' interface:
```
public class PaymentProcessor {
    private PaymentGateway paymentGateway
    
    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    
    public void processPayment(Account account, double amount) {
        paymentGateway.processPayment(account, amount);
    }
}
```
Now, lets update the 'PayPalGateway' class so that it implements the 'PaymentGateway' interface:
```
public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }
}
```
Now, lets update the 'Main' class to pass a new instance of the 'PayPalGateway' class to the 'PaymentProcessor' constructor:
```
public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        Account account = new Account("1");
        paymentProcessor.processPayment(account, 100.0);
    }
}
```
After making the following changes, the code now adheres to the Dependency Inversion Principle of SOLID.
<br />
<br />
We have a Main class to test the new code. It should produce the following output:
```
Processing payment of $100.0 for account 1 using PayPal.
```