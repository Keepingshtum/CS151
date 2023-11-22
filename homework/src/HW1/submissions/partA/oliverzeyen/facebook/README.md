facebook

post 1 violates the open closed principle (O)
It has such limited functionality that it makes modifying it very difficult.

post 2 vioaltes the single responsibility principle (S)
In complete contrast, post2 has way too many things that it needs to handle, which ends up making things a mess.

The two posts, are either bone dry and like a rock which makes it hard to modify, or is a complete mess and tangled which makes it harder to manage. They are both weirdly named which im sure was for the sake of the homework.

changes:

1. Very simply, we can separate each post into it's own type. This makes it so a text post wouldn't have to deal with video urls.
2. Add a post for each type of post that can be made.
