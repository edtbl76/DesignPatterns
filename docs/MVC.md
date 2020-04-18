# MVC (Model View Controller) 

## Definition
used in web apps or powerful UIs. 
First described by Trygve Reenskaug in '79
Applications Programming in Smalltalk

## Discussion

## Implementation Details

MODEL
- the brain 
- manages data/business logic
- knows how to store/manage data
- knows how to handle requests from controller

VIEW
- represents the output
- PRESENTATION LAYER

CONTROLLER
- placed between model and view
    - acts like a mediator 
        - model and view can only communicate w/ each other through
        controller
   - separates how data is DISPLAYED from how data is CHANGED/MANIPULATED
- takes user input and passes REQUEST to model
- takes model RESPONSE and returns it to user 


VARIATIONS
- multiple views
- views can pass runtime values (i.e. JS) to controllers
- controller can validate user input
- controller can receive input in various ways
    - RESTful web requests
    - Form actions/data
- Model components can update view components

### FLOW
    
### BENEFITS
- high cohesion, low coupling
    - decouples model from view
    - supports extensibility/reusability 
- supports parallel development
- supports multiple runtime views.

### CHALLENGES
- requires high skill
    - devs usually need to be familiar w/ multiple languages/platforms/technologies
- not suitable for small apps
- "multiartifact consistency"
    - build/deploy/runtime dependency management

## Diagram

## Recommended Use


