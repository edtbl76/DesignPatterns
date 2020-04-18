# Design Patterns
// TODO make some comments

## OOP
// Introduce OOP concepts.

## SOLID
// Introduce OOP concepts. 


# Creational Patterns
Creational Patterns are patterns that solve problems associated with
creating objects directly. 
- reducing complexity
- reducing boilerplate
- increasing flexibility/extensibility


## The Classics
By the classics, I'm referring to the patterns introduced in the 1994 book
"Design Patterns: Elements of Reusable Object-Oriented Software" by the "Gang of Four"
(Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides)


# Structural Patterns
These patterns leverage similarities between objects and/or their relationships to
simplify software design


## The Classics
By the classics, I'm referring to the patterns introduced in the 1994 book
"Design Patterns: Elements of Reusable Object-Oriented Software" by the "Gang of Four"
(Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides)


# Behavioral Patterns 
Behavioral patterns are focused on simplifications concerning the communication or
interaction of objects.


## The Classics
By the classics, I'm referring to the patterns introduced in the 1994 book
"Design Patterns: Elements of Reusable Object-Oriented Software" by the "Gang of Four"
(Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides)


## AntiPatterns


OVERUSE
- when devs try to use patterns at any cost regardless of whether or not it fits

GOD GLASS
- big object that tries to control almost everything w/ many unrelated methods
    - often happens to MEDIATOR
    
NOT INVENTED HERE
- the "I have to reinvent the wheel and rewrite my libraries" even though there are libs
already available. 

ZERO MEANS NULL
- when zero is treated as null
    - date issues
    - when lat/longitude doesnt use zero properly etc

GOLDEN HAMMER
- when devs believe T is always best even when a new system demands new learning
    - i.e. "I don't need to learn anything new as long as I can use T"
    
MANAGEMENT BY NUMBERS
- measuring quality by quantity

SHOOT THE MESSENGER
- avoid working w/ good testers, because they'll find more defects leading to 
missed deadlines

SWISS ARMY KNIFE
- demand a do-everything product/interface no matter how complicated

COPY AND PASTE PROGRAMMING
- copy old (similar) code and modify it to fit new problems
- violates DRY (technically)

ARCHITECTS DONT CODE
- when architects don't write code

HIDE AND HOVER
- don't expose edits/deletes until he/she hovers over the element

DISGUISED LINKS AND ADS
- earn revenue when users click a link/ad but can't get what they want

### TYPES 
ARCHITECTURAL 
- swiss army knife

DEVELOPMENT
- god class
- overuse of patterns

MANAGEMENT
- shoot the messenger

ORGANIZATIONAL
- architects dont code

UI
- Disguised Links/Ads


