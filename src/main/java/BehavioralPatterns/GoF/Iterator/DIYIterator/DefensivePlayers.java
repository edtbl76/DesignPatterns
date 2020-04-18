package BehavioralPatterns.GoF.Iterator.DIYIterator;

import java.util.Arrays;
import java.util.List;

public class DefensivePlayers implements Players {

    private List<String> defensiveStats;

    public DefensivePlayers() {
        defensiveStats = Arrays.asList("Interceptions", "Tackles" , "Sacks");
    }

    @Override
    public Iterator iterator() {
        return new DefenseIterator(defensiveStats);
    }
}
