# Prototype

## Definition 
- Create an instance that represents the type of objects that we need to create
- create new objects by copying the initial instance. 

## Discussion
- copying/cloning existing objects is usually faster/cheaper than building
them from scratch
- Object.clone() is a comparable concept to prototype. 
    - NOT ALL PROTOTYPES have to use clone...
- useful in reducing boilerplate/complex code when instantiating objects

NOTE: implementation/support of cloning mechanisms aren't pervasive
- not all objects support cloning
- circular references prevent cloning.
 
## Diagram
// TODO fill out a diagram

## Implementation Details
- Prototype must implement Cloneable
- you must extend the Prototype 

- clone() only provides a shallow copy. <br>
NOTE: This provides intentional advantages in the Prototype pattern.

### SHALLOW COPY (aka FIELD-BY-FIELD)
- creates a new object
    - copies each field and its value from the source object to the new object. 
    - if a field is a reference, then a new reference to the referenced
    object is created in the cloned object.
    
One way to think of this is that a "shallow" copy only copies the highest
layer of information from an object, which are the explicit fields. 

When we "copy" a reference, we aren't copying the underlying object. This
means that two instances of cloned objects will each have references to
the same object. 

PROS: <br>
- This is the "cheapness" aspect of using Prototypes. If prototypes need
to share an object/data (Singleton-like), it is much easier to simply 
create one object, and have multiple references to that object. 

CONS: <br>
- The downside to this is that if we delete the underlying object, we are
left with a dangling reference to that information in the models that hold
a reference to it. 

### DEEP COPY 
A deep copy can be far more expensive than a shallow copy depending upon on
how many references an object holds to other objects (and whether or
not there are transitive references of those references.)

Instead of creating a reference to a shared object, a deep copy will create
an entirely new object (copying in the data at that time) for each 
reference. 

PROS: <br>
- This creates isolation between objects, so that changes to one have no
impact on the other if it is accidentally deleted. 
- data in each clone can vary independently (Although this is a poor
way of implementing it.)

CONS: <br>
- As mentioned, it can be more expensive, leading to performance issues
(latency/storage), but it also makes it challenging to manage 
multiple clones if we intend
- it can be challenging to maintain data consistency between separate 
objects (which is one of the advantages of shallow copy) 

### SHALLOW vs. DEEP
Superficially, the use cases have traditionally been:
- use shallow for objects w/ primitive fields
- use deep for objects w/ many references. 

As mentioned above in the pros/cons there are other advantages to 
Prototype worth considering in context of data sharing.

## Diagram
//TODO insert diagram here.

## Recommended Use
- reducing boilerplate/complex object instantiation
