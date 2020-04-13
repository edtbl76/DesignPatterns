# Template Method

## Definition
defines the skeleton of an ALGORITHM in an operation
- final methods
    - owned by the abstraction, can't be overridden as they provide the
    structure of the algorithm
- Operations
    - methods defined in abstraction contract that MUST be overridden
- hooks
    - methods defined in abstraction contract that MAY be overridden

## Discussion
The definition really defines most of the concept. 
- we define the minimum/essential structure of an algorithm and then defer some
of the subcomponents/responsibilities to the subclasses. 

- The structure of the algorithm always remains the same, but the individual steps/
tasks can be overridden or adjusted. 

### BENEFITS

### CHALLENGES

## Implementation Details

### vs. BUILDER
- TemplateMethod = Behavioral
    - developer controls algorithm, but makes it available in a central location to be
    flexible. 
- Builder = Creational
    - customers control order of algorithm 

## Diagram

## Recommended Use
- multistep algorithms that have the same overrall structure, but allow for 
individual tasks to be modified (or generified through a method contract) for 
the purpose of deduplication of code, simplification of algorithmic complexity



