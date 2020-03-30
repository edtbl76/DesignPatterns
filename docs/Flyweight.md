# Flyweight 

## Definition
A shared object that can be used in multiple contexts simultaneously

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

## Implementatio  Details

## Diagram

## Recommended Use
The use case when you need a large number of objects that are mostly the same
(only 1 or 2 unique parameters, with everything else being common).