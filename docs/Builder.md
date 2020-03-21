# Builder

## Definition
- used to separate the construction(implementation) of a complex
object from its representation
    - allows the same implementation details to be leveraged to
    create different representations.

## Discussion
- One of the main uses of the Builder pattern is to isolate the "creational"
aspect of the object from the multiple moving parts of the object
    - it has to remain abstract from the components so that it can support
    the creation of multiple different representations

## Implementation Details
COMPLEX OBJECT<br>
- this is the target of the Builder pattern. It is the object we want to create.

BUILDER <br>
-  interface that provides the generalized methods that should be implemented in order to create "a" representation
of the complex object we want to create

CONCRETE BUILDER <br>
- these are implementations of the Builder, so they must implement the interface. 
- we need 1 class for each type of representation we'll need to create. 
- This is one of the major PROS of the Builder pattern (and interfaces in general), we can provide a different 
implementation for different use cases. 

DIRECTOR<br>
- The director knows how to assemble the complex object. I.e. it is responsible for instantiating the builder object
and executing the necessary steps to instantiate each representation of the Complex Object




## Diagram

## Recommended Use
- creating complex object that have multiple components
