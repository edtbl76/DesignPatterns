package BehavioralPatterns.GoF.Memento.UndoHistory;

public class Memento {

    private int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    /*
        NO SETTER!!!! Very important.
     */

}
