package BehavioralPatterns.TheClassics.Iterator.MoreComplicatedObject;

import java.util.Arrays;
import java.util.List;

public class PlayerRoster implements Roster {

    private List<Player> players;

    public PlayerRoster() {
        players = Arrays.asList(
                new Player("Irvin", "DE"),
                new Player("Green", "DE"),
                new Player("Reed", "DT"),
                new Player("Ford", "DT"),
                new Player("Wagner","LB"),
                new Player("Wright", "LB"),
                new Player("Kendricks", "LB"),
                new Player("Dunbar", "CB"),
                new Player("Griffin", "CB"),
                new Player("Diggs", "S"),
                new Player("MacDougald", "S")
        );


    }

    @Override
    public PlayerIterator iterator() {
        return new PlayerIterator(players);
    }
}
