# Adapter 

## Definition
Adapters are used to convert the interface of a class into another interface that
is expected by clients (usually due to the inability to modify one interface or
the other)

## Discussion
The easiest way to discuss the case of adapter/facade/wrapper is to consider a two-part
application. Ignoring the logistics (Backend vs. FE, or DB vs UI), all we need to know is
that part A needs to speak to part B for 'some' reason.

(If you struggle with that abstraction, then go ahead and think of one of them as
a UI and the other as a data store, but I'll caution you that this will also 
abstract other use cases away from your understanding of the pattern)

Maybe one of those parts is a third party resource that doesn't match the interface
of the other part. Maybe you have to change a compatible system for an incompatible
system for some reason? 

In either scenario, the use case for adapters comes up when we have two 
parts that store objects in a different manner such that we introduce a middle-man
type object that takes the output of one object and transforms it into an input
that the other object can understand.

## Implementation Details

### OBJECT ADAPTERS
Object Adapters use object composition to perform the adaptation. 
- the adaptee class needs to implement the TARGET interface (i.e. we
are adapting TO the interface/abstract class)
- mention the class you are adapting FROM (i.e. the adaptee) in the constructor 
and store a reference from it in the instance variable. 
- override the interface methods to delegate the methods of the class you are
adapting from (i.e. the adaptee)

#### "Classic Adapter (Concrete)" 
ADAPTEE<br>
the adaptee is the object that communicates with the client.

TARGET <br>
This is the object that communicates with our central business logic

BUSINESS LOGIC <br>
This is an object w/ function(s) that perform work on our TARGET the inputs of that 
TARGET. 

ADAPTER <br>
The adapter receives input in terms of the ADAPTEE and manipulates those inputs so that
they align with the expected inputs of the BUSINESS LOGIC (in terms of the TARGET)
- this is usually achieved by manipulating the inputs themselves, and passing 
the munged inputs to the target on its own terms. 
- the adapter almost always holds an instance of the ADAPTEE


#### "Interface Adapter"
TARGET INTERFACE<br>
provides method contract for target object

CONCRETE TARGET <br>
fulfills method contract of interface, in terms of the "target inputs"

ADAPTEE INTERFACE<br>
provides method contract for adaptee object

CONCRETE ADAPTEE <br>
fulfills method contract of interface, in terms of the "adaptee inputs"

ADAPTER<br>
The adapter achieves the same result as the Classic case, but it does so by implementing
the interface of the TARGET and composing an instance of the ADAPTEE. 
- This method is often achieved by calculating values directly in the adaptee and
then returning the results to the target interface. 
- The advantage of this method is that there is minimal additional logic or latency
introduced by potentially expensive computations to convert one type of data to 
another. We are simply rewiring the implementation to the abstraction. 


Both methods have advantages, but the latter provides much more flexibility because
the interface isolates the implementation from the client code. It is much easier to
create a flexible set of options for adapting many types of inputs easily while
creating fully functional objects.  

### CLASS ADAPTERS
Class adapters adapt through subclassing and typically use multiple inheritance. 
- This requires interfaces in Java. 

## Diagram

## Recommended Use
Adapters are used to introduce compatibility between two previously incompatible 
classes.