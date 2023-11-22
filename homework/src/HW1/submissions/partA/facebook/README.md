1) which SOLID principle(s) is this company violating?
This company violates Single Responsibility Principle.

2) Your approach to making changes to fix the violations.
Post2 class violates SRP because it looks 'fat' with multiple sets of related attributes.
Once implemented with methods, such class layout can easily get swamped with multiple methods that function differently on various not-so-related attributes.
I split the class Post2 into classes - Post, Text, Image and Video - each of which can be configured with more specific attributes and methods for further development while also allowing each to either extend a superclass or implement interfaces to provide more enriched features.
