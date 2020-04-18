# State 

## Definition
Allows an object to alter its behavior when its internal state changes

## Discussion
- large codebases have many if/else blocks
- state pattern allows objects to behave differently based on current state
    - define state-specific behaviors w/ different classes
- code within an application is segregated according to possible states
    - code tracks current state of application
    - tasks are centralized so that the code can be segretated
    - code then responds according to state
- they can be implemented as Singletons
    (They behave this way more often than not.)

## Implementation Details
- POSSIBLE STATE
    - this is an interface that define the methods called when an instance of the CONTEXT is
    owned
    - USUALLY, the methods take an instance of the CONTEXT as a parameter, which is provided
    by the CONTEXT itself.
- STATE CLASSES
    - you'll have one for each state
    - these are concrete implications of POSSIBLE STATE interface
    - states are responsible for triggling state transitions to the "next" state. 
        - typically a state object only knows its "next hop"
- CONTEXT
    - this is the object/class that can be in the various states. 
    - the client code only talks to this class. 
    - methods delegate behavior to current state Object's impl
    

### FLOW
    
### BENEFITS
- reduces cyclomatic complexity
    - too many if/else statements
- supports OpenClosed Principle
    - each of the states are closed for modification, but you 
    can extend the number of states the CONTEXT is capable of being in.
- easily extended
    - its easier to extend if the method contract in the State Interface 
    accepts the Context as a parameter. 


### CHALLENGES
- systems w/ many states will have a large number of objects
    - can be hard to maintain


(If you look at the first examples in the benefts and challenges, you'll
note that there is a tradeoff between long long if/else and too many
state objects)

## Diagram

## Recommended Use
- useful to represent a scenario where an application's state changes
also dictate changes in behavior



