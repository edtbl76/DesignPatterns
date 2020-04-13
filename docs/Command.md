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

## Diagram

## Recommended Use



