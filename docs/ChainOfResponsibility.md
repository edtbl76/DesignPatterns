# Chain of Responsibility 

## Definition
decouples sender + receiver by giving more than one object a chance
to handle requests
- chains receiving objects, passing the request along the chain until
one of the objects handles it or it "falls off the edge"

## Discussion
create a chain of objects that are each capable of handling a particulra
kind of request. 
- if an object can't handle request, it passes request to next object in
chain.
- flexibly allows adding new handler to end of chain. 

## Implementation Details

### FLOW
    
### BENEFITS
- allows more than one object to handle a request
- links in the chain can be added/removed/reordered dynamically
    - trace objects based on how many issues that they handle and 
    order then from most frequent to least frequent. 
    - remove unused objects
    - add objects for issues that aren't handled.
- handlers only need to know what they do. 
    - they don't even need to know which specific handler comes next
    as the creation of the chain is external to the handlers.
- decouples senders of requests from the recipients.

### CHALLENGES
- no guarantee that a request is handled
- challenging to debug
- creates latency for requests handled by objects at the end of the chain
    - depth of the chain matters if it gets too long.


## Diagram

## Recommended Use



