# Flyweight 

## Definition
"A shared object that can be used in multiple contexts simultaneously. 
The flyweight acts as an independent object in each context - it's indistinguishable
from an instance of the object that's not shared"

## Discussion
The purpose of a flyweight is to act as an independent object in each context
(i.e. its indistinguishable from an instance of the object that's not being 
shared.)

Since most of the flyweight object is common across all instances, it economizes
resources (like memory usage!) by sharing data among the common attributes w/
similar objects. 
- this supports fine-grained usage with minimal cost. 

### EXTRINSIC and INTRINSIC STATE

INTRINSIC<br>
- state that is stored/shared inside the flyweight object itself. 
- independent of flyweight's context
- it is recommended to make intrinsic state immutable.

EXTRINSIC<br>
- varies with flyweight's context
- CAN NOT BE SHARED
- typically maintained by client (or client-facing) objects
    - it needs to be passed to the flyweight or less commonly it can be
    computed on the fly 


### CONS/CHALLENGES
- In concurrent systems, the flyweight is subject to the same profliferation as 
other patterns (such as singletons). 
    - the concurrency options are typically costly as well.
- The flyweights require configuration which might incur a performance hit as well
as require additional maintenance 
- During the design phase, in order to create flyweights you have to be able to 
decompose a common "template" from all of the heavier objects. 
    - this template is always an intuitive boundary, which may lead to difficulties
    in supporting/debugging


## Implementation Details
To provide implementation details, it is easier to start with the initial problem. 
In our Launcher "example", we have code that needs to use 12 "heavy" objects. 
(We'll pretend they are heavy and are going to use up a massive amount of memory.)

- In order to implement a Flyweight, we need to map out the data being used by the
objects. 
- If the objects are very similar, with only slight variance, we can use Flyweight.
- If the objects are very different, we'll more than likely need to come up with
a different pattern (or find a way to make them similar)
(NOTE: I've seen the latter done with adapters.. as a last resort.)

The attributes that are similar across each of the implementations become the
immutable SHARED (or intrinsic) states of the flyweight objects. 
(This behavior is often compared to the Singleton pattern. It's close, but it is
performed at a lower level of the object.. i.e. with its attributes, rather than
with the object as a whole)
- NOTE: not all flyweights have to have shareable components. (However in order
for the pattern to be useful, it's likely that they will.)

- Extrinsic data is left up to the client. This is the information that varies
between objects. 

In my particular example, we simplified the design by providing a factory that 
creates the flyweight objects. (This is typically recommended in order to 
ensure we have fine-grained control over the intrinsic vs. extrinsic state.)
- The use of a "FlyweightFactory" provides an added benefit to the pattern which 
is to centralize state management of many objects. 


## Diagram

## Recommended Use
The use case when you need a large number of objects that are mostly the same
(only 1 or 2 unique parameters, with everything else being common).
This has two positive side effects in complex systems
- reduce duplication of code/"incomplete" objects (i.e. by sharing the attributes of frequently 
used similar objects)
- reducing the duplication also leads to reducing memory usage (which is typically
something that we want to do.)

