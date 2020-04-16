package BehavioralPatterns.TheClassics.Iterator.DIYIterator;

public class Launcher {

    public static void main(String[] args) {
        Players players = new DefensivePlayers();
        Iterator iterator = players.iterator();
        System.out.println("Defensive Stats: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.first();
        System.out.println("Currently pointing back to : " + iterator.current());
    }
}
