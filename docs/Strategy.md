# Strategy 

## Definition
Allows an algorithm vary independently from the objects/clients that use it

## Discussion
- allows client to dynamically select from many types of algorithms based on need
- algorithm is removed from object, and placed in a separate class. 
- composition > inheritance
    - instead of overriding parent class behaviors, its recommended that
    the behaviors are placed in the separate concrete strategy classes that share a 
    common interfaceo
    - subclassing is very tightly coupled, such that it is "harder" to dynamically
    define intended objects at runtime. (which is desirable)
    
- client class decides which algorithm to use
    - the context object doesn't 
- context object contains reference variables for the strategy object's interface type
    - you can obtain diff behaviors by changing the strategy in the context.
        
3 best practices that Guide us to use Composition > Inheritance
- Separate code that varies from code that doesn't
- maintain code w/ high churn as "freestanding as possible"
- reuse code as much as possible

Applying this to Strategy
- composition of objects makes them attributes (i.e. has-a) of an object, increasing
the flexibility, as well as removing coupling created by subclassing. (i.e. there
is no enforced contract between the owning object)

- this allows us to remove the churn (in this case the cyclomatic complexity of
which algorithm to choose) and encapsulate it into 1 or many objects that we can use
or access polymorphically (at runtime!!!!) without needing to  change those implementations
or my own. 

### BENEFITS
- allows classes and algorithms to vary independently
    - class delegates algorithms to strategy object (responsible for encapsulating
    the algorithm)
    - this is done at RUNTIME. 
    - algorithm choice isn't bound at runtime
- easier maint. of codebase
- easily extendable

### CHALLENGES
- addition of context classes can result in more objects/proliferation 
- clients/users must be AWARE of the different strategies. 
    - tight coupling between client code and impl of different strategies
- intro of new behavior/strategy may result in changes to client code. 

## Implementation Details

CONTEXT
- object that uses the strategy pattern.

STRATEGY
- a class that encapsulates an algorithm separate from the objects it will work on

## Diagram

## Recommended Use




