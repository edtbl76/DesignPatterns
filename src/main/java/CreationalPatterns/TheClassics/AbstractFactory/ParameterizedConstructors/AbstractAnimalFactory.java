package CreationalPatterns.TheClassics.AbstractFactory.ParameterizedConstructors;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public interface AbstractAnimalFactory {

    /*
        This is the same as before, but we are using a parameterized constructor.
        - This is kind of a silly example, but it illustrates some dependency on which creation depends.

        There are typically two ways we can obtain this kind of information
        1.) The information can be input driven (like this example)
            - this may be information that is provided directly from a user (depending on how close the service is to the
        front end), or it may be populated by a system call from a middleware service (depending on how close the
        service is to the BACK end)

        2.) Information can also be preconfigured through an init() method that is called from an empty constructor (
        or just a constructor that doesnt' specify parameters for the given information).

        - in these examples initialization can come from a stored configuration, or if creation is performed lazily,
        we'll obtain the information dynamically from some incoming source.

        Typically, when there is a parameter involved, vs. preconfiguration, we expect that there is a user-driven
        component to the dependency. I like to call these the "I wants". Preconfigured values, even those determined
        dynamically, tend to be more deterministic.

           Usually, preconfiguring through some other source is opted when you are selecting values that aren't
           explicitly required by the given call.

           For instance, let's say we have a program that requires the entry of some identification information (like
           an account number).

           If we required the account number as a parameter for every call as a parameter, it would be overkill to the
           users of our services. We want to simplify it as much as possible to promote usability and customer adoption.

           As a result, think carefully about what dependencies are absolutely required to create an object.

     */
    Canine createCanine(AnimalCoat animalCoat);
    Feline createFeline(AnimalCoat animalCoat);
}
