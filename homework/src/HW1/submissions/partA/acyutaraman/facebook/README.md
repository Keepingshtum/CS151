
1) This class violates the Dependency Inversion Principle because of how it doesn't have any abstract interfaces to base the Post1 and Post2 off of. If you were to make the Post1 class
the superclass of Post2, Post2 would still be able to access methods from Post1 that it shouldn't be accessing. In this scenario, that would lead to a violation of the Open/Closed principle.

2) I fixed this by creating an abstract interface called Post that both Post1 and Post2 implement. The Post interface has one method called display, which is implemented differently in
Post1 and Post2. I added getter and setter methods for the text in Post1. For the display method in Post1, it just prints out the text in the post. For the display method in Post2, It returns the video url and the text in separate lines if it is a video post, it returns the image url and the text if it is an image post, and it returns just the text if it is neither a video post or an audio post.  
