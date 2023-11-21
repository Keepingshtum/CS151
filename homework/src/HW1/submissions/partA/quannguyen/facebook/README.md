Facebook
1. Which SOLID principle(s) is this company violating?
- In the Facebook company, two SOLID principles this company violates are Single Responsibility Principle and Open-Closed Principle.
- The ‘Post2’ class has to do more than one job. It is creating instances of different types of posts (text, image, video) and also for displaying them.It would be better to handle these jobs separately. It violates SRP.
- If I want to add a new type of post for example I want to add audio post in ‘Post2’ class, so I need to modify the ‘Post2’ class so it is not reusable. It violates OCP
2. Your approach to making changes to fix the violation.
- Create four new classes named ‘AudioPost’, ‘ImagePost’, ‘TextPost’, and ‘VideoPost’ to handle their own job.  
- By creating the ‘PostDisplay’ interface, I can easily add new types of posts by implementing the ‘PostDisplay’ interface without modifying the existing ‘Post2’ class. 
- These four post classes now implement the ‘PostDisplay’ interface and are responsible for its own display logic.
