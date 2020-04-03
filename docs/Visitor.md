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

Plugins use this pattern quite a bit with APIs
