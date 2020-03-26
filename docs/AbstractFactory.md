# Abstract Factory 

## Definition
- provides an interface for creating families/trees of related/dependent objects
without specifying their concrete classes.

## Discussion
The Abstract Factory pattern is commonly referred to as a "Factory of Factories"
used to provide an additional layer of abstraction above the Factory Method 
pattern.  

Provides a way to collect and encapsulate similar individual factories.
- the creation of objects is delegated to the factory object

Similar to the "Simple Factory" method:
- Simple Factory creates a group of related objects
- Abstract Factory returns factories that create groups of related objects

### PROS
- abstracts implementation details of object creation from users
    - also promotes security.
- promotes inheritance
- provides a way to create groups of related objects without being tightly 
coupled to the concrete object classes. 

### CONS
- The biggest drawback of the Abstract Factory pattern is that any change we
make to the parent interfaces, must be propagated down to the implementations. 
    - This is a drawback of ANY interface. 
    - "program to an interface, not to an implementation"
- The design of an Abstract Factory is a bit complicated, which is a bit
counterintuitive to what design patterns are supposed to accomplish. The real
- violates open-closed principle of SOLID principles of Object-Oriented Programming.

NOTE: This open-closed prinicple is preserved by using factory method pattern that 
delegates object creation responsibilities to the subclasses that implement that
factory method. 

OPEN-CLOSE PRINCIPLE <br>
"software entities (classes, modules, functions, etc.)" should be open for 
extension, but closed for modification.
- This means that we can ADD behavior, without changing the source code. 



## Implementation Details

### Abstract Components
The Abstract components are responsible for defining the upper hierarchical
layer. 
They define groups of groups of objects

ABSTRACT OBJECT MODEL A, B ... <br>
This is typically an interface (or abstract base class) that defines a
category of objects

    In our example, we have two interfaces, Canine and Feline that define 
    a category of objects. 

NOTE: you may notice that both of those interfaces could technically extend
another even MORE generic interface because they are both using the same
member methods. 
- this isn't required. The methods can vary between each abstract object
model.


ABSTRACT FACTORY <br>
The abstract factory is responsible for building factories. It provides an
interface for the underlying implementations. 

## Concrete Components
Concrete Components are responsible for fulfilling the contracts set in
the interfaces. (I.e they provide the implementation)

CONCRETE FACTORY 1, 2 ... <br>
The concrete factory is responsible for building a separate subset of the
objects defined by the Abstract Object Model. 

    In our example:
    - 1 represents a factory that creates "wild" canines/felines
    - 2 represents a factory that creates "domesticated" canines/felines


CONCRETE OBJECT A1, B1, A1, B2 ... <br>
Concrete Objects are grouped according to two (or more) parent hierarchies.

    In our example: 
    1. they will implement the interfaces from the Abstract Object Model. 
        - IN our particular example Concrete Object 
            - A# refer to implementations of Canine. 
            - B# refer to implementations of Feline.
    2. the "numeral" in the examples above refers to the sub-category
        - #1 represents "wild" canines/felines
        - #2 represents "domesticated" canines/felines.

## Diagram

## Recommended Use
One of the values of the Abstract Factory is layering of object creation. 
- We enable the ability to create a complex hierarchy of objects without 
just creating a deep tree of objects that require long chains of 
inheritance that are hard to read/rationalize. 
- this is especially useful when we expect there to be a need to extend
the object hierarchy.
 