**SOLID Principles the company is violating**:

- **Single Responsibility Principle** - The Post2 class is handling three kinds of posts: text, images
and videos. Each class should only have one responsibility.

- **Open-Closed Principle** - The Post2 classes that support images and videos would need to change
the behavior of the first Post2 class intended for text posts for displaying its contents. This 
violates the Open-Closed Principle as classes can have new methods added to it, but existing ones 
should remain consistent.

**Approaches to fix the violation**:
- Splitting the Post2 class into three different classes: TextPost, ImagePost, and VideoPost, each
will now have a single responsibility
- If there was a method in each of the Post2 classes to display the post, it would violate the Open
Closed Principle since it is changing the original one. In the updated code, there is a reusable
Post interface that each class can use to implement displaying the contents of the post.

