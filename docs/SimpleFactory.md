# SimpleFactory 

## Definition
Create an object w/o exposing instantiation logic to client

## Discussion
Factory is an object that creates other objects
- USUALLY its done as FactoryMethod
- less often you'll use an AbstractFactory (i.e. Factory of Factories)

SimpleFactory is Non GangOfFour
- considered simplest form of factory patterns

## Implementation Details
Factory handler determines the type that needs to be created(based
on parameter) and then creates it. 

- since creational logic may vary, this is separated out of the individual
objects. 

CLIENT
- wants an object... doesn't care how it is created. Just gimme the dang
object!

FACTORY CLASS + FACTORY INTERFACE
- While this CAN be done w/ just a concrete class there are several reasons
to prefer writing to abstraction
    - newly added classes implement interface
    - classes can be accessed polymorphically
    - concrete only implementations require code changes (probably 
    breaking) when you want to integrate new classes
        - this violates the OpenClosed Principle

### FLOW
    
### BENEFITS
- reduce cyclomatic complexity in client code

### CHALLENGES
- deciding which objects to create can become complex as it grows
    - use factory method when that becomes too complex
- adding a new object to create requires modification of the 
create() method in the factory class. 
    - VIOLATES Open-Closed Principle
        (Closed for modification, open for extension)
        


## Diagram

## Recommended Use


