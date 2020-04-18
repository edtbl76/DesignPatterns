# Mediator 

## Definition
Defines an object that encapsulates HOW a set of objects interact
- loose coupling by keeping objects from referring to each other
explicitly
- allows their interactions to vary independently from the objects 
themselves

## Discussion
- this pattern introduces a "middle man" that takes control of
coordinating/controlling the interactions of a set of objects that
can not (or should not) refer to each other explicitly

## Implementation Details

MEDIATOR
- defines the interfaces to provide communication among "COLLEAGUES"

CONCRETE MEDIATOR
- maintains list of COLLEAGUES
- impls contract from MEDIATOR
- coordinates comms between COLLEAGUES

COLLEAGUE
- interface that defines communication amongst CONCRETE COLLEAGUES

CONCRETE COLLEAGUES
- concrete impls of COLLEAGUE interface that communicate w/ each other
through the MEDIATOR



### FLOW
    
### BENEFITS
- reduces number of interconnections among different objects
    - simplifies communication
    - promotes loose coupling
    - reduces dependencies
        - (simpler deployment/development)
    - reduces/eliminates subclasses
        - (composition > inheritance)
    - replace many-to-many relationships w/ one-to-many relationships
        - easier to read/understand
        - simpler maintenance
    - "single throat to choke"

### CHALLENGES
- makes proper encapsulation challenging to implement
- MEDIATOR object can become complex if there is too much logic
    - "God/Deity class"
- maintainance can be challenging

## Diagram

## Recommended Use



