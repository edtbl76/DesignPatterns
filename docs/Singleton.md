# The Singleton

## Definition
- A class can only have one instance
- It must have a global access point

## Discussion
- useful when a class can't have multiple instances
- this is a global SHARED instance
    - prevents proliferation of objects
- easy to maintain

## What the Example Code Covers
    
EAGER vs. LAZY (Examples 1 and 3)
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

### Nested SingletonHelper (aka Bill Pugh Method) (Example 4)
This is a popular Solution to the problem introduced in Example 3
- By using an inner nested class as the "global access" point associated with
the object "getter", we are able to separate the instantiation of the Singleton object from any static
methods inside the class. 

This prevents the unnecessary storage & time resources associated with
an eager implementation.

NOTE: This is a non-thread safe, lazy init version.

### DOUBLE-CHECKED LOCKING

## Implementation Details
- class needs to be final in order to prevent any subclassing
    - This is especially important to prevent extension by nested inner class
- private constructors prevent the use of "new", which disallows any
dynamic instantiation of the object. 
- Nested Inner Classes can be used to separate static methods in the Singleton
class from the instantiation of the object itself. 
    - this prevents unwanted resource usage and setup when accessing
    methods
- in concurrent systems, if there is a risk of a race condition when
building a Singleton, consider deferring the use of "synchronized" internal
to the global access point on the first time creation of the object (This
is called Double Checked Locking)
    - this reduces the unneccessary overhead of using blocking code for i
    subsequent uses of the Singleton

## Diagram
//TODO insert diagram here.

## Recommended Use
- "centralized" structures (single throat to choke)
- common "files" (Logging, Lookup)
- maintain thread pools in multi-threaded systems.
- caching
- device drivers

