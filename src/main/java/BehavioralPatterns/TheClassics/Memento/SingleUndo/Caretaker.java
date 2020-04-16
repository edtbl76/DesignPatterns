package BehavioralPatterns.TheClassics.Memento.SingleUndo;

public class Caretaker {

    public static void main(String[] args) {
        /*
            Caretaker is usually the client.
            - requests memento from originator to save internal state
            - passes memento back to originator.

            We are cheating by coping the data from one object to the next.
         */

        // Set up objects
        Originator originator = new Originator();
        Memento memento;

        // Set state, save it into a memento (Memento CAN NOT HAVE A SETTER!)
        originator.setStateId(10);
        memento = originator.save(originator.getStateId());

        // do it again.
        originator.setStateId(20);
        memento = originator.save(originator.getStateId());

        // Change state, but revert back to previous
        originator.setStateId(99);
        originator.restore(memento);

    }
}
