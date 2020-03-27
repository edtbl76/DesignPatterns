# Proxy

## Definition
A proxy is a surrogate or placeholder for another object to control access to it.

## Discussion
A proxy is like a middle-man. It listens to client requests on behalf of the
actual/intended object. The proxy should behave in a manner that is transparent to 
the user/client, such that the client can't tell the difference between the
proxy and the intended object (were it actually able to speak to the latter.)

## Implementation Details
Proxy is concerned with "Subjects". The "Subject of the Proxy" is the object/class we
are trying to substitute for.

ABSTRACT SUBJECT <br>
The abstract subject is usually an abstract base class that defines the method
contracts. 

CONCRETE SUBJECT <br>
The concrete subject is the "true" subject. This is the object that we are acting
as a surrogate to. 

PROXY <br>
The proxy class extends the same parent as the Concrete Subject. 
It is most commonly implemented by creating a static reference to the concrete subject. 
This has two interesting side effects that create a "sub pattern"

1. lazy init w/ a static reference to the subject results in a many-to-one pattern 
where all proxy instances have references to the same subject instance. 
2. eager init w/ a static reference creates a 1:1 ratio, where each proxy holds a 
reference to its own subject. 

You're more likely to encounter the first pattern because it is much less expensive, 
even for trivial objects. 

The latter might be as a performance optimization to reduce the delay that is 
associated with lazy loading. That being said, it's still quite rare, because the lazy
loading of a static object is a one time cost, with a large gain in the storage you
aren't wasting for a bunch of objects. 

NOTE: in asynchronous/concurrent systems, even with lazy init, you have to monitor object 
count again as it is possible for race conditions or non-thread safe code to lead to
the unnecessary creation of unintended instances.

## Diagram

## Recommended Use
There are different categories of use as defined below. 

### Remote Proxies
Objects from a different address space are hidden or geographically separate.
- Good example is RMI (Remote Method Invocation). 

In most cases, clients will make a method call to a proxy object at the same
location that includes additional code to forward the request to the Subject in a 
separate location. (i.e. over a network or telco or satellite)

### Virtual Proxies
This is usually a performance optimization, specifically using a Proxy to 
lazy load objects that are expensive to risk eagerly loading. (This is
especially common when loading large objects that aren't practical to be
stored in memory... especially if they are just going to sit around waiting to
be used for hours or days)


### Protection Proxies
Protection proxies typically provide constraints or separation that adheres to 
security policy

### Smart References
These add support for useful features like tracing, logging, resource
management/cleanup, counters, etc. This is especially common when using 3rd party 
libraries that may not handle all of your use cases.