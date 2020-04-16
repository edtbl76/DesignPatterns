package BehavioralPatterns.TheClassics.Iterator.DIYIterator;

import java.util.List;

public class DefenseIterator implements Iterator {

    private List<String> defensiveStatistics;
    private int position;

    public DefenseIterator(List<String> defensiveStatistics) {
        this.defensiveStatistics = defensiveStatistics;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        // Reminder that post incr/decr gets the value first and does the incr/decr after.
        return defensiveStatistics.get(position++);
    }

    @Override
    public String current() {
        return defensiveStatistics.get(position);
    }

    @Override
    public boolean hasNext() {
        return position < defensiveStatistics.size();
    }
}
