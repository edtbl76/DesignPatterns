# Bridge 

## Definition
"The decoupling of an abstraction from its implementation so that the two can
vary independently"

## Discussion
I placed that definition in quotes because I'm citing it from pretty much every 
design pattern book ever written. 

This pattern has had a number of different names. It is very well-travelled in 
API design. 

Separating an abstraction from its implementation is more than just creating an 
interface/abstract class. The bridge pattern assumes we've already done that. 

Here we are more or less allowing them to grow separately into two completely different
object hierarchies. 
- the abstraction is subclassed into "refined abstractions"
- the implementation is subclassed into "concrete implementation"

So where does the bridge come in? It's the glue code we create that connects the
abstraction and the implementation. 


## Implementation Details

## Diagram

## Recommended Use
The main purpose of using the bridge pattern is to create "more distance" between 
an abstraction and its implementation so that they may vary independently. 
- This primarily means that a change in one should NOT break the other. 
- This is EXTREMELY critical to API design. The endpoints of an API are documented
and publicized. Customers rely on the quality and stability of that API for their
livelihood. Breakages in the API are damaging to a companies reputation (which hits
them in the pocket book.)
    - Telling developers that they can't "change" anything isn't going to fly, so
    the bridge pattern allows refactoring and redesign to happen within the
    implementation/underlying runtime without impacting the abstraction (the
    endpoints and interfaces being presented to paying customers.)