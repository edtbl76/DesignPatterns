package BehavioralPatterns.TheClassics.Iterator.MoreComplicatedObject;

import java.util.Iterator;
import java.util.List;

public class PlayerIterator implements Iterator<Player> {

    private List<Player> players;
    private int position;

    public PlayerIterator(List<Player> players) {
        this.players = players;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public Player current() {
        return players.get(position);
    }

    @Override
    public boolean hasNext() {
        return position < players.size();
    }

    @Override
    public Player next() {
        return players.get(position++);
    }
}
