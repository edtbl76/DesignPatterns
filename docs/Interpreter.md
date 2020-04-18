# Interpreter 

## Definition
Defines a representation for the grammar of a given language along w/ an
interpreter that uses the representation to interpret sentences/phrases
in that language. 

## Discussion
pattern is usually used to determine how to evaluate sentences in a 
language. 
- define a grammar to represent a language
- use the interpreter to handle that grammar.

## Implementation Details
- each class may represent a rule in the given language
    - should have a method to interpret an expression
    - more rules = more classes
 
CLIENT
- calls the interpret() method
- optionally builds a SYNTAX TREE based on the rules of the language

CONTEXT
- contains "global" information required by the interpreter

ABSTRACT EXPRESSION
- interface/abstraction
    - has an interpret method that must be impl'd by concrete
    expressions

TERMINAL EXPRESSION
- concrete impl of ABSTRACT EXPRESSION
    - doesn't need other expressions to interpret
    - "Leaf nodes" with the data structure

NONTERMINAL EXPRESSION<br>
(aka Alternation Expression, Repitition Expression, Sequence Expression)
- concrete impl of ABSTRACT EXPRESSION
    - composites that can contain both terminal or nonterminal expressions
    - calling the interpret method on this expression will also call it
    on all of its children

### FLOW
    
### BENEFITS
- full freedom over interpretation of expressions
- grammar can be extended/changed
- involved in HOW to define grammar, how phrases are represented/interpreted

### CHALLENGES
- massive amount of work.

## Diagram

## Recommended Use
- just about never. 


