# Facade 

## Definition
Facades provide a "unified interface" to a set of interfaces in a subsystem. 

## Discussion
The entire purpose of a facade is to promote simplicity. It creates a hierarchy
of interfaces, such that the facade is a higher-order (closer to the client) 
interface that is easier to use/manage/understand than the underlying 
system. 
- object creation
- ordering of events
- allows users to interact with fewer objects

Multiple layers of abstraction promote different types of decoupling. 
- the individual interfaces hide specific details about the methods they declare
- the facade hide the details of how to use each of the individual interfaces in
order to interact with the system as a whole.

If we consider the point of abstraction in object-oriented programming, we are
trying to separate the "what" from the "how". If I am interacting with 
an API or application that provides certain functionality, I am mostly interested
in the behavior of the objects that make up that application. I'm interested in it
doing the work, without necessarily having to know how. 
(I know there is at least ONE smartass out there that makes the argument of 
time/space complexity, however even in this scenario, we are interested in 
the basic attributes, rather than the details WHEN WE ARE INTERACTING WITH THE API)

For small services, applications, the interface is usually small enough that there
is a minimal amount of coordination required. The developers/users using the
interface are able to do so without any confusion. 

However, for more involved systems, there are many interfaces, collections of 
subsystems with a more complicated grid of dependencies, types of data/formats etc.
In this situation, the management of interfaces requires so much effort that it
requires its own implementation. This is critical concept, because it forces us to
revisit the primitive concept of abstraction. The facade is just a hierarchical 
approach to abstraction to hide  the implementation required to coordinate the
interfaces of complex systems. 

### vs. ADAPTER
The difference between adapters and a facade is often misunderstood. 
- An adapter hides the differences between two interfaces so that the client doesn't have to perform
the translation themselves.
- a facade just simplifies the interface a client interfaces. It isn't changing or
translating anything.

### v.s MEDIATOR
Facades and mediators are also misunderstood. 
- a facade provides one way communication. 
    - client -> facade -> communication, such that the subsystems can't tell the
    difference between the client or the facade (or rather it isn't aware that 
    there is a middleware layer between it and the client.)
- a mediator provides two-way communication between the underlying subsystems. 
    - the mediator and subsystem communicate with each other. 

### CHALLENGES
- by simplifying the customer experience, you may be complicating the development
experience (by adding an additional layer of code to your codebase.)
  - changes to subsystems may require changes in the facade

## Implementatio  Details
The implementation details of a facade are more or less tied to the subsystems, 
however the easiest way to think of it is the following:
- All of the logic in the client, especially if it is complex, convoluted and
verbose, can be organized into functions that aggregate procedural steps.
- we then remove the complex code from the client, and instead have it call
the procedural functions we've placed into the Facade.

Object composition plays a very large part of this pattern. Composition provides
looser coupling and greater flexibility than inheritance/subclassing. 

A very common misconception is that a facade is "an undertaking". This isn't always
true. With planning and a little bit of forethought, a facade can be developed 
without having to create a heavy layer of code.

## Diagram

## Recommended Use
The primary use case for a facade is to abstract the complexity of systems from
the client. By "systems" we mean collections of many objects, types of objects 
such that the coordination of the objects is in itself "an implementation"
