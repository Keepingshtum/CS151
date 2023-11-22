Violations:
Single Responsibility Principle - Post2 manages all of the details regarding text, video, and images. We want to hand those details off to something else.

Fixes:
-Create new manager classes for texts, videos, and images individually and have the post class instantiate them

