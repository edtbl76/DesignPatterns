package BehavioralPatterns.GoF.Iterator.JavaIterator;

// Abstract Aggregate
public interface Players {

    /*
        Rather than building our own Iterator interface, we'll borrow the one from java.
        - this means that the return type will be the concrete implementation we devise.
     */
    DefenseIterator iterator();
}
