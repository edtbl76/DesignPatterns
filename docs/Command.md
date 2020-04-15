# Command 

## Definition
Encapsulates a request as an object
- allows parameterization of clients w/ different requests, queues log requests
- supports undo/revert

## Discussion
encapsulate the method invocation process

## Implementation Details

INVOKER
- receives command object
- the invoker's methods wrap the command's methods. 
    - the client calls the invoker's method
    - the invoker's method calls the methods in the concrete command inherited via
    the method contract.  

CLIENT
- holds invoker and command objects
- passes command into invoker.
- makes decision
    - which command(s) to execute
    - passes command to invoker for that execution

COMMAND
- object that invokes the method of a receiver in a way that is specific to 
THAT receiver's class.
- passed to invoker to invoke command

RECEIVER
- contains method invoked by COMMAND object
- processes job
    - this is where the business logic actually exists. 
    

## FLOW
- client creates receiver
- client creates command
    - receiver passed in usually at creation time
- client creates invoker
    - command can be passed in via setter(lazy) or constructor (eager)

- client calls invoker execution method. 
    - invoker method wraps a method from concrete implementation of execution method
    extended/implemented from abstract class/interface method contract. 
        - concrete implementation of command is associated w/ a specific object
    - concrete implementation executes business logic contained in receiver.
    
### BENEFITS
- requests for creation are decoupled from the execution
    - clients are abstracted from HOW an invoker is doing its job
- supports creation of MACROS
    - a sequence of commands
- new commands are easier to add w/o affecting the existing system
- supports undo/redo operations

### CHALLENGES
- maintenance costs
    - more commands = more classes
- exceptions can be challenging to manage
    - hard to pass up to client from receiver (where the exception is going to be
    sourced)
    - especially hard in multithreaded environments


## Diagram

## Recommended Use



