doordash

violates SRP (S)
Clear reasoning is the "and" in the fooddeliveryandtrackingservice class. One class is responsible for both delivering the food, as well as tracking the food. Those are two very complex jobs that in a high level implementation things would get extremely messy. It is best to separate things, and we can do so simply and allow for better implementation.

violates ISP (I)
When we separate things, we also have to change our interface, as the interface as it was, had given the class too many responsibilities. This is more of the effects of solving a part of SOLID, rather than a clear intial violation.

changed:

Not the best implementation but it definitely gets the idea across.
    1. Separate both the interface and class that handles delivery and tracking into two
    2. Create a OrderManager class that can now combine the two.
    