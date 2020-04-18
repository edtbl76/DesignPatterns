package BehavioralPatterns.GoF.Iterator.DIYIterator;

public interface Iterator {

    // Reset to first
    void first();

    // get next
    String next();

    // get current
    String current();

    // Check if there is a next
    boolean hasNext();
}
