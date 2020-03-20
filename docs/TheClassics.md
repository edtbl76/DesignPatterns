# The Classics
By the classics, I'm referring to the patterns introduced in the 1994 book
"Design Patterns: Elements of Reusable Object-Oriented Software" by the "Gang of Four"
(Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides)

*** 
## The Singleton

### Definition
- A class can only have one instance
- It must have a global access point

### Discussion
- useful when a class can't have multiple instances
- this is a global SHARED instance
    - prevents proliferation of objects
- easy to maintain

### Details
- Uses a private constructor so that the class can't be instantiated
    - restricts creation of an additional instance of the class
    - cannot be inherited (i.e. no subclasses)
    - constrained point of entry allows multiple references to a single
    instance
    
EAGER vs. LAZY
- Eager is more straightforward/cleaner code
- Eager is thread safe by default. 
    - using an accessor is going to retrieve the instance that was
    instantiated when the class was loaded. 
- Lazy requires the synchronized keyword to become thread safe
    - we are instantiating the object at the time we call the
    accessor
- Lazy initialization allows applications to start faster, by deferring
the creation of a objects until they are going to be used
- Eager initialization allows applications to perform better at runtime
because the eagerly loaded objects are already in memory

NOTE: This is a balancing act. 

### Diagram
//TODO insert diagram here.