# Decorator 

## Definition
The decorator allows the dynamic addition of new behaviors/functionality to classes.

## Discussion
This is a great example of the open-closed principle -  "a class must be closed for
modification but open for extension"  

Another way to put this is: we want to add new functionality without introducing any
unwanted side effects to existing functionalities.

Decorators are extremely flexible, because they provide a sort of "free-floating"
feature that isn't necessarily attached to a specific class. The feature can be
added to many different types of objects. 

Decorators operate on the principle of object composition vs. inheritance, which 
allows you to leverage that "free-floating" feature in a manner that affects 
the objects of your choice, without impacting the underlying 
subclasses. (open-closed principle -- check!)   

"Free-floating" means that we can select which decorator we want to use (within 
some limitations), creating the ability to dynamically add features to 
objects. 

That object or "component" must be "enclosed" by the decorator. This is where the 
similarities to the Proxy pattern show up. 
1. in order to enclose the component we want to talk to, we have to conform to the
same interface (very much like a Proxy)
2. we have to forward requests to the component (very much like a Proxy)

The two most obvious advantages are that we provide selective features that aren't as
rigid as subclassing/inheritance, and we can extend functionality many more times, and with 
much greater complexity than subclasses.

### COMPOSITION vs. INHERITANCE
This is one of the fundamental tradeoffs we are addressing with the Decorator pattern

Inheritance introduces a very TIGHT relationship between base and derived classes, 
because any change in the base may introduce unwanted side effects in the
derived. (Unwanted changes = busted code) and inheritance represents a static
(i.e. @compile time) relationship.

Composition loosens things up, by creating dynamic relationships because 
composition defines objects at runtime. 

HOW TO DECIDE WHEN TO USE EACH: <br>
- Inheritance follows the "is-a" relationship pattern
- Composition follows the "has-a" relationship pattern. 

The dynamic nature of decorators allow you to design them continuously after the
objects themselves are created. This is especially valuable in workflows and 
design paradigms where the architecture must evolve quickly to changing use cases. 
(This is critical to fast paced environments where new use cases emerge due
to dynamic business needs.)

## CHALLENGES
Proliferation. Due to the power and simplicity (as well as naive understandings of
the "single responsibility" paradigm) it is very easy for Decorators to become
challenging to manage.

## Implementation Details
ABSTRACT COMPONENT <br>
The abstract component is the "root" of the Decorator pattern. It provides
the interface/abstract methods to be implemented by Concrete Component(s)

CONCRETE COMPONENT <br>
This is the 'Subject' of the pattern. The implementation here extends the 
abstraction provided by the abstract component. 
- The features/code here are those that must be "closed for modification", yet we
still need to provide additional functionality

ABSTRACT DECORATOR <br>
This is the root of the decorator(s) being introduced to this pattern. This is 
where the Composition code lives, which is exec'd when one of the concrete
decorators is instantiated.

CONCRETE DECORATOR(S) <br>
Each Concrete Decorator should provide one (and only one) element of additional
functionality to the CONCRETE COMPONENT. 

## Diagram

## Recommended Use

