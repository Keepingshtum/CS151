Violations:
Single Responsibility Principle - I could only see the SRP being broken here as far as I understand because everything is managed by the Ride Manager, and all the classes were contained in that file

Fixes:
-Modified RideManger to not handle the messages, created individual file Messenger.java to hand those