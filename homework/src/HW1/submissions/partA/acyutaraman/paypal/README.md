
1) Paypal violates the Dependency Inversion principle because of how it lacks an interface/ abstract entity as a base entity. It just has a PayPalGateWay object used in PayPalProcessor,
without any inheritance or abstraction involved.

2) I fixed this violation by making the PayPalGateWay an interface with the abstract method processPayment. I then had the PayPalProcessor class implement the interface, and had
the default processMethod() method print out the original line that was supposed to be printed out. I added functionality in the sense that I overloaded the processMethod() method.
The original one takes in only the account and the amount, and prints out a line.  I added a new version of that method that takes in the account, the amount, and the balance. This
new version prints out an error message if the amount(for the payment) is greater than the balance in the user's account. 
