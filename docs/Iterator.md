# ITERATOR 

## Definition
Provide a way to access the elements of an aggregate object sequentially
w/o exposing its underlying representation.

## Discussion
- client objects can traverse a container (collection of objects) to
access its elements w/o knowing how the data is stored. 
    - useful when you need to traverse DIFFERENT kinds of collection objects
    in a STANDARD and UNIFORM way. 
- client can't access/see actual traversal mechanism

- commonly used to traverse nodes of tree hierarchies
    - works well w/ Composite Pattern
- not limited to traversal
    may vary to other requirements

## Implementation Details

ITERATOR
- interface to access/traverse elements

CONCRETE ITERATOR
- implements iterator interface methods
- usually tracks current position in the traversal of the aggregate

AGGREGATE
- interface/ABC that can create an Iterator

CONCRETE AGGREGATOR
- implements Aggregate interface
- returns an instance of the Concrete Iterator

### FLOW
    
### BENEFITS
- you can traverse an object w/o knowing the details
    - universal way of traversing collections w/o having to know
    the differences. 
- traverse collections in different ways
- can provide flexible implementation that allows multiple traversal
paradigms simultaneously

### CHALLENGES
- avoid modification to the collection (should be stable)


## Diagram

## Recommended Use




