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

## Implementation Details
SUBJECT<br>
This is an object of interest that other objects want to watch

OBSERVER<br>
One of many objects that wants to "observe" the subject. 

## Diagram

## Recommended Use




