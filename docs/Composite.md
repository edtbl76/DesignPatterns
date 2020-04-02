# Composite 

## Definition
The composite pattern constructs trees of objects that represent a part-whole
hierarchy. 
- This allows individual objects to be treated in the same manner as compositions
(or trees) of objects. 

## Discussion
A composite is an object that is built up from one or more similar objects. 
- Each object has similar functionality.
- Composites are "has-a" relationships. 

In addition to constructing a part-while hierarchy (tree), this pattern also
allows the user to access both the composite "branches" of the tree as well as
the individual "leaf nodes".
- This helps reduce complexity.

The part-whole hierarchy allows us to handle the branches (composites) and leafs 
(nodes) in the same manner. 
- makes it easy to add/remove objects from the structure. 

### CHALLENGES
- trying to maintain ordering or sorting requires additional effort. 
- if the objects are immutable, you can't delete any of the members. 
- the patterns works better with simple objects. 
    - special features/components that deviate from many of the other objects
    requires additional (often complex) code to support the implementation.

## Implementation Details
In my example there are three components: 

INTERFACE<br>
This isn't 100% necessary, but using interfaces to separate implementation from usage
is considered best practices, so I prefer it. 
- This actually also makes development easier.
- Yes you can use an abstract class, just remember the difference between the two
when making the decision. 
    - Interfaces CAN provide some logic using the DEFAULT keyword, but you are still
    limited in terms of access modifiers. 
    - Abstract Classes give you implementation in addition to abstract methods that
    must be defined by extended classes. Since we're mentioning "extended", 
    abstract classes are still a "class", so they don't support multiple inheritance,
    which interfaces do. 


OBJECT<br>
There is going to be an object class that represents the leaf node

COMPOSITE<br>
There is going to be an object class that represents the branch. 
The composite has to have some form of collection to track its sub-hierarchy. 
- Lists or Maps tend to be the easiest way to do this, but you can use whatever
you want. 

You will notice that in my implementation, I expressly overloaded the 
add() method w/ an Iterator argument. In the Launcher, I also condensed a lot of the
logic by iterating over the entire tree. 
- This is a very common pattern. Iterators + Composites are a very powerful 
combination of patterns. We can build a tree of objects, and then cycle through
them to perform calculations, data transformations, or even to generate reports. 


One of the most important aspects of implementation that should be considered is
designing the interface. It is very compelling to stuff EVERY method in the interface. 
Be careful here. The KISS principle is extremely critical to defining methods that
should be in the interface when using the composite. The methods must represent
the expected functionality of every object within the part whole hierarchy. There
are absolutely going to be circumstances where the composites and individual objects
have some differences that will be represented in additional functionalities for one
or the other. 

## Diagram

## Recommended Use
- When you need to represent a part-whole hierarchy.