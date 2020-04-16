# Memento 

## Definition
Externalizes an object's internal state (without violating OOP principle of
encapsulation) so that the object can be restored to this state later.

## Discussion
This pattern is intended to restore an object to a previous state without
violating encapsulation.
- In most cases, objects encapsulate their states specifically so that they
aren't available to the outside world. 
- in this regards, exposing state would violate encapsulation.


### COMMAND vs. MEMENTO
Command pattern can undo actions that are stateless or are deterministic
(i.e. addition/subtraction, calculations etc.)

Memento undoes state changes. 

## Implementation Details

MEMENTO
- store's originator's state
    - history length is at the ORIGINATOR's discretion
- this can be a public class OR a static inner class of the originator. 


ORIGINATOR
- some object w/ internal state. 
- state is usually set() by a client. 

CARETAKER
- responsible for recording originator's state by requesting a memento
object from the originator

### FLOW
    
### BENEFITS
- if the caretaker stores a state history
    - you can walk back to a previous restore point, undoing each state change
    one at a time
    - you can restore to previous
    - you can restore to specified point (provided it is in the history)
- unwanted changes can be discarded at any time
- can restore to intended/stable state
- by copying the value between objects we aren't violating encapsulation
- "maintains high cohesion"
- simple recovery technique

### CHALLENGES
- many mementos has a storage penalty
    - pushes burden to caretaker/client (Proxy as a solution?)
    - increases maint. costs
- saving state decreases performance of the system.

## Diagram

## Recommended Use
- undo functionality.




