### (1) Violated SOLID Principles
This company violates the **Single Responsibility Principle**. This is because Post2 (and also arguably Post1) have multiple responsibilities. For example, Post2 handles every single part of itself, such as displaying videos, text, etc.

This company also violates the **Open-Closed Princple**. This is because if one part of the post's implementation (i.e. video) needs modification, the whole class needs to be modified.

### (2) Violation Fixes
To fix both principles' violations, we can simply split up the responsibilities for each type the post (e.g. Post for Video posts, Post for text posts, etc)