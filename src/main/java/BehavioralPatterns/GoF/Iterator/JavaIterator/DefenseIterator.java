package BehavioralPatterns.GoF.Iterator.JavaIterator;

import java.util.Iterator;
import java.util.List;

/*
    Rather than building our own root abstraction for the Iterator
 */
public class DefenseIterator implements Iterator<String> {

    private List<String> defensiveStatistics;
    private int position;

    public DefenseIterator(List<String> defensiveStatistics) {
        this.defensiveStatistics = defensiveStatistics;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public String current() {
        return defensiveStatistics.get(position);
    }

    /*
        The big difference here is that we are overriding two of the methods provided to us
        from Java's implementation.
     */
    @Override
    public boolean hasNext() {
        return position < defensiveStatistics.size();
    }

    @Override
    public String next() {
        return defensiveStatistics.get(position++);
    }
}
