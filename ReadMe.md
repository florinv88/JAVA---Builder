## JAVA DESIGN PATTERNS - BUILDER

#### Builder it's a structural design pattern 
Why is this usefully ? 
- Allows us to create instances using a more readable syntax. This helps a lot when you have many fields on a class . 
- Another advantage it's that we don't have to create constructors for every combination of the fields

How we can create a builder for a class ?

- The builder it's a nested class that has methods for every field of the parent class
- The builder has a special method ".build" that returns a new instance of the parent class with the properties set by the methods that have been called

LOMBOK

- Lombok allows us to create a builder just using the @Builder annotation 
