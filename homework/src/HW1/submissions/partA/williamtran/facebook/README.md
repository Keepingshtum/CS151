# What SOLID principle is being violated?
Open-Closed Principle is being violated because Post2
changed the display method to be called displayText
# What is your solution?
Change Post to an interface and have a TextPost,
ImagePost, and VideoPost class define how they want
to display