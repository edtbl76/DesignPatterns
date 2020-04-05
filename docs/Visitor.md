# Visitor 

## Definition
Visitors are used to separate algorithms/business logic from the object structure on
which it operates. This allows us to add new operations/functionality to 
existing object structures/families without modifying those structures/families. 

## Discussion
The purpose of this pattern is to provide new ways to DoAThing to the object, 
without having to muck around with existing classes. 
- This actively supports the open-closed principle (extension yes, modification no)

An important concept of Visitors is that they are typically built to support
a specific hierarchy of objects.

### CONS
- this pattern ignores encapsulation, so we are most likely going to "break" the OOP
principle of encapsulation. This shouldn't cause an uproar. This is ultimately a 
tradeoff. 
    - we are trading isolation of lifecycle pace for the value of encapsulation 
    because object stability in A GIVEN CASE is a requirement. 
        - in these cases, the only solution is to remove the heterogeneous behaviors
        and use a visitor so that the methods (behaviors) can evolve without causing
        issues with the objects themselves. 
    - The visitor pattern is extremely powerful in transitioning systems where the
    modeled objects are predominantly stable, but functionality is in flux to do
    migrational efforts. 
    - If functionality stabilizes to a point where the life cycle of added 
    functionality begins to approach the same pace as the object themselves, then
    it might warrant refactoring to a different pattern at a later date in order
    to preserve or regain encapsulation boundaries if there is a business use case 
    for it. 
### Complexity
- There is a lot of confusion about visitors using overloading vs using different
method names inside the Visitor interface/abstract base.
    - If you look at my examples, I selected overloading, because it makes more sense
    to me to provide the concept of centralized functionality that supports many
    different objects. 
    - to others, they will create a different method name for each object. That feels
    wrong to me. 
- my launcher uses a container to store the data in order to operate. This isn't 
necessary, I'm just doing it out of habit, because they company I work for uses a
concept like this for the time being. 


## Implementation Details
OBJECT<br>
There is more than likely going to be an object that is interface/impl. This is
the target of the work being done. The object itself is typically going to be fairly
lightweight. 
- it will usually have an acceptor, which takes the Visitor object as an argument. 
- inside the acceptor, the object calls the task you want the Visitor to perform, passing
"this" (a reference to the object itself) back to the visitor. 

VISITOR<br>
The visitor is likewise usually represented by an interface/impl relationship. The
Visitor can be a single method, or a collection of many methods. In most cases
it will be constrained to accept a specific type of object or the root of a hierarchy
of objects. 

## Diagram

## Recommended Use
This pattern is extremely useful for objects who require operations/tasks that are
going to change very often. 
- The isolation of "changes-a-lot" from "changes-a-little" is a desirable trait.

The "plugin/pluggable" use case is one of the most common
- If we need to add new tasks/functionality to objects w/o changing the corresponding
classes, this is precisely what the visitor pattern is used for. 



