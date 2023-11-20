## 1.  Which SOLID principle(s) is this company violating?

Facebook is violating the Single Responsibility Principle and the Open-Closed Principle.

The Post2 class has multiple responsibilites: handing text, image, and video posts. This class has multiple reasons to change, so it violates the SRP.

The Post2 class can't be extended without modifying the code. If I want to add a new type of post such as post with GIF support, I would have to modify the existing class. This violates the OCP.


## 2.  Your approach to making changes to fix the violation.

Split the Post2 class into 4 separate classes: PostImage, PostText, PostGIF (new addition), and PostVideo

Introduced a new interface Post, which is open for extension. Now if I add a new type of post (Post that supports GIFS), I can create a new class implementing the Post interface without modifying the existing Post interface or any of the existing post classes