package BehavioralPatterns.GoF.Visitor.BareAndComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {

        // GRUNTS
        Grunt private1 = new Grunt("Gomer", "Pyle", "army", 1);
        Grunt private2 = new Grunt("Joe", "Bazooka", "army", 5);

        Grunt marine1 = new Grunt("Gung", "Ho", "marines", 14);
        Grunt marine2 = new Grunt("Semper", "Fi", "marines", 10);

        Grunt sailor1 = new Grunt("Dirty", "Sailor", "marines", 8);
        Grunt sailor2 = new Grunt("Jack", "Sparrow", "marines", 7);

        Grunt flyboy1 = new Grunt("Maverick", "Mitchell", "airforce", 27);
        Grunt flyboy2 = new Grunt("Goose", "DiesInTheMovie", "airforce", 8);

        // Officers
        Officer armyOfficer = new Officer("Kentucky", "Colonel", "army", 51);
        Officer marineOfficer = new Officer("Jake", "Jarhead", "marines", 11);
        Officer navyOfficer = new Officer("Admiral", "Akbar", "navy", 19);
        Officer airforceOfficer = new Officer("Tom", "Skerritt", "airforce", 12);

        // Commander-in-Chief
        Officer commanderInChief = new Officer("Bill", "Pullman", "all", 15);

        // Bind -em up
        armyOfficer.addAll(Arrays.asList(private1, private2));
        marineOfficer.addAll(Arrays.asList(marine1, marine2));
        navyOfficer.addAll(Arrays.asList(sailor1, sailor2));
        airforceOfficer.addAll(Arrays.asList(flyboy1, flyboy2));

        // CommInChief
        commanderInChief.addAll(Arrays.asList(armyOfficer, marineOfficer, navyOfficer, airforceOfficer));


        // **** Start ****
        commanderInChief.printChainOfCommand();

        // Build visitor and proxy  container to work with.
        Visitor visitor = new ConcreteVisitor();
        List<Soldier> soldierContainer = new ArrayList<>(commanderInChief.getSoldiers());
        soldierContainer.addAll(armyOfficer.getSoldiers());
        soldierContainer.addAll(marineOfficer.getSoldiers());
        soldierContainer.addAll(navyOfficer.getSoldiers());
        soldierContainer.addAll(airforceOfficer.getSoldiers());

        // Visit
        soldierContainer.forEach(soldier -> {
            soldier.accept(visitor);
        });
    }
}
