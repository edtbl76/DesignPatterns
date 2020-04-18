package BehavioralPatterns.GoF.Memento.InnerClass;


import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    public static void main(String[] args) {

        // Set up my objects
        List<Originator.Memento> history = new ArrayList<>();
        Originator originator = new Originator();
        Originator.Memento memento;

        // set state, save it, add it to history
        originator.setStateId(2);
        memento = originator.save(originator.getStateId());
        history.add(memento);

        // Do it again
        originator.setStateId(4);
        memento = originator.save(originator.getStateId());
        history.add(memento);

        // Again for some more history
        originator.setStateId(8);
        memento = originator.save(originator.getStateId());
        history.add(memento);

        // Roll back to start, 1 step at a time.
        for (int i = history.size(); i > 0; i--)
            originator.restore(history.get(i - 1));



    }
}
