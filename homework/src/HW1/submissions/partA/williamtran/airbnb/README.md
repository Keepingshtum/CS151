# What SOLID principle is being violated?
Dependency Inversion is being violated because
DiscountedHotel relies on Hotel's pricing instead of
its own pricing rate
# What is your solution?
Hotel should be turned into an interface and the
normal rate for Hotel should be defined in a new class
called NormalHotel