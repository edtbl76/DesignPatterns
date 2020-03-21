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

### INTERFACE 
If you have several representations that each have completely different implementations, you'll have to use an interface, 
with entirely different ConcreteBuilders for each representation. 

However, if each representation only varies slightly, in some areas, you might be able to provide a default 
implementation for some methods or fields. This is when an abstract class becomes useful because it allows you to 
consolidate some of the work required to build up ConcreteBuilders, such that they will only @Override the default
implementation if the use case requires it.

You don't HAVE to use abstract classes to provide default implementations. This can be accomplished in an interface 
using the DEFAULT keyword (which allows you to provide an implementation)

WHEN TO USE INTERFACES: <br>
- multiple unrelated classes are going to implement the interface
- we can specify the behavior of a data structure, but the implementation details are left up to someone else
- multiple inheritance is required. 

WHEN TO USE ABSTRACT CLASSES: <br>
As mentioned above, an abstract class becomes useful if you need to provide a default implementation. However, 
Oracle generously provides guidelines in which abstract classes should be preferred. 
- you need to share code among several closely related classes. 
- classes that extend the abstract class can
    - have MANY common methods/fields
    - require non-public access modifiers
- your use case requires non-static + non-final fields that can access/mutate the state of the object they are contained in.



CONCRETE BUILDER <br>
- these are implementations of the Builder, so they must implement the interface. 
- we need 1 class for each type of representation we'll need to create. 
- This is one of the major PROS of the Builder pattern (and interfaces in general), we can provide a different 
implementation for different use cases. 

DIRECTOR<br>
- The director knows how to assemble the complex object. I.e. it is responsible for instantiating the builder object
and executing the necessary steps to instantiate each representation of the Complex Object

### PROS
- Some complex objects require a substantial amount of procedural/tedious setup. The builder pattern encapsulates
the construction sequence (via the Director) and the implementation of varying representations (via 
ConcreteBuilders). 
    - this pattern reinforces good OOP practices by removing unnecessary details from objects/components that don't 
    require this information in order to be used. This simplifies code and provides terse syntax for readability.
    - separation of concerns provides a "fine tune" knob over the creation of objects, providing a greater degree of 
    flexibility and extensibility.
- The Director is usually designed so that it can return the final result when construction of the ComplexObject has
been completed. 
    - "Go do your thing, and just give me the final result."

### CONS
- The pattern doesn't work very well with mutable objects. 
- The pattern can suffer from issues when trying to duplicate some of the steps under certain circumstances. 
- If you have MANY different representations, you'll likewise have MANY different ConcreteBuilders. 


## Diagram

## Recommended Use
- The best use case for the Builder is for creating extremely complicated objects, but keep in mind that this can
become very tedious if you have a large number of different representations to support through this pattern. 
  