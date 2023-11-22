uber

violates SRP (S)
Ride manager has so much to keep track of and handle (i.e. send notifications and calculate rides) that it's a big spaghetti mess. We need to separate each into their own purpose.

Changes:

Separated each purpose into it's own class, added interfaces for said important classes, and added a new feature of UberHelicopter as a possible option.