# What SOLID principle is being violated?
Single Responsibility is being violated because
RideManager is in charge of both calculating
the fare and sending a notification
# What is your solution?
Make a new class whose entire responsibility is to
just send a notification