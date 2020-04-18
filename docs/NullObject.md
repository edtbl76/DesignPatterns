# NullObject 

## Definition
Object w/ no referenced value or w/ defined neutral/null behavior
(From PLoP - Pattern Languages of Program Design)

## Discussion
implements a do-nothing behavior or a default behavior when an 
app encounters a null object instead of a real one. 
- the purpose of the pattern is to create better solution of handling
null (and NPE) through "null checks" or "null collaboration checks" used
in if blocks. 

The solution is to ENCAPSULATE the absence of an object by providing
a default behavior that does nothing.

## Implementation Details
- does/stores nothing.

Since it stores nothing and does nothing, it is typically a very 
lightweight object. As a result, it makes sense to create an EAGER
instance of a SINGLETON. 
- saves memory. 
- it's also likely that there will be a lot of null cases, or other
use cases that would make use of the object. sharing that object makes
more sense than creating new objects. 

### FLOW
    
### BENEFITS

### CHALLENGES
- sometimes NPE debugging is necessary or more intuitive than using
Null Objects
- challenging to make the pattern appropriate for every object in 
a system. 
    - you still may end up w/ many different categories of a null
    object, which can get expensive, even when using Singleton
- incorrect implementation creates complex semantic defects to debug

## Diagram

## Recommended Use
- avoiding NPEs
- removing null checks
    - cleaner code


