# Factory Method 

## Definition
- defines an interface for creating an object
- subclasses decide what class is instantiated
- allows instantiation of objects to be deferred to subclasses. 

## Discussion
Factory Methods (typically) require a hierarchical model of objects where 
specialized types of objects extend functionality from a skeletal root class.

    EX: Animal -> Dog,Cat,Wombat
    
This is especially useful when creating applications that might require 
support for various connection types.  

Two Fantastic Examples of Factory Methods in Java
- java.text.NumberFormat.getInstance()
- java.net.URLStreamHandlerFactory.createURLStreamHandler()

NOTE: There are many implementations that don't follow this pattern. 

    EX: XMLReaderFactory  (deprecated in favor of SAXParserFactory)
    
However, as my example above suggests, many of these implementations are
being deprecated in favor of the use of parallel hierarchies and an
abstract Creator. 

## Implementation Details

CLASS STRUCTURE <br>
The basic structure of the classes operated on is
- a skeletal interface that defines generic capabilities
- subclasses that define varying implementations of the capabilities

CREATOR <br>
The creator is an abstract class (or less common, an interface) that
- defines a generalized "creation" method (the factory method!)
    - the purpose of this method is that subclass specific factories can
    define the specific object to return 
    - this is the ENTIRE PURPOSE OF FACTORY METHOD
- does the heavy lifting of building the object or any setup work
    - this has to be abstracted in a manner that the creator knows
    how to do all of the work, but such that it is flexible enough to
    be performed against any of the underlying objects
    - this enables subclasses to choose instantiation details



### PROS
- separates code that should vary from code that shouldn't. 
- makes codebase easier to maintain
- reduces boilerplate and or duplicated code
- "closed for modification, open for extension"
    - loose coupling of specialized objects to allow extensibility
- using abstract classes/interfaces allows the creation of common/default
code when overrides are unnecessary
    - this is considered good development practices.

### CONS
- supportability for large numbers of classes
- complexity of parallel class hierarchies
    - Object Hierarchy mirrors Factory hierarchy 
    - This is mitigates by creating a varied implementation that doesn't 
    use inheritance. 
    
### Compared to SimpleFactory

Factory Method allows different subclasses of the Factory Method to 
create different objects. 

Simple Factory is one-stop shopping. It doesn't allow you to vary the 
resulting objects.
    - it only provides a concrete factory class, whereas Factory Method
    provides subclasses.

## Diagram

## Recommended Use
  