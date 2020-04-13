# Observer 

## Definition
An Observer defines a one:many cardinality between dependent objects. This allows a one-stop shopping pattern for
managing state such that we can update the state once in the Observer, and all of its dependent objects
automatically update their state to reflect the change from the Observer.

## Discussion
[This is also known as the publish-subscribe pattern]<br>
Observers register interest (i.e. subscribe) to a subject, such that when the
state of the data in the subject, changes, all of the observers are notified
of the change.

### BENEFITS
- subject and registered users (observers) are loosely coupled
    - they don't need to know each other explicitly
- registration/de-registration doesn't require any modification to the subjects
- independently add/remove observers at anytime. 

### CHALLENGES
- memory leak is a concern of any event-based system. 
    - (reg/dereg isnt performed properly)
- notification order isn't dependable


## Implementation Details
SUBJECT<br>
This is an object of interest that other objects want to watch

OBSERVER<br>
One of many objects that wants to "observe" the subject. 

## Diagram

## Recommended Use




